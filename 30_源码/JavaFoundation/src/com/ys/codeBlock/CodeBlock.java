package com.ys.codeBlock;

public class CodeBlock {
	static{
		System.out.println("��̬�����");
	}
	{
		System.out.println("��������");
	}
	public CodeBlock(){
		System.out.println("�޲ι��캯��");
	}
	public CodeBlock(String str){
		System.out.println("�вι��캯��");
	}
	public void sysHello(){
		{
			System.out.println("��ͨ��������");
		}
	}
	public static void main(String[] args) {
		new CodeBlock().sysHello();
		System.out.println("main");
		System.out.println("--------------------");
		new CodeBlock().sysHello();
	}
}
