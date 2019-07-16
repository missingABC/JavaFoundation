package com.ys.linkedList;
/**
 * 用双端链表实现队列(先进先出)
 * @author zzy
 * @date 创建时间：2019年4月17日
 */
public class QueueLinkedList {
	private DoublePointLinkedList dp;
	/**创建一个双端链表实例对象，通过构造方法创建*/
	public QueueLinkedList(){
		dp = new DoublePointLinkedList();
	}
	/**
	 * 队列的插入，队列在后端插入，对应就是在链表的尾部插入
	 * @param obj
	 */
	public void insert(Object obj){
		dp.addTail(obj);
	}
	/**
	 * 队列删除元素，从对头删除，对应的就是在链表删除头部节点
	 */
	public void delete(){
		dp.deleteHead();
	}
	/**
	 * 队列判空，直接引用链表的判空方法即可
	 * @return
	 */
	public boolean isEmpty(){
		return dp.isEmpty();
	}
	/**
	 * 查看队列元素个数
	 * @return
	 */
	public int getSize(){
		return dp.getSize();
	}
	/**
	 * 打印队列元素信息
	 */
	public void display(){
		dp.display();
	}
}
