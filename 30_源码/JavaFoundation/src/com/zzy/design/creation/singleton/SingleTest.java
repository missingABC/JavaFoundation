package com.zzy.design.creation.singleton;

public class SingleTest {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
		
		SingletonThreadSafe instanceSafe1 = SingletonThreadSafe.getInstance();
		SingletonThreadSafe instanceSafe2 = SingletonThreadSafe.getInstance();
		System.out.println(instanceSafe1);
		System.out.println(instanceSafe2);
	}
}
