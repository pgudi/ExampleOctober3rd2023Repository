package com.sgtesting.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDemo {

	public static void main(String[] args) {
		
		writeExcel();
	}
	
	private static void writeExcel()
	{
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		FileOutputStream fout=null;
		
		try 
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Sheet1");
			
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				for(int c=i;c<=i;c++)
				{
					cell=row.createCell(i);
					cell.setCellValue("FName");
				}
				
				for(int j=i-1;j>=i;j--)
				{
					cell=row.createCell(j);
					cell.setCellValue("FName");
				}
			}
			fout=new FileOutputStream("D:\\EXCEL\\Test.xlsx");
			wb.write(fout);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fout.close();
				wb.close();
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
