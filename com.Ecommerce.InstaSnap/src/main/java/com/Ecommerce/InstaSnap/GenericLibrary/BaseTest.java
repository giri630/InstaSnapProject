package com.Ecommerce.InstaSnap.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	@BeforeClass
	public void BrowserSetup()
		{
			Reporter.log("BROWSER LAUNCHED SUCCESSFULLY",true);
		}
	
	@BeforeMethod
	public void login()
	{
	Reporter.log("LOGIN SUCCESSFUL",true);	
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("LOGOUT SUCCESSFUL",true);
	}
	@AfterClass
	public void TerminateBrowser()
	{
	 Reporter.log("BROWSER CLOSED SUCCESSFULLY",true); 	
	}
	
	}


