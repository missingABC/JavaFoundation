package com.ys.queue;
/**
 * 单向队列
 * @author zzy
 * @date 创建时间：2019年4月15日
 */
public class MyQueue {
	private Object[] queArray;
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	public MyQueue(int s){
		maxSize = s;
		queArray = new Object[maxSize];
		front = 0;
		rear = -1;
		nItems = 0; 
	}
	/**
	 * 队列新增数据
	 * @param value
	 */
	public void insert(int value){
		if(isFull()){
			System.out.println("队列已满");
		}else{
			//如果队列尾部指向顶了，那么循环回来，执行队列的第一个元素
			if(rear == maxSize-1){
				rear = -1;
			}
			queArray[++rear] = value;
			nItems++;
		}
	}
	/**
	 * 移除数据
	 * @return
	 */
	public Object remove(){
		Object removeValue = null;
		if(!isEmpty()){
			removeValue = queArray[front];
			queArray[front] = null;
			front++;
			if(front==maxSize){
				front = 0;
			}
			nItems--;
			return removeValue;
		}
		return removeValue;
	}
	/**
	 * 查看对头数据
	 * @return
	 */
	public Object peekFront(){
		return queArray[front];
	}
	/**
	 * 判断队列是否满了
	 * @return
	 */
	public boolean isFull(){
		return (nItems == maxSize);
	}
	/**
	 * 判断队列是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return (nItems == 0);
	}
	/**
	 * 返回队列的大小
	 * @return
	 */
	public int getSize(){
		return nItems;
	}
	
}
