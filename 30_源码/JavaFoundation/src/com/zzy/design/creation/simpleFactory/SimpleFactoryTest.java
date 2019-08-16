package com.zzy.design.creation.simpleFactory;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class SimpleFactoryTest {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		TV tv;
		String brandName = XMLUtilTV.getBrandName();
		tv = TVFactory.produceTV(brandName);
		tv.play();
		String realativePath = System.getProperty("user.dir");
		System.out.println(realativePath);
		
	}
}
