package com.ys.linkedList;

import org.w3c.dom.Node;
/**
 * 有序链表
 * @author zzy
 * @date 创建时间：2019年4月17日
 */
public class OrderLinkedList {
	private Node head;
	private class Node{
		private int data;
		private Node next;
		public Node(int data){
			this.data = data;
		}
	}
	public OrderLinkedList(){
		head = null;
	}
	/**
	 * 插入节点，按照从小到大的顺序排列
	 * @param value
	 */
	public void insert(int value){
		Node node = new Node(value);
		Node pre = null;
		Node current = head;
		while(current != null && value>current.data){
			pre = current;
			current = current.next;
		}
		if(pre == null){
			head = node;
		}else{
			pre.next = node;
			node.next = current;
		}
	}
	/**
	 * 删除头节点
	 */
	public void deleteHead(){
		head = head.next;
	}
	/**
	 * 打印元素
	 */
	public void display(){
		Node current = head;
		while(current !=null){
			System.out.println(current.data+" ");
			current = current.next;
		}
		System.out.println(" ");
	}
	
}
