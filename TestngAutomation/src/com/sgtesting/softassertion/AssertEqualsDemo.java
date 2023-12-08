package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
	SoftAssert soft=new SoftAssert();
	@Test(enabled = false)
	public void assertEqualsTesting()
	{
		try
		{
			String s1,s2;
			s1="JavaScript";
			s2="JavaScript";
			soft.assertEquals(s1, s2);
			soft.assertAll();
			System.out.println("This line has specified after assertEquals statement!!");
		}catch (Exception e) {
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
			soft.assertNotEquals(s1, s2);
			soft.assertAll();
			System.out.println("This line has specified after assertNotEquals statement!!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
