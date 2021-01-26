package com.gmail.testcases;

import org.testng.annotations.Test;

import com.gmail.pageobjects.BaseClass;
import com.gmail.pageobjects.HomePage;


public class TS01_TC02_ValidateComposeFunctionlity extends BaseClass {
	
	
	@Test
	public void homepage()
	{
		HomePage hp=new HomePage(null);
				
		hp.compose();
		hp.totext();
		hp.subjecttxt();
		hp.sendButton();
		
	}

}
