package com.zzy.design.creation.simpleFactory;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLUtilTV {
	public static String getBrandName() throws ParserConfigurationException, SAXException, IOException {
		//创建文档兑现读取工厂
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder newDocumentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document doc;
//		doc = newDocumentBuilder.parse(new File("D:\\JavaFoundation\\30_源码\\JavaFoundation\\src\\com\\zzy\\design\\creation\\simpleFactory\\cofigTV.xml"));
		//默认定位到工作目录，即项目在本地存储的根目录，在这里是D盘
		doc = newDocumentBuilder.parse(new File("src/com/zzy/design/creation/simpleFactory/cofigTV.xml"));
		//获取对应的文本节点
		NodeList nodeList = doc.getElementsByTagName("brandName");
		Node classNode = (Node) nodeList.item(0).getFirstChild();
		String brandName = classNode.getNodeValue().trim(); 
		return brandName;
	}
}
