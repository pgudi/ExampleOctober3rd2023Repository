package com.sgtesting.tests.reflection6;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			//Execute showFirstName Method
			Class strparam1[]=new Class[1];
			strparam1[0]=String.class;
			
			Method method1= obj.getClass().getMethod("showFirstName", strparam1);
			method1.invoke(obj, new String("Santosh"));
			
			//Execute displayAge method
			Class intparam1[]=new Class[1];
			intparam1[0]=Integer.TYPE;
			
			Method method2= obj.getClass().getMethod("displayAge", intparam1);
			method2.invoke(obj, 21);
			
			//Execute showDetails method
			Class strparam2[]=new Class[2];
			strparam2[0]=String.class;
			strparam2[1]=String.class;
			
			Method method3= obj.getClass().getMethod("showDetails", strparam2);
			method3.invoke(obj, new String("CSE"),new String("R V Engineering"));
		}catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
