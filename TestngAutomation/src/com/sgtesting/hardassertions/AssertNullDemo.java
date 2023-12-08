package com.sgtesting.hardassertions;

import java.io.FileInputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullDemo {
	
	@Test(enabled = false)
	public void assertNullTesting()
	{
		try
		{
			FileInputStream fin=null;
			Assert.assertNull(fin);
			System.out.println("This line has specified after assertNull statement!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotNullTesting()
	{
		try
		{
			FileInputStream fin=null;
			fin=new FileInputStream("E:\\EXAMPLE\\Test.properties");
			Assert.assertNotNull(fin);
			System.out.println("This line has specified after assertNotNull statement!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
