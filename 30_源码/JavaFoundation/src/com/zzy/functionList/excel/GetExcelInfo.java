package com.zzy.functionList.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;
/**
 * 读取excel文件
 * jxl只识别xls文件，不识别xlsx文件，否则会报BifferException- Unable to recognize OLE stream
 * @author Administrator
 *
 */
public class GetExcelInfo {
	public static Logger logger = Logger.getLogger(GetExcelInfo.class);
	public static void main(String[] args) {
		GetExcelInfo getExcelInfo = new GetExcelInfo();
		File file = new File("C:\\Users\\huayu\\Desktop\\aa.xls");
		getExcelInfo.readExcel(file);
	}
	public void readExcel(File file) {
		//创建输入流
		try {
			FileInputStream fileInputStream = new FileInputStream(file.getAbsoluteFile());
			//jxl提供的Workbook类
			Workbook workbook = Workbook.getWorkbook(fileInputStream);
			//Excel的页签数量  
			int numberOfSheets = workbook.getNumberOfSheets();
			for (int index = 0; index < numberOfSheets; index++) {
				// 每个页签创建一个Sheet对象 
				Sheet sheet = workbook.getSheet(index);
				 // sheet.getRows()返回该页的总行数 
				for (int i = 0; i < sheet.getRows(); i++) {
					// sheet.getColumns()返回该页的总列数  
					for (int j = 0; j < sheet.getColumns(); j++) {
						String contents = sheet.getCell(j, i).getContents();
						System.out.print(contents+" ");
					}
					System.out.println();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			logger.error("文件没找到",e);
		} catch (BiffException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			logger.error("BiffException",e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			logger.error("IO异常",e);
		}
	}
}
