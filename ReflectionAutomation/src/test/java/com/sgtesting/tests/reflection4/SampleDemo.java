package com.sgtesting.tests.reflection4;

public class SampleDemo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.sgtesting.tests.reflection4");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
