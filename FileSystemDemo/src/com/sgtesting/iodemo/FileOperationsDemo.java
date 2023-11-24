package com.sgtesting.iodemo;
import java.io.File;
public class FileOperationsDemo {
	public static void main(String[] args) {
	//	createFile();
	//	renameFile();
	//	deleteFile();
		fileCollections();
	}
	
	private static void createFile()
	{
		try
		{
			File f1=new File("D:\\Demo\\Example\\Sample.txt");
			f1.createNewFile();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void renameFile()
	{
		File f1=new File("D:\\Demo\\Example\\Sample.txt");
		File f2=new File("D:\\Demo\\Example\\SampleNew.txt");
		boolean v1=f1.renameTo(f2);
		System.out.println("Whether File has renamed ?:"+v1);
	}

	private static void deleteFile()
	{
		File f2=new File("D:\\Demo\\Example\\SampleNew.txt");
		boolean v1=f2.delete();
		System.out.println("Whether File has deleted ?:"+v1);
	}
	
	private static void fileCollections()
	{
		File f1=new File("D:\\Demo\\Example");
		File[] f2=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isFile()==true)
			{
				System.out.println(f2[i].getPath());
			}
		}
	}
}
