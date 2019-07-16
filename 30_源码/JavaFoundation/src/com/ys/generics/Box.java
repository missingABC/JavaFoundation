package com.ys.generics;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Box<T> {
	private T box;
	public T getBox(T t){
		this.box = t;
		return t;
	}
	public void getType(){
		System.out.println("T的类型为："+box.getClass().getName());
	}
	public static void main(String[] args) {
		Box box = new Box();
		System.out.println(box.getBox(1));
		box.getType();
		System.out.println(box.getBox("Tom"));
		box.getType();
		
		String str = new String("Aa");
		byte[] strASCII;
		try {
			strASCII = str.getBytes("ASCII");
			System.out.println(Arrays.toString(strASCII));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String aa = "As国防生";//和newString的区别
		byte[] strByte;
		try {
			strByte = aa.getBytes("GBK");
			System.out.println(Arrays.toString(strByte));
			String str2 = new String(strByte,"ISO-8859-1");
			System.out.println(str2);
			String str3 = new String(strByte,"GBK");
			System.out.println(str3);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
