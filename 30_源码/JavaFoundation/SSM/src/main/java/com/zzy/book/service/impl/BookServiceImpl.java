package com.zzy.book.service.impl;


import com.zzy.book.dao.AppointmentDao;
import com.zzy.book.entity.Appointment;
import com.zzy.book.dao.BookDao;
import com.zzy.book.dto.AppointExecution;
import com.zzy.book.entity.Book;
import com.zzy.book.enums.AppointStateEnum;
import com.zzy.book.exception.AppointExeption;
import com.zzy.book.exception.NoNumberException;
import com.zzy.book.exception.RepeatAppointException;
import com.zzy.book.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zzy
 * @date 2019/6/24
 */
@Service
public class BookServiceImpl implements BookService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //注入service依赖
    @Autowired
    private BookDao bookDao;

    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    @Override
    public List<Book> getList() {
        return bookDao.queryAll(0,1000);
    }

    @Override
    @Transactional
    public AppointExecution appoint(long bookId, long studentId) {
        try{
            int update = bookDao.reduceNumber(bookId);
            if(update<=0){
                throw new NoNumberException("no number");
            }else {
                //执行预约操作
                int insert = appointmentDao.insertAppointment(bookId,studentId);
                if(insert <=0){//重复预约
                    throw new RepeatAppointException("repeat appoint");
                }else {//预约成功
                    Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
                }

            }
        }catch (NoNumberException e1){
            throw e1;
        }catch (RepeatAppointException e2){
            throw  e2;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw new AppointExeption("appoint inner :"+e.getMessage());
        }
    }
}
