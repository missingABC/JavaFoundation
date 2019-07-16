package com.zzy.book.exception;

/**内存不足异常
 * @author zzy
 * @date 2019/6/24
 */
public class NoNumberException extends RuntimeException{
    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
