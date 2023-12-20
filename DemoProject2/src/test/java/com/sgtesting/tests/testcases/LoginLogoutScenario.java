package com.sgtesting.tests.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginLogoutScenario {
	public static WebDriver oBrowser=null;
	@Test(priority = 1)
	public void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			Assert.assertTrue(oBrowser!=null);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2,dataProvider = "navigateURL")
	public void navigate(String url)
	{
		try
		{
			/*
			 * String expected="actiTIME - Login"; oBrowser.navigate().to(url); String
			 * title=oBrowser.getTitle(); Assert.assertEquals(expected, title);
			 */
			oBrowser.get(url);
			Thread.sleep(5000);
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Login ']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 3, dataProvider = "loginData")
	public void login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			String attributeValue=oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper")).getAttribute("style");
			Assert.assertTrue(attributeValue.equals("display: none;"));
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5)
	public void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6)
	public void closeApplication()
	{
		oBrowser.quit();
		oBrowser=null;
		Assert.assertNull(oBrowser);
	}
	
	@DataProvider(name="navigateURL")
	public Object[][] getAppURL()
	{
		return new Object[][] {{"http://localhost/login.do"}};
	}
	
	@DataProvider(name = "loginData")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
}
