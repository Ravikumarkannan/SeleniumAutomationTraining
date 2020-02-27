package com.swaglabs.testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.swaglabs.Locationreader.Locators;
import com.swaglabs.constantfile.ConstantFiles;

public class Testbase {
	Properties properties;
	String baseUrl;
	public static WebDriver driver;

	@BeforeTest
	public void invokeBrowser() throws Exception {
		properties = Locators.loadProperty(ConstantFiles.configuration_file);
		baseUrl = properties.getProperty("Url");
		System.setProperty("webdriver.chrome.driver", ConstantFiles.chrome_file);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
