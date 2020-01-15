package com.zzy.functionList.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ReadWriteExcel {
	public static Logger logger = Logger.getLogger(GetExcelInfo.class);
	public static void main(String[] args) {
		GetExcelInfo getExcelInfo = new GetExcelInfo();
		File file = new File("C:\\Users\\huayu\\Desktop\\aa.xls");
		try {
		FileInputStream fileInputStream = new FileInputStream(file.getAbsoluteFile());
		//jxl提供的Workbook类
		Workbook workbook = Workbook.getWorkbook(fileInputStream);
		//Excel的页签数量  
		int numberOfSheets = workbook.getNumberOfSheets();
		//写
		WritableWorkbook workbookWrite = Workbook.createWorkbook(new File("C:\\Users\\huayu\\Desktop\\test.xls"));
		// 生成名为“sheet1”的工作表，参数0表示这是第一页 
		WritableSheet sheetWrite = workbookWrite.createSheet("sheet1", 0);
		
		for (int index = 0; index < numberOfSheets; index++) {
			// 每个页签创建一个Sheet对象 
			Sheet sheet = workbook.getSheet(index);
			 // sheet.getRows()返回该页的总行数 
			for (int i = 1; i < sheet.getRows(); i++) {
				// sheet.getColumns()返回该页的总列数  
				for (int j = 0; j < sheet.getColumns(); j++) {
					String contents = sheet.getCell(j, i).getContents();
					System.out.print(contents+" ");
					Label label = new Label(j, i, contents);
					sheetWrite.addCell(label);
				}
				System.out.println();
			}
		}
		workbookWrite.write();
		workbookWrite.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		logger.error("文件没找到",e);
	} catch (BiffException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		logger.error("BiffException",e);
	} catch (IOException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		logger.error("IO异常",e);
	} catch (WriteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}

