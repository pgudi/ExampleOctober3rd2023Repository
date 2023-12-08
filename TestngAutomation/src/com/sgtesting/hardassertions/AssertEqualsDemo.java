package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {
	
	@Test(enabled = false)
	public void assertEqualsTesting()
	{
		try
		{
			String s1,s2;
			s1="JavaScript";
			s2="JavaScript";
			Assert.assertEquals(s1, s2);
			System.out.println("This line has specified after assertEquals statement!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotEqualsTesting()
	{
		try
		{
			String s1,s2;
			s1="JavaScript";
			s2="JavaScript ES6";
			Assert.assertNotEquals(s1, s2);
			System.out.println("This line has specified after assertNotEquals statement!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
