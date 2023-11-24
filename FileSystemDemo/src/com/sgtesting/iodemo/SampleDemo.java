package com.sgtesting.iodemo;
import java.io.*;
public class SampleDemo {

	public static void main(String[] args) {
		recursiveDirectories("E:\\ECLIPSE\\eclipse");

	}
	private static void recursiveDirectories(String folderpath)
	{
		try
		{
			File f1=new File(folderpath);
			File f2[]=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isDirectory()==true)
				{
					String folderName=f2[i].getAbsolutePath();
					System.out.println(folderName);
					recursiveDirectories(folderName);
				}
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
