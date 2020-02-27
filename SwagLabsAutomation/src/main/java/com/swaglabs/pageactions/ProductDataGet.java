package com.swaglabs.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDataGet {
	public static String textName;
	public static String textImg;
	public static String textPrice;
	
	public static String getTextName(WebDriver driver, String pathProductName) {
		WebElement element=driver.findElement(By.xpath(pathProductName));
		textName=element.getText();
		return textName;
	}
	public static String getImgAttribute(WebDriver driver, String pathProductImg) {
		WebElement element=driver.findElement(By.xpath(pathProductImg));
		textImg=element.getAttribute("src");
		return textImg;
	}
	public static String getTextPrice(WebDriver driver, String pathProductPrice) {
		WebElement element=driver.findElement(By.xpath(pathProductPrice));
		textPrice=element.getText();
		return textPrice;
	}
}
