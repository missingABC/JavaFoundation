package com.zzy.design.creation.factoryMethod;

public class TeacherWorkFactory implements IworkFactory{

	@Override
	public Work getWork() {
		return new TeacherWork();
	}

}
