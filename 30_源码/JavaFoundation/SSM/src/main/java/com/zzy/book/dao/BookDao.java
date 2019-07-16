package com.zzy.book.dao;

import com.zzy.book.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zzy
 * @date 2019/6/21
 */
public interface BookDao {
    /**
     * 通过di查询图书
     * @param id
     * @return
     */
    Book queryById(long id);

    /**
     * 查询所有图书
     * @param offset
     * @param limit
     * @return
     */
    List<Book> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 减少馆藏数量
     * @param bookId
     * @return
     */
    int reduceNumber(long bookId);
}
