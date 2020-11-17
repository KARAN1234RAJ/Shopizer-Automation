package com.pratian.shopizer.automation.TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin extends BaseClass{
	@Test (dataProvider ="Login")			
	public void login(String userName, String Password)			
				
	{			
		driver.get("http://aws-demo.shopizer.com/shop/");		
		driver.manage().window().maximize();		
		driver.findElement(By.linkText("Log in as admin")).click();		
	    WebElement username = driver.findElement(By.id("username"));		
		username.click();		
		username.clear();		
	    username.sendKeys(userName);		
				
		WebElement password = driver.findElement(By.id("password"));		
	    password.click();		
		password.clear();		
	    password.sendKeys(Password);	
	}
	    @DataProvider(name="Login")			
		public Object[][] testData() {			
	      				
	          return new Object[][] {				
					
				{"Akansha.Giriya@skillassure.com","password@123"} 	
					
			};
	    }	
}
