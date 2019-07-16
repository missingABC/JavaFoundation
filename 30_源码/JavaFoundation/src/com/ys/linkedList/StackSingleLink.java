package com.ys.linkedList;
/**
 * 用单向链表实现栈
 * 栈的pop()方法和push()对应链表的在头部删除元素deleteHead()以及再头部增加元素addHead()
 * @author zzy
 * @date 创建时间：2019年4月15日
 */
public class StackSingleLink {
	private SingleLinkedList link;
	public StackSingleLink(){
		link = new SingleLinkedList();
	}
	/**
	 * 添加元素
	 * @param obj
	 */
	public void push(Object obj){
		link.addHead(obj);
	}
	/**
	 * 移除栈顶元素
	 * @return
	 */
	public Object pop(){
		Object obj = link.deleteHead();
		return obj;
	}
	/**
	 * 判空
	 * @return
	 */
	public boolean isEmpty(){
		return link.isEmpty();
	}
	public void display(){
		link.display();
	}
}
