package com.sgtesting.iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		writeContent();

	}
	private static void writeContent()
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter("D:\\Demo\\Example\\Welcome22.txt",true));
			bw.write("Bangalore is a capital city of Karnataka.");
			bw.newLine();
			bw.write("It is also called as Garden City of Karnataka.");
			bw.newLine();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
