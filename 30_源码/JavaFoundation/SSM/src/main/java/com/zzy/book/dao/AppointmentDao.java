package com.zzy.book.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author zzy
 * @date 2019/6/21
 */
public interface AppointmentDao {
    /**
     * 插入预约的图书记录
     * @param bookId
     * @param studentId
     * @return
     */
    int insertAppointment(@Param("bookId")long bookId, @Param("studentId")long studentId);

    /**
     * 通过主键查询预约图书记录 并携带图书实体
     * @param bookId
     * @param studentId
     * @return
     */
    com.zzy.book.entity.Appointment  queryByKeyWithBook(@Param("bookId")long bookId,@Param("studentId") long studentId);
}

