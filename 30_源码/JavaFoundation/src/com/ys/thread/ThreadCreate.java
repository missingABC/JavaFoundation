package com.ys.thread;
/**
 * 线程创建的三种方式
 * @author zzy
 * @date 创建时间：2019年6月3日
 */
public class ThreadCreate {
	public static void main(String[] args) {
		//Join joinThread = new Join();
		for (int i = 0; i < 10; i++) {
			System.out.println("main runing "+i);
			if(i==5){
				/*
				Thread1 th1 = new Thread1();
				th1.start();
				*/
				Thread2 th2 = new Thread2();
				Thread th = new Thread(th2);
				th.start();
			}
		}
	}
}
