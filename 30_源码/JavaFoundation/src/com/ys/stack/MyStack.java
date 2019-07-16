package com.ys.stack;
/**
 * Java模拟简单的顺序栈实现
 * @author zzy
 * @date 2019年4月13日
 */
public class MyStack {
	private int[] array;
	private int maxSize;
	private int top;
	public MyStack(int size){
		this.maxSize = size;
		array = new int[size];
		top = -1;
	}
	/**
	 * 压栈
	 * @param value压入的数据
	 */
	public void push(int value){
		if(top<maxSize-1){
			array[++top] = value;
		}
	}
	/**
	 * 弹出栈顶数据
	 * @return
	 */
	public int pop(){
		return array[top--];
	}
	/**
	 * 访问栈顶元素
	 * @return栈顶
	 */
	public int peek(){
		return array[top];
	}
	/**
	 * 判断栈是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return (top==-1);
	}
	/**
	 * 判断栈是否为满栈
	 * @return
	 */
	public boolean isFull(){
		return (top == maxSize-1);
	}
	
	
	public static void main(String[] args) {
		MyStack stack = new MyStack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek());
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}

}
