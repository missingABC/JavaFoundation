package com.ys.thread;

public class Person {
	private String name;
	private int age;
	//表示共享资源是否为空，如果为true表示生产，如果为false表示有数据 不要生产
	private boolean isEmpty = true;
	/**
	 * 生产数据--生产者
	 * @param name
	 * @param age
	 */
	public synchronized void push(String name,int age){//将name和age捆绑一体
		try {
			while(!isEmpty){
				//有数据 不用生产
				this.wait();
			}
			//生产数据
			this.name = name;
			//这段延时代码的作用是可能只生产了 name，age为nul，消费者就拿去消费了
			Thread.sleep(10);
			this.age = age;
			//生产数据结束
			isEmpty = false;//生产完毕，唤醒消费者
			this.notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 取数据--消费者
	 */
	public synchronized void pop(){
		try {
			while(isEmpty){
				this.wait();
			}
			//--消费开始
			Thread.sleep(10);
			System.out.println(this.name+" "+this.age);
			//消费结束
			isEmpty = true;
			this.notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
