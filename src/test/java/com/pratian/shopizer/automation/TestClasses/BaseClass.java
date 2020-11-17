package com.pratian.shopizer.automation.TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	protected static WebDriver driver;

	@BeforeMethod

	public static void setup()

	{

	System.setProperty("webdriver.chrome.driver", "D:\\Shopizer Automation\\Shopizer\\Shopizer\\src\\test\\resources\\drivers\\chromedriver.exe");
		
	driver = new ChromeDriver();

	}

	public WebDriver getDriver()

	{

	return driver;

	}

	@AfterMethod

	public static void tearDown()

	{

	driver.close();

	}

}
