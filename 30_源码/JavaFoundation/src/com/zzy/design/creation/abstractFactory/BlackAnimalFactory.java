package com.zzy.design.creation.abstractFactory;

public class BlackAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		return new BlackCat();
	}

	@Override
	public IDog createDog() {
		return new WhiteDog();
	}

}
