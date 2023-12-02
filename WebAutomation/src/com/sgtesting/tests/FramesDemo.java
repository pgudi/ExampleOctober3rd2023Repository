package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBroser();
		navigate();
		handleFrames();
	}
	
	private static void launchBroser()
	{
		try
		{
			oBrowser=new ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("file:///E:/HTML/FramesTest.html");
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void handleFrames()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.linkText("Selenium")).click();
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(1000);
			oBrowser.switchTo().frame("register");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("user")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(1000);
			WebElement oEle=oBrowser.findElement(By.id("frm3"));
			oBrowser.switchTo().frame(oEle);
			Thread.sleep(1000);
			oBrowser.findElement(By.id("ch")).click();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
