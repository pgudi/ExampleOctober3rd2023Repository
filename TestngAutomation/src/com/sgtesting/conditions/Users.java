package com.sgtesting.conditions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {
	
	@Test
	public void createUser()
	{
		System.out.println("the user demoUser1 has created successfully...");
	}
	
	@Test(enabled = false)
	public void modifyUser()
	{
		System.out.println("the user demoUser1 has modified successfully...");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("the user demoUser1 has deleted successfully...");
	}
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Browser, Navigate the Application URL and Login into the Application");
	}

	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the Application and closes the Application");
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}
