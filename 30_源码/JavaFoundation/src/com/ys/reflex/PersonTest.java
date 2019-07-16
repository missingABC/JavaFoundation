package com.ys.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {
	public static void main(String[] args) {
		try {
			Class c3 = Class.forName("com.ys.reflex.Person");
			//可能存在的异常 要处理
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Person p1 = new Person();
		Class c1 = p1.getClass();
		
		Class c2 = Person.class;
		//每一个类都有一个静态成员变量class
		String className = c2.getName();
		System.out.println(className);
		//获取类的public属性
		Field[] fields = c2.getFields();//field 属性
		for(Field field :fields){
			System.out.println(field.getName());
		}
		//获取类的所有属性  包括私有的
		Field[] allFields = c2.getDeclaredFields();
		for(Field field : allFields){
			System.out.println(field.getName());
		}
		//获得类的public方法 包括Object类型
		Method[] methods = c2.getMethods();
		System.out.println("类的public方法");
		for(Method method : methods){
			System.out.print(method.getName()+" ");
		}
		try {
			Object p2 = c2.newInstance();
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constructor[] constructors = c2.getConstructors();
		for(Constructor constructor :constructors){
			System.out.println(constructor.toString());
		}
		
	}
}
