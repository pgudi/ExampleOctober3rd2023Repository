package com.sgtesting.utildemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
	//	writeContent();
		readContent();
	}
	/**
	 * Write key and value paid into a file
	 */
	private static void writeContent()
	{
		FileOutputStream fout=null;
		Properties prop=null;
		try
		{
			fout=new FileOutputStream("D:\\EXCEL\\Test.properties");
			prop=new Properties();
			
			prop.setProperty("username", "admin");
			prop.setProperty("password", "manager");
			prop.setProperty("pin", "2222");
			
			prop.store(fout, "It is an example");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				prop.clear();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	//Read value from the .properties file
	private static void readContent()
	{
		FileInputStream fin=null;
		Properties prop=null;
		try
		{
			fin=new FileInputStream("D:\\EXCEL\\Test.properties");
			prop=new Properties();
			
			prop.load(fin);
			
			String v1=prop.getProperty("username");
			System.out.println(v1);
			String v2=prop.getProperty("password");
			System.out.println(v2);
			String v3=prop.getProperty("pin");
			System.out.println(v3);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				prop.clear();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
