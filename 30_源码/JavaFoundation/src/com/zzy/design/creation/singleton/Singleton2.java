package com.zzy.design.creation.singleton;

/**
 * 继Singleton1
 * 懒汉和饿汉
 * @author Administrator
 *饿汉实例:直接创建实例，在类加载的时候
 *
 *区别：饿汉是线程安全的，在类创建的时候就已经创建好一个静态的对象
 *从实现方式上讲：


汉式是延时加载，是在需要的时候才创建对象，饿汉是在虚拟机启动的时候就会创建，饿汉不需要关注更多的线程问题
 *但是在加载类 的时候创建实例，如果一个工厂模式缓存了很多实例就需要考虑效率问题
 *
 *
 */
public class Singleton2 {
	public static void main(String[] args) {
		Teacher tea1 = Teacher.getTeacher();
		Teacher tea2 = Teacher.getTeacher();
		System.out.println(tea1);
		System.out.println(tea2);
		System.out.println(tea1==tea2);
	}
}
class Teacher{
	//类加载的时候初始化一次
	private static final Teacher teacher = new Teacher();
	//构造私有构造函数
	private Teacher() {
		super();
	}
	public static Teacher getTeacher() {
		return teacher;
	}
}
