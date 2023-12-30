package com.sgtesting.tests.stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	/**
	 * Step Name: I launch the Chrome Borwser
	 */
	@Given("^I launch the Chrome Borwser$")
	public void I_launch_the_Chrome_Borwser()
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

	/**
	 * Step Name: I navigate the Application URL
	 */
	@And("^I navigate the Application URL$")
	public void I_navigate_the_Application_URL()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I find the Login page
	 */
	@And("^I find the Login page$")
	public void I_find_the_Login_page()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name:I enter the username in username text field
	 */
	@When("^I enter the username in username text field$")
	public void I_enter_the_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I enter the password in password text field
	 */
	@And("^I enter the password in password text field$")
	public void I_enter_the_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name:I click on login button in login page
	 */
	@And("^I click on login button in login page$")
	public void I_click_on_login_button_in_login_page()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name:I find the home page
	 */
	@Then("^I find the home page$")
	public void I_find_the_home_page()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name:I click on minimize flyout window
	 */
	@And("^I click on minimize flyout window$")
	public void I_click_on_minimize_flyout_window()
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
	
	/**
	 * Step Name: I click on logout link
	 */
	@When("^I click on logout link$")
	public void I_click_on_logout_link()
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
	
	/**
	 * Step Name: I close the application
	 */
	@And("^I close the application$")
	public void I_close_the_application()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I click on User Image
	 */
	@When("^I click on User Image$")
	public void I_click_on_User_Image()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I click on add user button
	 */
	@And("^I click on add user button$")
	public void I_click_on_add_user_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I find the create user page
	 */
	@Then("^I find the create user page$")
	public void I_find_the_create_user_page()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Add User']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I enter the First Name in First Name text field
	 */
	@When("^I enter the First Name in First Name text field$")
	public void I_enter_the_First_Name_in_First_Name_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I enter the Last Name in Last Name text field
	 */
	@And("^I enter the Last Name in Last Name text field$")
	public void I_enter_the_Last_Name_in_Last_Name_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I enter the email in email text field
	 */
	@And("^I enter the email in email text field$")
	public void I_enter_the_email_in_email_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I enter the User Name in User Name text field
	 */
	@And("^I enter the User Name in User Name text field$")
	public void I_enter_the_User_Name_in_User_Name_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I enter the user password in password text field
	 */
	@And("^I enter the user password in password text field$")
	public void I_enter_the_user_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("password")).sendKeys("welcome123");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I enter the user password in retypepassword text field
	 */
	@And("^I enter the user password in retypepassword text field$")
	public void I_enter_the_user_password_in_retypepassword_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I click on Create User button
	 */
	@And("^I click on Create User button$")
	public void I_click_on_Create_User_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Step Name: I find the created user
	 */
	@Then("^I find the created user$")
	public void I_find_the_created_user()
	{
		try
		{
			WebElement oUser=oBrowser.findElement(By.xpath("//span[text()='User1, demo']"));
			Assert.assertTrue(oUser.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I click on the existing user
	 */
	@When("^I click on the existing user$")
	public void I_click_on_the_existing_user()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I click on delete user button
	 */
	@And("^I click on delete user button$")
	public void I_click_on_delete_user_button()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I click on OK button in Alert window to delete User
	 */
	@And("^I click on OK button in Alert window to delete User$")
	public void I_click_on_OK_button_in_Alert_window_to_delete_User()
	{
		try
		{
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
