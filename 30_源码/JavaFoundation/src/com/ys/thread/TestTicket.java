package com.ys.thread;

public class TestTicket {
	public static void main(String[] args) {
		//继承Thread类
		TicketSell t1 = new TicketSell("A窗口");
		TicketSell t2 = new TicketSell("B窗口");
		TicketSell t3 = new TicketSell("C窗口");
		//实现Runnable方式
		TicketSellRunnable t = new TicketSellRunnable();
//		Thread t1 = new Thread(t,"A窗口");
//		Thread t2 = new Thread(t,"B窗口");
//		Thread t3 = new Thread(t,"C窗口");
//		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
