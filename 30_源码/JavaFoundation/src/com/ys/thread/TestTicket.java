package com.ys.thread;

public class TestTicket {
	public static void main(String[] args) {
		//�̳�Thread��
		TicketSell t1 = new TicketSell("A����");
		TicketSell t2 = new TicketSell("B����");
		TicketSell t3 = new TicketSell("C����");
		//ʵ��Runnable��ʽ
		TicketSellRunnable t = new TicketSellRunnable();
//		Thread t1 = new Thread(t,"A����");
//		Thread t2 = new Thread(t,"B����");
//		Thread t3 = new Thread(t,"C����");
//		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
