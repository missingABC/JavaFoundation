package com.ys.InnerClass;
/**
 * �����ڲ���  �ӿ�
 * @author zzy
 * @date ����ʱ�䣺2019��5��30��
 */
public class InnerClassTest {
	public static void main(String[] args) {
		Animal animal = new Animal(){ //�����ڲ���ʵ�ֽӿڣ�����ȫ��ʵ�ַ���
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
		
		//�����ڲ���ʵ�ֳ�����
		mobilePhone mobile = new mobilePhone(){

			@Override
			public void call() {
				System.out.println("phoning");
				
			}
			
		};
		mobile.call();
	}
}
