package com.ys.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {
	public static void main(String[] args) {
		try {
			Class c3 = Class.forName("com.ys.reflex.Person");
			//���ܴ��ڵ��쳣 Ҫ����
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Person p1 = new Person();
		Class c1 = p1.getClass();
		
		Class c2 = Person.class;
		//ÿһ���඼��һ����̬��Ա����class
		String className = c2.getName();
		System.out.println(className);
		//��ȡ���public����
		Field[] fields = c2.getFields();//field ����
		for(Field field :fields){
			System.out.println(field.getName());
		}
		//��ȡ�����������  ����˽�е�
		Field[] allFields = c2.getDeclaredFields();
		for(Field field : allFields){
			System.out.println(field.getName());
		}
		//������public���� ����Object����
		Method[] methods = c2.getMethods();
		System.out.println("���public����");
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
