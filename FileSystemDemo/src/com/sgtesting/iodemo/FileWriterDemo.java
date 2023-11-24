package com.sgtesting.iodemo;

import java.io.FileWriter;

public class FileWriterDemo {
	public static void main(String[] args) {
		writeContent();
	}
	private static void writeContent()
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("D:\\Demo\\Example\\Welcome11.txt",true);
			String str="Java is a programming language.";
			str+="Java is mainly used for developing Applications.";
			
			char ch[]=str.toCharArray();
			fw.write(ch);		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
