package com.zzy.design.creation.simpleFactory;
/**
 * 简单工厂
 * @author Administrator
 *具体的电视
 */
public class HaierTV implements TV {

	@Override
	public void play() {
		System.out.println("海尔电视剧playing...");
	}

}
