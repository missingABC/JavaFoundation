package com.zzy.book.dao;

import com.zzy.book.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.zzy.book.entity.Book;

import java.util.List;

/**
 * @author zzy
 * @date 2019/6/21
 */
public class BookDaoTest  extends BaseTest {
    @Autowired
    private BookDao bookDao;

    /**
     * 测试通过id查询
     * @throws Exception
     */
    @Test
    public void testQueryById() throws Exception{
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }
    @Test
    public void testQueryAll() throws Exception{
        List<Book> books = bookDao.queryAll(0,4);
        for(Book book : books){
            System.out.println(book);
        }
    }
    @Test
    public void testReduceNumber() throws Exception{
        long bookId = 1000;
        int update = bookDao.reduceNumber(bookId);
        System.out.println("update="+update);
    }
}
