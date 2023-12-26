package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		showApplicationTitle();
		showApplicationURL();
		displayLinksCount();
	//	enterTextInTextField1();
	//	enterTextInTextField2();
	//	clickOnButton1();
	//	clickOnButton2();
		clickOnCheckBox1();
		clickOnCheckBox2();
		clickOnRadioButton1();
		clickOnRadioButton2();
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
			oBrowser.get("file:///E:/GitRepository4/CurrentWorkSpace/ExampleOctober3rd2023Repository/WebAutomation/webpages/Sample.html");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void showApplicationTitle()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String title=(String) js.executeScript("var kk=document.title;return kk;");
		System.out.println("Title :"+title);
	}

	private static void showApplicationURL()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String url=(String) js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL :"+url);
	}
	
	private static void displayLinksCount()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		long linkcount=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
		System.out.println("# of Links are :"+linkcount);
	}
	/**
	 * Case 1: Enter the value in text field
	 */
	private static void enterTextInTextField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUser123';");
	}
	
	private static void enterTextInTextField2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("pwd1pass1word1"));
		js.executeScript("arguments[0].value='Welcome12345';",oEle);
	}
	
	/**
	 * Case 2: Click on Button
	 */
	private static void clickOnButton1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}
	
	private static void clickOnButton2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("chk2linux"));
		js.executeScript("arguments[0].click();",oEle);
	}
	/**
	 * Case 3: Click on CheckBox
	 */
	private static void clickOnCheckBox1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('chk1windows').click();");
	}
	
	private static void clickOnCheckBox2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("chk2linux"));
		js.executeScript("arguments[0].click();",oEle);
	}
	
	/**
	 * Case 4: Click on RadioButton
	 */
	private static void clickOnRadioButton1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('rad1chrome').click();");
	}
	
	private static void clickOnRadioButton2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
		js.executeScript("arguments[0].click();",oEle);
	}
}
