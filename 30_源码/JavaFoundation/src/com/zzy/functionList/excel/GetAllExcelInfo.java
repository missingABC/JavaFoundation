package com.zzy.functionList.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * 
 * @author ZZY
 *
 */
public class GetAllExcelInfo {
	public static void main(String[] args) {
		GetAllExcelInfo getAllExcelInfo = new GetAllExcelInfo();
		// 此处路径指定到目录而不是单个文件  
		File file = new File("C:\\\\Users\\\\Administrator\\\\Desktop");
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				//如果还存在目录里还包含目录
				if (file2.isDirectory()) {
					File[] listFiles2 = file2.listFiles();
					for (File file3 : listFiles) {
						// 对文件进行过滤，只读取Excel文件，非Excel文件不读取，否则会出错  
						if(file3.getName().indexOf(".xls")>0) {
							getAllExcelInfo.readExcel(file3);
						}
					}
					
				}else {
					//过滤文件
					if(file2.getName().indexOf(".xls")>0) {
						getAllExcelInfo.readExcel(file2);
					}
				}
				
			}
			
		}
	}
	
	public void readExcel(File file) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		//指定生成txt文件的路径
		String fileName = file.getName().replace(".xls", "");
		try {
			fileWriter = new FileWriter(file.getParent()+"/"+fileName+".txt");
			printWriter = new PrintWriter(fileWriter);
			// 创建输入流，读取Excel
			FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
			Workbook workbook = Workbook.getWorkbook(fileInputStream);
			// Excel的页签数量  
			int numberOfSheets = workbook.getNumberOfSheets();
			for (int index = 0; index < numberOfSheets; index++) {
				// 每个页签创建一个Sheet对象  
				Sheet sheet = workbook.getSheet(index);
				  // sheet.getRows()返回该页的总行数  
				for (int i = 0; i < sheet.getRows(); i++) {
					// sheet.getColumns()返回该页的总列数
					for (int j = 0; j < sheet.getColumns(); j++) {
						String contents = sheet.getCell(i, j).getContents();
						printWriter.println(contents);
					}
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			printWriter.close();
			try {
				fileWriter.close();
				// 由于此处用到了缓冲流，如果数据量过大，不进行flush操作，存在于内从中而不会写入文件
				printWriter.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
