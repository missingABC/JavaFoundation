package com.ys.enumTest;

public enum SeasonEnum {
	SPRING("����","��ů����"),
	SUMMER ("����","����ʢ��"),
	FALL("����","�����ˬ"),
	WINTER("����","��ѩ�׷�");
	private final String name;
	private final String desc;
	private SeasonEnum(String name,String desc){
		this.name = name;
		this.desc = desc;
	}
}
