package com.ys.observer;

/**
 * @author zzy
 * @date 2019/6/11
 */
public class ObserverTest {
    public static void main(String[] args) {
        WeChatServer server = new WeChatServer();
        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("观察者模式测试开始");
        System.out.println("----------------");
        server.removeObserver(userZhang);
        server.setInfomation("观察者模式测试结束");

    }
}
