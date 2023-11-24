package com.sgtesting.iodemo;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		writeContent();

	}
	private static void writeContent()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("D:\\Demo\\Example\\Welcome.txt",true);
			String strContent="Bangalore is a capital City of Karnataka";
			strContent+=",It is also called as Garden City of India.";
			
			byte b[]=strContent.getBytes();
			fout.write(b);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
