package com.sgtesting.tests.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		readObjectFromFile();

	}
	
	private static void readObjectFromFile()
	{
		FileInputStream fin=null;
		ObjectInputStream in=null;
		Employee obj=null;
		try
		{
			fin=new FileInputStream("D:\\Demo\\Example\\Employee.ser");
			in=new ObjectInputStream(fin);
			obj=(Employee) in.readObject();
			
			obj.showEmployeeNumber();
			obj.showEmployeeName();
			obj.showJobName();
			obj.showSalary();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
