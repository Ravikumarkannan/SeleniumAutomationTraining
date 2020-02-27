package com.swaglabs.helper;

import org.openqa.selenium.WebDriver;

import com.swaglabs.pageactions.PageDataGet;
import com.swaglabs.validate.ValidateResults;

public class HomePageInfo {
	
	public static void validateHomePage(WebDriver driver, String dataTitle,String dataUrl) {
		PageDataGet.getTitle(driver);
		ValidateResults.validateData(PageDataGet.pageTitle, dataTitle);
		PageDataGet.getCurrentUrl(driver);
		ValidateResults.validateData(PageDataGet.currentUrl, dataUrl);
	}
}
