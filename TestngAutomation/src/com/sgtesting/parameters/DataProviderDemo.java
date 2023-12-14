package com.sgtesting.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider = "logindata")
	public void login(String user,String password)
	{
		System.out.println("User Name :"+user);
		System.out.println("Password :"+password);
		System.out.println("++++++++++++");
	}
	
	@DataProvider(name="logindata")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"santosh","Welcome1"},
			{"syed","Welcome2"},
			{"Bhagyashri","Welcome3"}};
	}
}
