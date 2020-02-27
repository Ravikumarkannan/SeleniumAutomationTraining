package com.swaglabs.helper;

import org.openqa.selenium.WebDriver;

import com.swaglabs.pageactions.ProductDataGet;
import com.swaglabs.validate.ValidateResults;

public class HomePageHelper {
	public static void productValidation(WebDriver driver, String pathProductName, String dataProductname,String pathProductImg, String dataProductImg, String pathProductPrice, String dataProductPrice) {

		ProductDataGet.getTextName(driver, pathProductName);
		ValidateResults.validateData(ProductDataGet.textName,dataProductname);
		System.out.println("Product Name is:" + ProductDataGet.textName);

		ProductDataGet.getImgAttribute(driver, pathProductImg);
		ValidateResults.validateData(ProductDataGet.textImg, dataProductImg);
		ValidateResults.validateImage(driver, pathProductImg);
		System.out.println("Product Image Attribute is:"+ ProductDataGet.textImg);
		
		ProductDataGet.getTextPrice(driver, pathProductPrice);
		ValidateResults.validateData(ProductDataGet.textPrice,dataProductPrice );
		System.out.println("Product price is:"+ProductDataGet.textPrice);
	}
}
