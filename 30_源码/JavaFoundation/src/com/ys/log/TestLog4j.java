package com.ys.log;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


/**
 * 基于log4j的运行方式
 * @author zzy
 * @date 创建时间：2019年4月23日
 */
public class TestLog4j {
	public static Logger logger = Logger.getLogger(TestLog4j.class);
	
	public static void main(String[] args) throws IOException {
//		PropertyConfigurator.configure("log4j.properties");
		Properties props = new Properties();
		props.load(TestLog4j.class.getClassLoader().getResourceAsStream("log4j.properties"));
		PropertyConfigurator.configure(props);
		logger.debug("here is a bug");
		logger.info("here are some info..");
		logger.error("here are some errors");
		logger.fatal("here are some fatal...");
	}
}
