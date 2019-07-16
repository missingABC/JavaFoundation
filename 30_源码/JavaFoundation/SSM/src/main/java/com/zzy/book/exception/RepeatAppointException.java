package com.zzy.book.exception;

/**
 * @author zzy
 * @date 2019/6/24
 */
public class RepeatAppointException extends RuntimeException{
    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
