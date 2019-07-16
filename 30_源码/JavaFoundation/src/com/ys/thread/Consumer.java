package com.ys.thread;
/**
 * 创建消费者线程
 * @author zzy
 * @date 创建时间：2019年6月4日
 */
public class Consumer implements Runnable {
	Person p = null;
	public Consumer(Person p){
		this.p = p;
	}
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			p.pop();
		}
	}
	
}
