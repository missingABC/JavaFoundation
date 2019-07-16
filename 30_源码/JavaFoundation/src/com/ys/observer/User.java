package com.ys.observer;

/**
 * @author zzy
 * @date 2019/6/11
 */
public class User implements Observer {
    private String name;
    private String message;

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public User(String name) {
        this.name = name;
    }
    public void read(){
        System.out.println(name+"收到消息："+message);
    }
}
