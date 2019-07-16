package com.ys.enumTest;

public enum SeasonEnum {
	SPRING("春天","穿暖花开"),
	SUMMER ("夏天","炎炎盛夏"),
	FALL("秋天","秋高气爽"),
	WINTER("冬天","大雪纷飞");
	private final String name;
	private final String desc;
	private SeasonEnum(String name,String desc){
		this.name = name;
		this.desc = desc;
	}
}
