/**
 * 
 */
package com.gmail.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author VamseeKrishna
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
	}
	
	
	@FindBy(xpath="//*[@id=\"identifierId\"]")
	WebElement txtUsername;
	
	@FindBy(xpath="//*[@id=\"identifierNext\"]/div/button/div[2]")
	WebElement nxtButton;

	@FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
	WebElement txtPass;
	
	@FindBy(xpath="//*[@id=\"passwordNext\"]/div/button/div[2]")
	WebElement nxtConfirmButton;
	

	public void userName(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	public void nxtButton()
	{
		nxtButton.click();
	}
	public void password(String pass)
	{
		txtUsername.sendKeys(pass);
	}
public void nxtConfirmButton()
{
	nxtConfirmButton.click();
}
}
