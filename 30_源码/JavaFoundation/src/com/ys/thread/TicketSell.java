package com.ys.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class TicketSell extends Thread {
	private static int num = 50;
	Lock l = new ReentrantLock();
	public TicketSell(String str){
		super(str);
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			
			//synchronized(this.getClass()){//1使用同步代码块 保证线程安全
			//3使用锁机制
			l.lock();
				if(num>0){
					try {
						sleep(10);//模拟出票时间
						System.out.println(this.currentThread().getName()+"卖出一张票，剩余"+(--num)+"张");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						//释放锁
						l.unlock();
					}
				}
			//}
		}
	}
}
