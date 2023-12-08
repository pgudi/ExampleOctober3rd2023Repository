package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameDemo {
	
	@Test(enabled = false)
	public void assertSameTesting()
	{
		try
		{
			String s1,s2;
			s1="JavaScript";
			s2="JavaScript";
			Assert.assertSame(s1, s2);
			System.out.println("This line has specified after assertSame statement!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotSameTesting()
	{
		try
		{
			String s1,s2;
			s1="JavaScript";
			s2="JavaScript ES6";
			Assert.assertNotSame(s1, s2);
			System.out.println("This line has specified after assertNotSame statement!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
