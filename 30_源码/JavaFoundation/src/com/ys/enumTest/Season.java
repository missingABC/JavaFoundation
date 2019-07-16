package com.ys.enumTest;
/**
 * jdk1.5 ��ǰʵ��ö����ķ���
 * 
 * @author zzy
 * @date ����ʱ�䣺2019��6��4��
 */
public class Season {
	private final String name;
	private final String desc;
	//��ö����������ޣ�����������new�����Թ�����˽�л�
	private Season(String name,String desc){
		this.name = name;
		this.desc = desc;
	}
	//�ⲿ����new���ڲ����д�������
	public static final Season SPRING = new Season("����","��ů����");
	public static final Season SUMMER = new Season("����","����ʢ��");
	public static final Season FALL = new Season("����","�����ˬ");
	public static final Season WINTER = new Season("����","��ѩ�׷�");
	@Override
	public String toString() {
		return "Season [name="+name+", desc ="+desc+"]";
	}
	
}
