package com.swaglabs.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageActionDropdown {
	public static void dropdown(WebDriver driver, String elementPath,String Value) {
		WebElement element=driver.findElement(By.xpath(elementPath));
		Select select=new Select(element);
		select.selectByValue(Value);
	}
}
