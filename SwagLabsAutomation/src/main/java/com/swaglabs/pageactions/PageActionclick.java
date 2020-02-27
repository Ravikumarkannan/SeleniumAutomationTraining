package com.swaglabs.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageActionclick {
	public static void clickAction(WebDriver driver,String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
	}
}
