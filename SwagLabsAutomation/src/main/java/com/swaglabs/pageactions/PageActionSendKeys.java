package com.swaglabs.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageActionSendKeys {
		
	public static void SendkeysAction(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}
}
