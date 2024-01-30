package com.sgtesting.tests.testcases;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowserLoginLogoutDemo {
	private static WebDriver oBrowser=null;
	@Test(priority = 1)
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();	
			oBrowser.manage().window().maximize();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 2)
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
			getScreenshot(oBrowser, "E:\\data\\loginpage.png");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 3)
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void getScreenshot(WebDriver oBrowser,String destFileName)
	{
		try
		{
			TakesScreenshot obj=(TakesScreenshot) oBrowser;
			File sourceFile=obj.getScreenshotAs(OutputType.FILE);
			
			File destinationFile=new File(destFileName);
			org.apache.commons.io.FileUtils.copyFile(sourceFile, destinationFile);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}
