/**
 * 
 */
package com.gmail.testcases;

import org.testng.annotations.Test;

import com.gmail.pageobjects.BaseClass;
import com.gmail.pageobjects.LoginPage;

/**
 * @author LENOVO
 *
 */
public class TS01_TC01_Loginvalidation extends BaseClass 
{

	@Test
	public void logintest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.userName(username);
		lp.nxtButton();
		lp.password(password);
		lp.nxtConfirmButton();
}
}
