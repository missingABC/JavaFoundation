package com.ys.thread;

public class TicketSellRunnable implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			sell();//2使用同步方法
		}
	}
	//同步方法
	private synchronized void sell(){
		if(num>0){
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"卖出一张票，剩余"+(--num)+"张");
		}
	}

}
