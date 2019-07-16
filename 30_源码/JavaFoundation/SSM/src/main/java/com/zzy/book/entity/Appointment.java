package com.zzy.book.entity;

import java.time.LocalDateTime;

/**
 * @author zzy
 * @date 2019/6/21
 */
public class Appointment {
    private long bookId;
    private long studentId;
    private LocalDateTime appointment;
    private Book book;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getAppointment() {
        return appointment;
    }

    public void setAppointment(LocalDateTime appointment) {
        this.appointment = appointment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "bookId=" + bookId +
                ", studentId=" + studentId +
                ", appointment=" + appointment +
                ", book=" + book +
                '}';
    }
}
