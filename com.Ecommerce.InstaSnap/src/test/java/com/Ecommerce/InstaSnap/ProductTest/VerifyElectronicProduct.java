package com.Ecommerce.InstaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.InstaSnap.GenericLibrary.BaseTest;

public class VerifyElectronicProduct extends BaseTest {
	@Test(priority=1)
	public void createProduct()
	{
	 Reporter.log("ELECTRONIC PRODUCT CREATED",true);
		
	}
	@Test(priority=2,invocationCount=2,dependsOnMethods="createProduct")
    public void updateProduct()
    {
		 Reporter.log("ELECTRONIC PRODUCT UPDATED",true);;;
 
		
    }
	

}
