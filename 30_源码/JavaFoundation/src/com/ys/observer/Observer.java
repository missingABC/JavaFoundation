package com.ys.observer;

/**
 * 定义观察者
 * 定义一个update方法，当被观察者调用notifyObserver方法时，观察者的update方法会被回调
 * @author zzy
 * @date 2019/6/11
 */
public interface Observer {
    public void update(String message);
}
