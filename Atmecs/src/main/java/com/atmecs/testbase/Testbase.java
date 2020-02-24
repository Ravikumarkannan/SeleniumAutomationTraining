package com.atmecs.testbase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.atmecs.constantfile.ConstantFile;
import com.atmecs.locators.Locators;

public class Testbase {
	Properties property;
	
	String baseUrl;
	public WebDriver driver;
	@BeforeTest
	public void invokeBrowser() throws Exception {
		property = Locators.loadProperty(ConstantFile.config_File);
		baseUrl=property.getProperty("Url");
		
		System.setProperty("webdriver.chrome.driver", ConstantFile.chrome_File);
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
}
