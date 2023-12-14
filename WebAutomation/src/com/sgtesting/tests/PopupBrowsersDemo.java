package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowsersDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		popupBrowsers();
	}
	
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void popupBrowsers()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before Click on the Link, # of Popups are :"+getPopupsCount());
			oEle.click();
			Thread.sleep(2000);
			System.out.println("Before Click on the Link, # of Popups are :"+getPopupsCount());
			if(getPopupsCount() > 0)
			{
				handlePopUps();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static int getPopupsCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	
	private static void handlePopUps()
	{
		String parentBroser=null;
		Object popups[];
		try
		{
			parentBroser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBroser);
			popups=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				Thread.sleep(2000);
				oBrowser.switchTo().window(childBrowser);
				Thread.sleep(2000);
				String title=oBrowser.getTitle();
				System.out.println("Child Browser Title :"+title);
				String url=oBrowser.getCurrentUrl();
				System.out.println("Child Browser URL :"+url);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
