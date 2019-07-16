package com.zzy.book.dao;

import com.zzy.book.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zzy
 * @date 2019/6/21
 */
public class AppointmentDaoTest extends BaseTest {
    @Autowired
    private AppointmentDao appointmentDao;

    /**
     * 插入预约
     * @throws Exception
     */
    @Test
    public void testInsertAppointment() throws Exception{
        long bookId = 1004;
        long studentId = 1234679L;
        int insert = appointmentDao.insertAppointment(bookId,studentId);
        System.out.println("insert="+insert);
    }
    @Test
    public void testQueryByKeyWithBook()throws Exception{
        long bookId = 1004;
        long studentId = 1234679L;
       com.zzy.book.entity.Appointment  appointments = appointmentDao.queryByKeyWithBook(bookId,studentId);
        System.out.println(appointments);

    }
}
