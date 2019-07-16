package com.ys.InnerClass;
/**
 * 匿名内部类  接口
 * @author zzy
 * @date 创建时间：2019年5月30日
 */
public class InnerClassTest {
	public static void main(String[] args) {
		Animal animal = new Animal(){ //匿名内部类实现接口，必须全部实现方法
			@Override
			public void jump() {
				System.out.println("Animal jumping...");
			}

			@Override
			public void test() {
				System.out.println("testing");
				
			}
		};
		animal.jump();
		
		//匿名内部类实现抽象类
		mobilePhone mobile = new mobilePhone(){

			@Override
			public void call() {
				System.out.println("phoning");
				
			}
			
		};
		mobile.call();
	}
}
