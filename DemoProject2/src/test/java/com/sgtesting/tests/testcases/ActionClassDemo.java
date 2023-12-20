package com.sgtesting.tests.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassDemo {
	public static WebDriver oBrowser=null;
	@Test(priority = 1)
	public void launchBrowser()
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
	public void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void mouseActions()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='✕']")).click();
			Thread.sleep(4000);
			Actions oMouse=new Actions(oBrowser);
			WebElement oMenu=oBrowser.findElement(By.xpath("//div[@class='_3sdu8W emupdz']/div[2]"));
			oMouse.moveToElement(oMenu).build().perform();
			Thread.sleep(2000);

			WebElement oLink1=oBrowser.findElement(By.linkText("Computer Peripherals"));
			Thread.sleep(2000); 
			oMouse.moveToElement(oLink1).build().perform(); 
			Thread.sleep(2000);

			WebElement oPrinter=oBrowser.findElement(By.linkText("Printers"));
			oMouse.moveToElement(oPrinter).build().perform(); 
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Printers")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
