package com.ys.thread;

public class TicketSellRunnable implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			sell();//2ʹ��ͬ������
		}
	}
	//ͬ������
	private synchronized void sell(){
		if(num>0){
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"����һ��Ʊ��ʣ��"+(--num)+"��");
		}
	}

}
