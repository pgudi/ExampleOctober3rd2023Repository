package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPathDemo();
	//	relativeXPathByTagName();
	//	relativeXPathByTagNameWithIndex();
	//	relativeXPathByTagNameAttributeNameAndValue();
	//	relativeXPathByAttributeNameAndValue();
	//	relativeXPathByAttributeValue();
	//	relativeXPathByTagNameWithMultipleAttributeNameAndValue();
	//	relativeXPathByTagNameWithMultipleAttributeNameAndValueAndOperator();
	//	relativeXPathByTagNameWithMultipleAttributeNameAndValueOrOperator();
	//	relativeXPathWithPartialMatchingOfAttributeValue();
	//	relativeXPathWithAttributeName();
	//	relativeXPathWithAttributeName_01();
	//	relativeXPathWithAttributeName_02();
	//	relativeXPathWithAttributeName_03();
	//	relativeXPathWithTextContent();
		relativeXPathWithPartialTextContent();
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
	
	private static void absoluteXPathDemo()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("demouser1");
	}
	
	/**
	 * case 1: identify the element based on tagName
	 * Syntax: //<tagName>
	 */
	private static void relativeXPathByTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("demoUser11");
		
	}
	
	/**
	 * case 2: identify the element based on tagName with index
	 * Syntax: //<tagName>[index]
	 */
	private static void relativeXPathByTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("demoUser11");
		
	}
	
	/**
	 * case 3: identify based on tagName with attribute Name and value
	 * syntax: //<tagName>[@attributeName='attributeValue']
	 */
	private static void relativeXPathByTagNameAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	/**
	 * case 4: identify based on attribute Name and value
	 * syntax: //*[@attributeName='attributeValue']
	 */
	private static void relativeXPathByAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
	}

	/**
	 * case 5: identify based on attribute value
	 * syntax: //*[@*='attributeValue']
	 */
	private static void relativeXPathByAttributeValue()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
	}
	
	/**
	 * case 6: identify based on tagName with multiple attribute Name and value combination
	 * syntax: //<tagName>[@attributeName1='attributeValue'][@attributeName2='attributeValue']
	 */
	private static void relativeXPathByTagNameWithMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@type='button'][@name='submit1btn1']")).click();
	}
	
	/**
	 * case 7: identify based on tagName with 
	 * multiple attribute Name and value combination
	 * using and operator
	 * syntax: //<tagName>[@attributeName1='attributeValue' and @attributeName2='attributeValue']
	 */
	private static void relativeXPathByTagNameWithMultipleAttributeNameAndValueAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' and @name='submit1btn1']")).click();
	}
	
	/**
	 * case 8: identify based on tagName with 
	 * multiple attribute Name and value combination
	 * using or operator
	 * syntax: //<tagName>[@attributeName1='attributeValue' or @attributeName2='attributeValue']
	 */
	private static void relativeXPathByTagNameWithMultipleAttributeNameAndValueOrOperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button444' or @name='submit1btn1']")).click();
	}
	
	/**
	 * case 9: identify based on partial matching of attribute value
	 * syntax:
	 * 		starts-with(@attributeName,'partial attribute value')
	 * 		ends-with(@attributeName,'partial attribute value')
	 * 		contains(@attributeName,'partial attribute value')
	 * 
	 * 		starts-with
	 * 		//<tagName>[starts-with(@attributeName,'partial attribute value')]
	 * 
	 * 		ends-with
	 * 		//<tagName>[ends-with(@attributeName,'partial attribute value')]
	 * 
	 * 		contains
	 * 		//<tagName>[contains(@attributeName,'partial attribute value')]
	 */
	private static void relativeXPathWithPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'button1')]")).click();
	}
	/**
	 * case 10: Identify Element based on tagName with attribute Name
	 * Syntax: //<tagName>[@attributeName]
	 */
	private static void relativeXPathWithAttributeName()
	{
		// Identify Number of Links the Web Page
		List<WebElement> olist=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links in a web page :"+olist.size());
	}
	
	private static void relativeXPathWithAttributeName_01()
	{
		// Display All Available Link Names
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linkname=link.getText();
			System.out.println(linkname);
		}
	}
	
	private static void relativeXPathWithAttributeName_02()
	{
		// Using ends-with content identify the particular Link
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linkname=link.getText();
			if(linkname.endsWith("HQ"))
			{
				link.click();
				break;
			}
		}
	}
	
	private static void relativeXPathWithAttributeName_03()
	{
		// stale element reference: stale element not found
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linkname=link.getText();
			if(linkname.endsWith("HQ"))
			{
				link.click();
			}
		}
	}
	
	/**
	 *  case 11: Identify the Element based on text content
	 *  Syntax : //<tagName>[text()='text content']
	 */
	private static void relativeXPathWithTextContent()
	{
	//	WebElement oEle=oBrowser.findElement(By.xpath("//p[text()='Check Box  for selecting OS Names....']"));
	//	System.out.println(oEle.getText());
		oBrowser.findElement(By.xpath("//a[text()='POI Apache']")).click();
	}
	
	/**
	 *  case 12: Identify the Element based on partial text content
	 *  Syntax : 
	 *  		//<tagName>[starts-with(text(),'partial text content')]
	 *  		//<tagName>[ends-with(text(),'partial text content')]
	 *  		//<tagName>[contains(text(),'partial text content')]
	 */
	private static void relativeXPathWithPartialTextContent()
	{
	//	oBrowser.findElement(By.xpath("//a[starts-with(text(),'S G')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'Apache')]")).click();
	}
	
	
}
