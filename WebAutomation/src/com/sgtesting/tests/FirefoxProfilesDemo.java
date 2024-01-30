package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxProfilesDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();

	}
	
	private static void launchBrowser()
	{
		try  
		{
			FirefoxProfile ffprofile=new FirefoxProfile();
			ffprofile.setPreference("browser.startup.homepage", "https://gentechacademy.com/");
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
			
			oBrowser=new FirefoxDriver(options);
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	

}
