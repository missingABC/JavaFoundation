package com.ys.thread;
/**
 * 使用匿名内部类
 * @author zzy
 * @date 创建时间：2019年6月3日
 */
public class Thread3 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("main runing "+i);
			if(i==5){
				new Thread(new Runnable(){
					@Override
					public void run() {
						for (int j = 0; j < 10; j++) {
							System.out.println("Thread running"+j);
						}
					}
				}).start();
			}
		}
	}
}
