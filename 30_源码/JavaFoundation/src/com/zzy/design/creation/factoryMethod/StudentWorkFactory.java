package com.zzy.design.creation.factoryMethod;

public class StudentWorkFactory implements IworkFactory{

	@Override
	public Work getWork() {
		return new StudentWork();
	}

}
