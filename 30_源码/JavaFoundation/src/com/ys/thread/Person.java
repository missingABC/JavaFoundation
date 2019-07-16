package com.ys.thread;

public class Person {
	private String name;
	private int age;
	//��ʾ������Դ�Ƿ�Ϊ�գ����Ϊtrue��ʾ���������Ϊfalse��ʾ������ ��Ҫ����
	private boolean isEmpty = true;
	/**
	 * ��������--������
	 * @param name
	 * @param age
	 */
	public synchronized void push(String name,int age){//��name��age����һ��
		try {
			while(!isEmpty){
				//������ ��������
				this.wait();
			}
			//��������
			this.name = name;
			//�����ʱ����������ǿ���ֻ������ name��ageΪnul�������߾���ȥ������
			Thread.sleep(10);
			this.age = age;
			//�������ݽ���
			isEmpty = false;//������ϣ�����������
			this.notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ȡ����--������
	 */
	public synchronized void pop(){
		try {
			while(isEmpty){
				this.wait();
			}
			//--���ѿ�ʼ
			Thread.sleep(10);
			System.out.println(this.name+" "+this.age);
			//���ѽ���
			isEmpty = true;
			this.notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
