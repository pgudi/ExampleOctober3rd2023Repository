package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {
	
	SoftAssert soft=new SoftAssert();
	@Test(enabled = false)
	public void assertNullTesting()
	{
		try
		{
			StringBuffer sb=null;
			soft.assertNull(sb);
			soft.assertAll();
			System.out.println("This line has specified after assertNull statement!!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotNullTesting()
	{
		try
		{
			StringBuffer sb=null;
			sb=new StringBuffer("Welcome");
			soft.assertNotNull(sb);
			soft.assertAll();
			System.out.println("This line has specified after assertNotNull statement!!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
