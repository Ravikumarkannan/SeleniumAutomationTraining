package com.swaglabs.validate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.swaglabs.pageactions.ProductDataGet;

public class ValidateResults {
	static boolean isdisplayed;
	public static boolean validateData(String actual, String expected) {
		try {
			Assert.assertEquals(actual,expected);
			System.out.println("validation is done for:"+actual);
			return true;
		} catch (AssertionError assertionError) {
			return false;
		}
	}
	
	public static void validateImage(WebDriver driver, String imgPath) {
		isdisplayed=driver.findElement(By.xpath(imgPath)).isDisplayed();
		if (isdisplayed) {
			System.out.println(ProductDataGet.textImg+" is present");
		}
		else {
			System.out.println(ProductDataGet.textImg+" is not present");
		}
	}
}
