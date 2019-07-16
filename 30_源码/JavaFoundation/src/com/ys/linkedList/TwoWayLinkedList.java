package com.ys.linkedList;

import org.w3c.dom.Node;

public class TwoWayLinkedList {
	/**链表头*/
	private Node head;
	/**链表尾*/
	private Node tail;
	/**链表节点个数*/
	private int size;
	private class Node{
		//数据
		private Object data;
		//后一个节点
		private Node next;
		//前一个节点
		private Node prev;
		public Node(Object obj){
			this.data = obj;
		}
	}
	public TwoWayLinkedList(){
		size = 0;
		head = null;
		tail = null;
	}
	/**
	 * 链表头增加节点
	 * @param obj
	 */
	public void addHead(Object obj){
		Node newNode = new Node(obj);
		if(size ==0){
			head = newNode;
			tail = newNode;
			size++;
		}else{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
			size++;
		}
	}
	/**
	 * 在链表尾增加节点
	 * @param obj
	 */
	public void addTail(Object obj){
		Node newNode = new Node(obj);
		if(size ==0){
			head = newNode;
			tail = newNode;
			size++;
		}else{
			newNode.prev = tail;
			tail.next = newNode;
			size++;
		}
	}
	/**
	 * 删除表尾
	 * @return
	 */
	public Node deleteHead(){
		Node temp = head;
		if(size!=0){
			head = head.next;
			head.prev = null;
			size--;
		}
		return temp;
	}
	/**
	 * 删除表尾
	 * @return
	 */
	public Node deleteTail(){
		Node temp = tail;
		if(size!=0){
			tail = tail.prev;
			tail.next = null;
			size--;
		}
		return temp;
	}
	/**
	 * 获得链表个节点个数
	 * @return
	 */
	public int getSize(){
		return size;
	}
	/**
	 * 判空
	 * @return
	 */
	public boolean isEmpty(){
		return (size==0);
	}
	/**
	 * 打印
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
				tempSize--;
			}
		}else{
			System.out.println("[]");
		}
	}

}
