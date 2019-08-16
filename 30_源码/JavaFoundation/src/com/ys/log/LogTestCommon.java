package com.ys.log;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * 基于common-loggin
 * @author Administrator
 *
 */
public class LogTestCommon {
	public static Log log = LogFactory.getLog(LogTestCommon.class);
	public static void test(){
		log.debug("111");
		log.debug("125");
		log.debug("485");
		log.debug("error");
		
	}
	public static void main(String[] args) {
		LogTestCommon.test();
	}
}

