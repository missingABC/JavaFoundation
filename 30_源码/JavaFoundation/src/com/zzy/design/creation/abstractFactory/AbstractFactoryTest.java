package com.zzy.design.creation.abstractFactory;

import org.junit.Test;

public class AbstractFactoryTest {
	@Test
	public void testAbstractFactory() {
		IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
		ICat blackCat = blackAnimalFactory.createCat();
		blackCat.eat();
		IDog whiteDog = blackAnimalFactory.createDog();
		whiteDog.eat();
	}
}
