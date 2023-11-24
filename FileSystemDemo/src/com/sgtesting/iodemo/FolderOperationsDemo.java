package com.sgtesting.iodemo;
import java.io.File;
public class FolderOperationsDemo {
	public static void main(String[] args) {
	//	createFolder();
	//	nestedFolders();
	//	renameFolder();
	//	deleteFolder();
		folderCollections();
	}
	
	private static void createFolder()
	{
		File f1=new File("D:\\Demo\\Example\\Tasks");
		f1.mkdir();
	}
	
	private static void nestedFolders()
	{
		File f1=new File("D:\\Demo\\Example\\D1\\D2\\D3\\D4\\D5");
		f1.mkdirs();
	}
	
	private static void renameFolder()
	{
		File f1=new File("D:\\Demo\\Example\\Tasks");
		File f2=new File("D:\\Demo\\Example\\TasksAssigned");
		boolean v1=f1.renameTo(f2);
		System.out.println("Whether folder has renamed ?:"+v1);
	}
	
	private static void deleteFolder()
	{
		File f2=new File("D:\\Demo\\Example\\TasksAssigned");
		boolean v1=f2.delete();
		System.out.println("Whether folder has deleted ?:"+v1);
	}

	private static void folderCollections()
	{
		File f1=new File("D:\\Demo\\Example");
		File[] f2=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isDirectory()==true)
			{
				System.out.println(f2[i].getAbsolutePath());
			}
		}
	}
}
