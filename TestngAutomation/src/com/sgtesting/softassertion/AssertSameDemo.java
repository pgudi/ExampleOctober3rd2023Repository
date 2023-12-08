package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
	
	SoftAssert soft=new SoftAssert();
	@Test(enabled = false)
	public void assertSameTesting()
	{
		try
		{
			String s1,s2;
			s1="JavaScript";
			s2="JavaScript";
			soft.assertSame(s1, s2);
			soft.assertAll();
			System.out.println("This line has specified after assertSame statement!!");
		}catch (Exception e) {
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
			s2="JavaScript ES5";
			soft.assertNotSame(s1, s2);
			soft.assertAll();
			System.out.println("This line has specified after assertNotSame statement!!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
