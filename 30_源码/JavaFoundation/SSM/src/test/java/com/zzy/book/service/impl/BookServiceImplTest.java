package com.zzy.book.service.impl;

import com.zzy.book.BaseTest;
import com.zzy.book.dto.AppointExecution;
import com.zzy.book.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zzy
 * @date 2019/6/24
 */
public class BookServiceImplTest extends BaseTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception{
        long bookId = 1001;
        long studentId = 12345678910L;
        AppointExecution execution = bookService.appoint(bookId,studentId);
        System.out.println(execution);
    }
}
