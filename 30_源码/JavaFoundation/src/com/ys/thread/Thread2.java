package com.ys.thread;
/**
 * ʵ��runnable�ӿ�
 * @author zzy
 * @date ����ʱ�䣺2019��6��3��
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
