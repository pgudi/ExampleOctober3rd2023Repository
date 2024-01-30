package com.sgtesting.tests.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksDemo {
	@Before
	public void setUpPreCondition()
	{
		System.out.println("The Oracle Database has connected successfully!!!");
	}
	
	@After
	public void tearDownPostCondition()
	{
		System.out.println("The Oracle Database has disconnected successfully!!!");
	}
	

}
