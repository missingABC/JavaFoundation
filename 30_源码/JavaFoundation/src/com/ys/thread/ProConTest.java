package com.ys.thread;

public class ProConTest {
	public static void main(String[] args) {
		Person per = new Person();
		Producer p = new Producer(per);
		Consumer c = new Consumer(per);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
