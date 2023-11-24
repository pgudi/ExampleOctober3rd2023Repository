package com.sgtesting.iodemo;
import java.io.File;
public class FileDetailsDemo {
	public static void main(String[] args) {

		File f1=new File("D:\\Demo\\Example\\Test.txt");
		//Display Name of the File
		String filename=f1.getName();
		System.out.println("File Name :"+filename);
		System.out.println("----------------");
		//Display the Path of the File
		String path1=f1.getAbsolutePath();
		System.out.println("File Path :"+path1);
		System.out.println("----------------");
		//Display Parent Folder Name
		String parentfolder=f1.getParent();
		System.out.println("Parent Folder :"+parentfolder);
		System.out.println("----------------");
		//Display Whether it is a File
		boolean v1=f1.isFile();
		System.out.println("Is it a File ?:"+v1);
		System.out.println("----------------");
		//Display whether it is a folder
		boolean v2=f1.isDirectory();
		System.out.println("Is it a folder ?:"+v2);
		System.out.println("----------------");
		//Whether it is readable?
		boolean v3=f1.canRead();
		System.out.println("Is it readable ?:"+v3);
		System.out.println("----------------");
		//Whether it is readable?
		boolean v4=f1.canWrite();
		System.out.println("Is it writable ?:"+v4);
		System.out.println("----------------");
		//Whether it is readable?
		boolean v5=f1.canExecute();
		System.out.println("Is it executable ?:"+v5);
		System.out.println("----------------");
	}

}
