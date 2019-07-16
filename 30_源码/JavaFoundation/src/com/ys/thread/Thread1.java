package com.ys.thread;
/**
 * 基层Thread类 复写run方法
 * @author zzy
 * @date 创建时间：2019年6月3日
 */
public class Thread1 extends Thread {

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("thread runing "+i);
		}
	}
} 

