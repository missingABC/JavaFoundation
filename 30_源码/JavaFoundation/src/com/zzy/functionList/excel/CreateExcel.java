package com.zzy.functionList.excel;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import jxl.Workbook;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CreateExcel {
	public static void main(String[] args) {
		try {
			WritableWorkbook workbook = Workbook.createWorkbook(new File("C:\\Users\\Administrator\\Desktop\\test.xls"));
			// 生成名为“sheet1”的工作表，参数0表示这是第一页 
			WritableSheet sheet = workbook.createSheet("sheet1", 0);
			// 在Label对象的构造子中指名单元格位置是第一列第一行(0,0),单元格内容为string  
			Label label = new Label(0, 0, "String");
			// 将定义好的单元格添加到工作表中  
			sheet.addCell(label);
			 // 生成一个保存数字的单元格,单元格位置是第二列，第一行，单元格的内容为1234.5  
			Number number = new Number(1, 0, 1234.5);
			sheet.addCell(number);
			  // 生成一个保存日期的单元格，单元格位置是第三列，第一行，单元格的内容为当前日期  
			DateTime dateTime = new DateTime(2, 0, new Date());
			sheet.addCell(dateTime);
			//写入文件，并关闭
			workbook.write();
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RowsExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
