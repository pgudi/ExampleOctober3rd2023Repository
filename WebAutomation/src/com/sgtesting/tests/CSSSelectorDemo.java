package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteCssPath();
	//	relativeCSSWithTagName();
	//	relativeCSSWithTagNameWithIdAttributeValue();
	//	relativeCSSWithIdAttributeValue();
	//	relativeCSSWithTagNameWithClassAttributeValue();
	//	relativeCSSWithClassAttributeValue();
	//	relativeCSSWithTagNameWithAttributeNameValueCombination();
	//	relativeCSSWithTagNameWithMultipleAttributeNameValueCombination();
	//	relativeCSSWithAttributeNameValueCombination();
	//	relativeCSSWithTagNameAndAttributeName();
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
	
	private static void absoluteCssPath()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("demoUser1");
	}
	
	/**
	 * case 1: identify Element based on tagName
	 * Syntax: <tagName>
	 */
	private static void relativeCSSWithTagName()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser2");
	}
	
	/**
	 * case 2: identify Element based on tagName with id attribute value
	 * Syntax: <tagName>#<idAttributevalue>
	 */
	private static void relativeCSSWithTagNameWithIdAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoPassword3");
	}
	

	/**
	 * case 3: identify Element based on id attribute value
	 * Syntax: #<idAttributevalue>
	 */
	private static void relativeCSSWithIdAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoPassword3");
	}
	
	/**
	 * case 4: identify Element based on tagName with class attribute value
	 * Syntax: <tagName>.<ClassAttributevalue>
	 */
	private static void relativeCSSWithTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoPassword4");
	}
	
	/**
	 * case 5: identify Element based on  class attribute value
	 * Syntax: .<ClassAttributevalue>
	 */
	private static void relativeCSSWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoPassword5");
	}
	
	/**
	 * case 6: Identify Element based on tagName with attribute Name and value combinatin
	 * Syntax : <tagName>[attributeName=attributeValue]
	 */
	private static void relativeCSSWithTagNameWithAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	
	/**
	 * case 7: Identify Element based on tagName with Multiple attribute Name and value combinatin
	 * Syntax : <tagName>[attributeName=attributeValue][attributeName=attributeValue]
	 */
	private static void relativeCSSWithTagNameWithMultipleAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[type='button'][value='Submit']")).click();
	}
	
	/**
	 * case 8: Identify Element based on  attribute Name and value combinatin
	 * Syntax : [attributeName=attributeValue]
	 */
	private static void relativeCSSWithAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("[value='Submit']")).click();
	}
	
	/**
	 * case 9: Identify the Element based on tagName With attributeName
	 * Syntax: <tagName>[attributeName]
	 */
	private static void relativeCSSWithTagNameAndAttributeName()
	{
		//Find out Number of Links in the Web Page
		List<WebElement> olists=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links in the Page :"+olists.size());
	}
}
