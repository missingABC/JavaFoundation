package com.ys.linkedList;

import org.w3c.dom.Node;

/**
 * 单向链表的具体实现
 * @author zzy
 * @date 创建时间：2019年4月15日
 */
public class SingleLinkedList {
	//链表节点的个数
	private int size;
	//头节点
	private Node head;
	public SingleLinkedList(){
		size = 0;
		head = null;
	}
	/**
	 * 链表的每个节点类
	 * @author zzy
	 * @date 创建时间：2019年4月15日
	 */
	private class Node{
		//每个节点的数据
		private Object data;
		private Node next;
		public Node(Object data){
			this.data = data;
		}
	}
	/**
	 * 在链表头添加数据
	 * @param obj
	 * @return 返回该数据
	 */
	public Object addHead(Object obj){
		Node newHead = new Node(obj);
		if(size == 0){
			head = newHead;
		}else{
			newHead.next = head;
			head = newHead;
		}
		size++;
		return obj;
	}
	/**
	 * 删除链表头数据
	 * @return
	 */
	public Object deleteHead(){
		Object obj = head.data;
		head = head.next;
		size --;
		return obj;
	}
	/**
	 * 查找指定元素，
	 * @param obj
	 * @return找到返回节点，找不到返回null
	 */
	public Node find(Object obj){
		Node current = head;
		int tempSize = size;
		while(tempSize>0){
			if(obj.equals(current.data)){
				return current;
			}else{
				current = current.next;
			}
			tempSize --;
		}
		return null;
	}
	/**
	 * 删除指定的元素
	 * @param value
	 * @return 删除成功返回true 否则false
	 */
	public boolean delete(Object value){
		if(size ==0){
			return false;
		}
		Node current = head;
		Node previous = head;
		while(current.data != value){
			if(current.next == null){
				return false;
			}else{
				previous = current;
				current = current.next;
			}
		}
		//如果删除的节点是第一个节点
		if(current == head){
			head = current.next;
			size --;
		}else{
			previous.next = current.next;
			size --;
		}
		return true;
	}
	/**
	 * 判断链表是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return (size == 0);
	}
	/**
	 * 
	 * 显示节点信息
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
				}else {
					System.out.print(node.data+"->");
				}
				node = node.next;
				tempSize--;
			}
			System.out.println();
		}else{
			System.out.println("[]");
		}
	}
	/**
	 * 
	 */
	public static void main(String[] args) {
		SingleLinkedList singleList = new SingleLinkedList();
		singleList.addHead("A");
		singleList.addHead("B");
		singleList.addHead("C");
		singleList.addHead("D");
		singleList.display();
		singleList.delete("C");
		singleList.display();
		System.out.println(singleList.find("B"));
	}
	
}
