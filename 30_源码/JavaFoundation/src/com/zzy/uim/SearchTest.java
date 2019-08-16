package com.zzy.uim;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.List;

public class SearchTest {
	public static void main(String[] args) {
		List<String> pathList = new ArrayList<>();
		String corpPath = "corp_Bdsgdgfdgdfgdf526";
		/* pathList.add("corp_1"); */
		pathList.add("corp_1,corp_Agdfgdsfgdfgdf321,corp_Bdsgdgfdgdfgdf526,"
				+ "corp_Cdsgdgfdgdfgdf524,dept_fdgfdg45116165,user_454dgdfgfdgf222");
		/*
		 * pathList.add("corp_Bdsgdgfdgdfgdf526");
		 * pathList.add("corp_Cdsgdgfdgdfgdf524");
		 * pathList.add("corp_Ddsgdgfdgdfgdf325");
		 * pathList.add("corp_Edsgdgfdgdfgdf455");
		 */
		for (String path : pathList) {
			System.out.println(path.substring(path.indexOf(corpPath), path.length()));
			//System.out.println("corpPath:"+path.indexOf(corpPath) +"  pathlength:"+path.length());
		}
		
		
		
		
	}
}
