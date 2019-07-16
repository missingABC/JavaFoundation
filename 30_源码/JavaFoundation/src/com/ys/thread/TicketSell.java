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
			
			//synchronized(this.getClass()){//1ʹ��ͬ������� ��֤�̰߳�ȫ
			//3ʹ��������
			l.lock();
				if(num>0){
					try {
						sleep(10);//ģ���Ʊʱ��
						System.out.println(this.currentThread().getName()+"����һ��Ʊ��ʣ��"+(--num)+"��");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						//�ͷ���
						l.unlock();
					}
				}
			//}
		}
	}
}
