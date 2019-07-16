package com.zzy.book.service;

import com.zzy.book.dto.AppointExecution;
import com.zzy.book.entity.Book;


import java.util.List;

/** 业务接口 站在使用者设计角度
 * @author zzy
 * @date 2019/6/24
 */
public interface BookService {
    /**
     * 查询一本书
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     * @return
     */
    List<Book> getList();

    /**
     * 预约图书
     * @param bookID
     * @param studentId
     * @return
     */
    AppointExecution appoint(long bookID,long studentId);
}
