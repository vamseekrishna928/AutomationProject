/**
 * 
 */
package com.gmail.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author VamseeKrishana *
 */
public class BaseClass {

	
	public String baseURL="gmail.com";
	public String username="abcd@gmail.com";
	public String password="abcd123";
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(baseURL);
		
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
