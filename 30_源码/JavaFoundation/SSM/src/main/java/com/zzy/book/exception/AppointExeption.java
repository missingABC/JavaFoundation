package com.zzy.book.exception;

/**预约业务异常
 * @author zzy
 * @date 2019/6/24
 */
public class AppointExeption extends RuntimeException {
    public AppointExeption(String message) {
        super(message);
    }

    public AppointExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
