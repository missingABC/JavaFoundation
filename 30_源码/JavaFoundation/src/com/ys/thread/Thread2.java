package com.ys.thread;
/**
 * 实现runnable接口
 * @author zzy
 * @date 创建时间：2019年6月3日
 */
public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("thread runing "+i);
		}
	}

}
