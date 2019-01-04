package com.ibm.jerkins.com.ibm.jerkins;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NormaldemoTest 
{
	WebDriver driver;

	@Test
	public void launchapp() 
	{
      System.setProperty("webdriver.chrome.driver","C:\\Selenium Setupfiles\\chromedriver.exe");
      driver=new ChromeDriver();
     driver.get("http://elearning.hommelle.com/");
     String actual = driver.getTitle();
     String Expected ="eLearning - eLearning";
     assertEquals(actual, Expected);
	}
	
}
