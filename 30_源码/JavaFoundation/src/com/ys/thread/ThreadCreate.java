package com.ys.thread;
/**
 * �̴߳��������ַ�ʽ
 * @author zzy
 * @date ����ʱ�䣺2019��6��3��
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
