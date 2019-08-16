package com.zzy.design.creation.singleton;

/**
 * 懒汉和饿汉
 * @author Administrator
 *懒汉式单例实例测试
 *本身就是线程不安全的
 *
 */
public class Singleton1 {
	public static void main(String[] args) {
		Student  stu1 = Student.getStudent();
		Student  stu2 = Student.getStudent();
		System.out.println(stu1);
		System.out.println(stu2);
	}
}
class Student{
	private static Student student;
	private Student() {
	}
	public static Student getStudent() {
		if(student == null) {
			//加锁，线程安全
			synchronized (Student.class) {
				student = new Student();
				
			}
		}
		return student;
	}
}
