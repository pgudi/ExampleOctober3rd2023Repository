package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryForPersonSachinTendulkar();
	//	enterSalaryForPersonWhoIsNextToSachinTendulkar();
	//	makeStatusAsActiveForPersonWhoseDesigntionIsIndianFreedomFighter();
	//	makeStatusAsActiveForPersonWhoseIsPreviousToRahulDravid();
	//	basedOnTableElementEnterSalaryForThePersonInThe5thRow();
		basedOnStatusCheckBoxOfLastRowIdentifyTheTable();
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
			oBrowser.get("file:///E:/GitRepository4/CurrentWorkSpace/ExampleOctober3rd2023Repository/WebAutomation/webpages/WebTableHTML.html");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * case 1: following-sibling
	 * Description: Enter salary for the person Sachin Tendulkar
	 */
	private static void enterSalaryForPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}
	
	/**
	 * case 2: following
	 * Description: Enter salary for the person Who is next to Sachin Tendulkar
	 */
	private static void enterSalaryForPersonWhoIsNextToSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("15000");
	}

	/**
	 * case 3: preceding-sibling
	 * Description: Make status as Active for Person Whose designation is Indian freedom Fighter
	 */
	private static void makeStatusAsActiveForPersonWhoseDesigntionIsIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	
	/**
	 * case 4: preceding
	 * Description: Make status as Active for Person Whose is just previous to Rahul Dravid
	 */
	private static void makeStatusAsActiveForPersonWhoseIsPreviousToRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
	
	/**
	 * case 5: descendant
	 * Description:Based on table element, enter the salary for the person in the 5th row
	 */
	private static void basedOnTableElementEnterSalaryForThePersonInThe5thRow()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[5]/td[6]/input")).sendKeys("10000");
	}
	
	/**
	 * case 6: ancestor
	 * Description:Based on Status Check box of Last Row Identify the Table Element and fetch its attributes
	 */
	private static void basedOnStatusCheckBoxOfLastRowIdentifyTheTable()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='chk5']/ancestor::td/ancestor::tr/ancestor::table"));
		String v1=oEle.getAttribute("id");
		System.out.println("The id attribute value of table Element :"+v1);
	}
}
