package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConditionsDemo {
	SoftAssert soft=new SoftAssert();
	@Test(enabled = false)
	public void assertTrueTesting()
	{
		try
		{
			int x,y;
			x=125;y=1000;
			soft.assertTrue(x>=y);
			soft.assertAll();
			System.out.println("This line has specified after assertTrue statement!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertFalseTesting()
	{
		try
		{
			int x,y;
			x=125;y=100;
			soft.assertFalse(x<=y);
			soft.assertAll();
			System.out.println("This line has specified after assertFalse statement!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
