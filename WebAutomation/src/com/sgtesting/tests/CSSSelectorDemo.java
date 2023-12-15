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
	//	relativeCSSWithTagNameAndAttributeName_1();
	//	relativeCSSWithTagNameAndAttributeName_2();
	//	relativeCSSWithTagNameAndAttributeName_3();
	//	relativeCSSWithTagNameWithPartialMatchingofAttributeNameValueCombination();
	//	relativeCSSBasedOnParentIdentifyChildElement();
	//	relativeCSSBasedOnNthChildElement();
		relativeCSSBasedOnSibling();
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
	
	private static void relativeCSSWithTagNameAndAttributeName_1()
	{
		//Display Name of the Links
		List<WebElement> olists=oBrowser.findElements(By.cssSelector("a[href]"));
		
		for(int i=0;i<olists.size();i++)
		{
			WebElement oLink=olists.get(i);
			String name=oLink.getText();
			System.out.println(name);
		}
	}
	
	private static void relativeCSSWithTagNameAndAttributeName_2()
	{
		try
		{
			//Based on Ends With identify the Element
			List<WebElement> olists=oBrowser.findElements(By.cssSelector("a[href]"));
			
			for(int i=0;i<olists.size();i++)
			{
				WebElement oLink=olists.get(i);
				String name=oLink.getText();
				System.out.println(name);
				if(name.endsWith("Apache"))
				{
					oLink.click();
					Thread.sleep(3000);
					break;
				}
			}
			oBrowser.navigate().back();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void relativeCSSWithTagNameAndAttributeName_3()
	{
		// org.openqa.selenium.StaleElementReferenceException: 
		// stale element reference: stale element not found
		List<WebElement> olists=oBrowser.findElements(By.cssSelector("a[href]"));
		
		for(int i=0;i<olists.size();i++)
		{
			WebElement oLink=olists.get(i);
			String name=oLink.getText();
			if(name.equals("S G Software Testing"))
			{
				oLink.click();
			}
		}
	}
	
	/**
	 * case 10: Identify Element based on tagName with 
	 *  Partial Matching of attribute Name and value combinatin
	 * Syntax : <tagName>[attributeName ^= attributeValue]    starts-with
	 * Syntax : <tagName>[attributeName *= attributeValue]	  contains
	 * Syntax : <tagName>[attributeName $= attributeValue]	  ends-with
	 */
	private static void relativeCSSWithTagNameWithPartialMatchingofAttributeNameValueCombination()
	{
	//	oBrowser.findElement(By.cssSelector("input[id ^='btn1']")).click();
	//	oBrowser.findElement(By.cssSelector("input[id *='submit']")).click();
		oBrowser.findElement(By.cssSelector("input[id $='button1']")).click();
	}
	
	/**
	 * Case 11: Based on Parent Element identify the Child Element
	 */
	private static void relativeCSSBasedOnParentIdentifyChildElement()
	{
		oBrowser.findElement(By.cssSelector("#frm2 >input")).click();
	}
	
	/**
	 * Case 12: Based on Parent Element identify the Child Element
	 */
	private static void relativeCSSBasedOnNthChildElement()
	{
		oBrowser.findElement(By.cssSelector("#frm3 :first-child")).sendKeys("Demouser1");
		oBrowser.findElement(By.cssSelector("#frm3 :nth-child(2)")).sendKeys("Demouser2");
		oBrowser.findElement(By.cssSelector("#frm3 :nth-child(3)")).sendKeys("Demouser3");
		oBrowser.findElement(By.cssSelector("#frm3 :nth-child(4)")).sendKeys("Demouser4");
		oBrowser.findElement(By.cssSelector("#frm3 :nth-child(5)")).sendKeys("Demouser5");
		oBrowser.findElement(By.cssSelector("#frm3 :last-child")).sendKeys("Demouser10");
	}
	
	/**
	 * Case 13: Based on sibling identify the Element
	 */
	private static void relativeCSSBasedOnSibling()
	{
		oBrowser.findElement(By.cssSelector("#frm3 >input + input + input + input")).sendKeys("DemoUser4");
	}
}
