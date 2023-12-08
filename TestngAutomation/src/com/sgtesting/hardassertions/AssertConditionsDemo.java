package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertConditionsDemo {
	
	@Test(enabled = false)
	public void assertTrueTesting()
	{
		try
		{
			int x,y;
			x=125;y=100;
			Assert.assertTrue(x>=y);
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
			Assert.assertFalse(x<=y);
			System.out.println("This line has specified after assertFalse statement!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
