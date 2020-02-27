package com.swaglabs.pageactions;

import org.openqa.selenium.WebDriver;

public class PageDataGet {
	public static String pageTitle;
	public static String currentUrl;

	public static String getTitle(WebDriver driver) {
		pageTitle = driver.getTitle();
		return pageTitle;
	}

	public static String getCurrentUrl(WebDriver driver) {
		currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
}
