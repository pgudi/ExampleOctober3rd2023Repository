package com.sgtesting.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateMultipleUsers {
	
	@Test(dataProvider = "multipleUsers")
	public void createUsers(String fn,String ln,String email,String user,String pwd,String repwd)
	{
		System.out.println(fn +"  "+ln+"  "+email+"  "+user+"  "+pwd+"  "+repwd);
	}
	
	@DataProvider(name = "multipleUsers")
	public Object[][] getUsersData()
	{
		return new Object[][] {{"demo","User1","demo@email.com","demoUser1","Welcome1","Welcome1"},
			{"demo1","User2","demo1@email.com","demo1User2","Welcome2","Welcome2"},
			{"demo2","User3","demo2@email.com","demo2User3","Welcome3","Welcome3"}};
	}

}
