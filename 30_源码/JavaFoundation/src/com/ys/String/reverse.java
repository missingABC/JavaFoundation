package com.ys.String;

import java.util.Stack;

/**
 * �ַ�����ת
 * @author zzy
 * @date ����ʱ�䣺2019��5��17��
 */
public class reverse {
	public static void main(String[] args) {
		String str = "Hello123WW";
		reverse1(str);
		System.out.println("StringBuilder:"+reverse1(str));
		System.out.println("toCharArray:"+reverse2(str));
		System.out.println("charAt:"+reverse3(str));
		//���� String �� toCharArray �����Ƚ��ַ���ת��Ϊ char �������飬
		System.out.println("recursion:"+reverse4(str));
		System.out.println("Stack:"+reverse5(str));
		
		int f = 50;
		int g = 60;
		//f = f^g;//f ^= g;
		//g = f^g;//g ^= f;
		//f = f^g;
		//f = f^g^g; 
		f = g^f;
		System.out.println(f);
		//String�ೣ�õķ���
		String strs = "Hello";
		str.length();
		
		String start = "2019-05-13";
		start = start.replace("-", "");
		System.out.println(start);
		
	}
	private static String reverse1(String str){
		return new StringBuilder(str).reverse().toString();
	}
	/**
	 * str��toCharArray����
	 * @param str
	 * @return
	 */
	private static String reverse2(String str){
		char[] chars = str.toCharArray();
		String reverse = "";
		for(int i=chars.length-1;i>=0;i--){
			reverse +=chars[i];
		}
		return reverse;
	}
	/**
	 * ����str��charAt()
	 * @param str
	 * @return
	 */
	private static String reverse3(String str){
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--){
			reverse += str.charAt(i);
		}
		return reverse;
	}
	//�ݹ�
	private static String reverse4(String str){
		int length = str.length();
		if(length <= 1){
			return str;
		}
		String left = str.substring(0, length/2);
		String right = str.substring(length/2,length);
		return reverse4(right)+reverse4(left);
	}
	/**
	 * ����ջ�ĺ���ȳ����Խ���
	 * @param s
	 * @return
	 */
	private static String reverse5(String s){
		char[] str = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++){
			stack.push(str[i]);
		}
		String reverse = "";
		for(int i=0;i<s.length();i++){
			reverse +=stack.pop();
		}
		return reverse;
		
	}
}
