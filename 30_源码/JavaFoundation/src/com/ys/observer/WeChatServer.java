package com.ys.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务
 * 实现了Observeable接口，对其中的三个方法进行实现
 * @author zzy
 * @date 2019/6/11
 */
public class WeChatServer implements Observerable {
    //面向接口编程，而不是面向实现
    private List<Observer> list;
    private String message;

    public WeChatServer() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()){
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<list.size();i++){
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public void setInfomation(String s){
        this.message = s;
        System.out.println("微信服务更新消息："+s);
        //消息更新通知所有观察者
        notifyObserver();
    }

}
