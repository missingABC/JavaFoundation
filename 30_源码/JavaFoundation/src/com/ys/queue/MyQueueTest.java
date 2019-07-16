package com.ys.queue;

public class MyQueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue(3);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		System.out.println(queue.peekFront());
		queue.remove();
		System.out.println(queue.peekFront());
		queue.insert(4);
		queue.insert(5);
	}
}
