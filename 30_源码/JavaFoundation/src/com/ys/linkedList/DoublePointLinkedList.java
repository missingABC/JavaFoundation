package com.ys.linkedList;

import org.w3c.dom.Node;

/**
 * 双端链表的实现
 * @author zzy
 * @date 创建时间：2019年4月16日
 * 
 * 链表实现使用内部类的原因：
 * 1.内部类+接口可实现多继承
 * 内部类完全对外透明，可调用访问
 */
public class DoublePointLinkedList {
	/**头节点*/
	private Node head;
	/**尾节点*/
	private Node tail;
	/**节点个数*/
	private int size;
	
	private class Node{
		private Object data;
		private Node next;
		public Node(Object data){
			this.data = data;
		}
	}
	public DoublePointLinkedList(){
		size = 0;
		head = null;
		tail = null;
	}
	
	/**
	 * 链表头新增节点
	 * @param data
	 */
	public void addHead(Object data){
		Node node = new Node(data);
		if(size==0){//如果链表为空，那么头节点和尾节点都是该新增节点
			head = node;
			tail = node;
			size++;
		}else{
			node.next = head;
			head = node;
			size++;
		}
	}
	/**
	 * 链表尾新增节点
	 * @param data
	 */
	public void addTail(Object data){
		Node node = new Node(data);
		if(size ==0){
			head = node;
			tail = node;
			size ++;
		}else{
			tail.next = head;
			tail = node;
			size++;
		}
	}
	
	/**
	 * 删除头部节点
	 * @return
	 */
	public boolean deleteHead(){
		if(size==0){//当前节点为0
			return false;
		}
		if(head.next == null){//当前节点为1
			head = null;
			tail = null;
		}else{
			head = head.next;
		}
		size--;
		return true;
	}
	/**
	 * 判空
	 * @return
	 */
	public boolean isEmpty(){
		return (size ==0);
	}
	/**
	 * 获得节点个数
	 * @return
	 */
	public int getSize(){
		return size;
	}
	/**
	 * 打印节点信息
	 */
	public void display(){
		if(size>0){
			Node node = head;
			int tempSize = size;
			if(tempSize == 1){
				System.out.println("["+node.data+"]");
				return;
			}
			while(tempSize>0){
				if(node.equals(head)){
					System.out.print("["+node.data+"->");
				}else if(node.next == null){
					System.out.print(node.data+"]");
				}else{
					System.out.print(node.data+"->");
				}
				node = node.next;
				tempSize --;
			}
			System.out.println();
		}else{//如果一个节点都没有，直接打印
			System.out.println("[]");
		}
	}
	
}
