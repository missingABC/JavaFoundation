package com.zzy.functionList.excel;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import jxl.CellType;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.DateFormat;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.NumberFormat;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CreateExcel1 {
	public static void main(String[] args) {
		try {
			WritableWorkbook workbook = Workbook.createWorkbook(new File("testExcel.xls"));
			 // 生成名为“sheet1”的工作表，参数0表示这是第一页
			WritableSheet sheet = workbook.createSheet("标签1", 0);
			Label label = new Label(0, 0, "String", getDatCellFormat(CellType.LABEL));
			sheet.addCell(label);
			Number number = new jxl.write.Number(1, 0, 1234.5);
			sheet.addCell(number);
			DateTime dateTime = new DateTime(2, 0, new Date());
			sheet.addCell(dateTime);
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
	
	public static WritableCellFormat getDatCellFormat(CellType cellType) {
		WritableCellFormat wcf = null;
		//字体样式
		if(cellType==cellType.NUMBER||cellType==CellType.NUMBER_FORMULA) {
			NumberFormat numberFormat = new NumberFormat("#.00");
			wcf = new WritableCellFormat(numberFormat);
		}else if (cellType == cellType.DATE) {
			//LocalDateTime dt = LocalDateTime.now();
			//DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
			  DateFormat df = new DateFormat("yyyy-MM-dd hh:mm:ss");  
			  wcf = new WritableCellFormat(df);
		}else {
			WritableFont wf = new WritableFont(WritableFont.TIMES, 10,  
                    WritableFont.NO_BOLD, false);
			//字体颜色
			try {
				wf.setColour(Colour.RED);
				wcf = new WritableCellFormat(wf);
				//对齐方式
				wcf.setAlignment(Alignment.CENTRE);
				wcf.setVerticalAlignment(VerticalAlignment.CENTRE);
				wcf.setBorder(Border.TOP, BorderLineStyle.THIN);  
		            // 设置下边框  
		        wcf.setBorder(Border.BOTTOM, BorderLineStyle.THIN);  
		            // 设置左边框  
		        wcf.setBorder(Border.LEFT, BorderLineStyle.THIN);  
		            // 设置右边框  
		        wcf.setBorder(Border.RIGHT, BorderLineStyle.THIN);  
		            // 设置背景色  
		        wcf.setBackground(Colour.YELLOW);  
		            // 自动换行  
		        wcf.setWrap(true);  
			} catch (WriteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return wcf;
	}
	
}
