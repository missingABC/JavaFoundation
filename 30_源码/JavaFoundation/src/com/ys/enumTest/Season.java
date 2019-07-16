package com.ys.enumTest;
/**
 * jdk1.5 以前实现枚举类的方法
 * 
 * @author zzy
 * @date 创建时间：2019年6月4日
 */
public class Season {
	private final String name;
	private final String desc;
	//因枚举类对象有限，不能再外面new，所以构造器私有化
	private Season(String name,String desc){
		this.name = name;
		this.desc = desc;
	}
	//外部不能new，内部进行创建对象
	public static final Season SPRING = new Season("春天","穿暖花开");
	public static final Season SUMMER = new Season("夏天","炎炎盛夏");
	public static final Season FALL = new Season("秋天","秋高气爽");
	public static final Season WINTER = new Season("冬天","大雪纷飞");
	@Override
	public String toString() {
		return "Season [name="+name+", desc ="+desc+"]";
	}
	
}
