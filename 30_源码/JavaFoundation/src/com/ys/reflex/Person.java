package com.ys.reflex;

public class Person {
	private String name = "Tom";
	public int age = 17;
	public Person(){
		
	}
	private void say(){
		System.out.println("private is saying");
	}
	public void work(){
		System.out.println("public is working");
	}
}
