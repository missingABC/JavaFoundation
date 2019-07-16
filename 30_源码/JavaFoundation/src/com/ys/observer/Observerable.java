package com.ys.observer;

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者的方法
 * @author zzy
 * @date 2019/6/11
 */
public interface Observerable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
