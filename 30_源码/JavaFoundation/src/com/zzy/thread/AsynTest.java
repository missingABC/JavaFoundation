package com.zzy.thread;

public class AsynTest {
	public static void main(String[] args) {
		AsyncExecuter.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println("异步执行..");
			}
		});
	}
}
