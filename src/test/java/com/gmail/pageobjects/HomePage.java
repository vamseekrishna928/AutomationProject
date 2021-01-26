package com.gmail.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
	}
	
	
	@FindBy(xpath="//*[@id=\":jm\"]/div/div")
	WebElement composeButton;
	
	@FindBy(xpath="//*[@id=\":pb\"]")
	WebElement totextbox;

	@FindBy(xpath="//*[@id=\":ot\"]")
	WebElement subjectbox;
	
	@FindBy(xpath="//*[@id=\":oj\"]")
	WebElement sendButton;
	
	@FindBy(xpath="//*[@id=\":oj\"]")
	WebElement attach;

	public void compose()
	{
		composeButton.click();
	}
	public void totext()
	{
		totextbox.sendKeys("abcd@gmail.com");;
	}
	public void subjecttxt()
	{
		subjectbox.sendKeys("reg");
	}
	
	public void attacha()
	{
		attach.click();
	}
public void sendButton()
{
	sendButton.click();
}
}



