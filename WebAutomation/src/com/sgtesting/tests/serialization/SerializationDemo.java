package com.sgtesting.tests.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		writeObjectInToFile();
	}
	
	private static void writeObjectInToFile()
	{
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		Employee obj=null;
		try
		{
			fout=new FileOutputStream("D:\\Demo\\Example\\Employee.ser");
			out=new ObjectOutputStream(fout);
			obj=new Employee(10,"Santosh","Manager",9500);
			out.writeObject(obj);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				out.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
