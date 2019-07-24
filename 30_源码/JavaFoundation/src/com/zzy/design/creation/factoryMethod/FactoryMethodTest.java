package com.zzy.design.creation.factoryMethod;

import org.junit.Test;
/**
 * 工厂方法
 * @author zzy
 * 将类的实例化（具体产品的创建）延迟到工厂类的子类（具体工厂）中完成，
 * 即由子类来决定应该实例化（创建）哪一个类
 *
 */
public class FactoryMethodTest {
	@Test
	public void testFactoryMethod() {
		IworkFactory studentWorkFactory = new StudentWorkFactory();
		studentWorkFactory.getWork().doWork();
		IworkFactory teacherWorkFactory = new TeacherWorkFactory();
		teacherWorkFactory.getWork().doWork();
	}
	
	
	
}
