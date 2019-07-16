package com.ys.stack;

import java.util.Arrays;
import java.util.EmptyStackException;


/**
 * 增强版栈，解决的问题，自动扩容，能存储不同类型的数据
 * @author zzy
 * @date 2019年4月14日
 */
public class ArrayStack {
	//定义数组为Object类型
	private Object[] elementData;
	//指向栈顶的指针
	private int top;
	private int size;
	/**
	 * 默认构造一个容量为10的栈
	 */
	public ArrayStack(){
		this.elementData = new Object[10];
		this.top = -1;
		this.size = 10;
	}
	/**
	 * 构造可自定义的容量的栈
	 * @param initialCapacity
	 */
	public ArrayStack(int initialCapacity){
		if(initialCapacity <0){
			throw new IllegalArgumentException("栈初始容量不能小于0："+initialCapacity);
		}
		this.elementData = new Object[initialCapacity];
		this.top = -1;
		this.size = initialCapacity;
	}
	/**
	 * 压栈
	 * @param item
	 * @return
	 */
	public Object push(Object item){
		//是否需要扩容
		isGrow(top+1);
		elementData[++top] = item;
		return item;
	}
	/**
	 * 弹出栈顶元素
	 * @return
	 */
	public Object pop(){
		Object obj = peek();
		remove(top);
		return obj;
	}
	/**
	 * 获取栈顶元素
	 * @return
	 */
	public Object peek(){
		if(top==-1){
			throw new EmptyStackException();
		}
		return elementData[top];
	}
	/**
	 * 判断栈是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return (top==-1);
	}
	/**
	 * 删除栈顶元素
	 * @param top
	 */
	public void remove(int top){
		//栈顶元素置为null
		elementData[top] = null;
		this.top--;
	}
	/**
	 * 是否需要扩容，如果需要，扩大一倍，返回true，不需要返回false
	 * @param minCapacity
	 * @return
	 */
	public boolean isGrow(int minCapacity){
		int oldCapacity = size;
		//如果当前元素压入栈之后总容量大于前面定义的容量，则需要扩容
		if(minCapacity >= oldCapacity){
			int newCapacity = 0;
			//栈容量扩大两倍(左移一位)看是否超过int类型的最大范围。
			if((oldCapacity<<1)-Integer.MAX_VALUE>0){
				newCapacity = Integer.MAX_VALUE;
			}else{
				newCapacity = (oldCapacity<<1);
			}
			this.size = newCapacity;
			int[] newArray = new int[size];
			elementData = Arrays.copyOf(elementData,size);
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push("abc");
		System.out.println(stack.peek());
//		stack.pop();
//		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		testStringReversal();
		testMatch();
	}
	/**
	 * 利用栈的后进先出特性，进行字符串的反转
	 */
	public static void testStringReversal(){
		ArrayStack stack = new ArrayStack();
		String str = "How are you";
		char[] cha = str.toCharArray();
		for(char c: cha){
			stack.push(c);
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}
	}
	/**
	 * 利用栈判断分隔符是否匹配
	 */
	public static void testMatch(){
		ArrayStack stack = new ArrayStack();
		String str = "12<a[b{c}]>";
		char[] cha = str.toCharArray();
		for(char c:cha){
			switch(c){
			case'{':
			case'[':
			case'<':
				stack.push(c);
				break;
			case'}':
			case']':
			case'>':
				if(!stack.isEmpty()){
					char ch = stack.pop().toString().toCharArray()[0];
					if(c=='}' && ch != '{'
		                    || c==']' && ch != '['
		                    || c==')' && ch != '('){
						System.out.println("Error:"+ch+"-"+c);
					}
				}
				break;
			default:break;
			}
		}
	}
}
