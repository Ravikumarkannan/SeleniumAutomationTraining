package com.swagalabs.testscript;

import java.util.Properties;

import org.testng.annotations.Test;

import com.swaglabs.dataallocators.PathAllocator;
import com.swaglabs.dataallocators.ValidationDataAllocator;
import com.swaglabs.helper.HomePageHelper;
import com.swaglabs.testbase.Testbase;

public class HomePageValidation extends Testbase {
	Properties properties;
	PathAllocator pathKey = new PathAllocator();
	ValidationDataAllocator validKey = new ValidationDataAllocator();
	
	@Test
	public void homePageValidation() throws Exception {
		pathKey.getPathData();
		validKey.getValidationData();

		HomePageHelper.productValidation(driver,pathKey.getName_Product1(),validKey.getName_Product1(),pathKey.getImg_Product1(),validKey.getImg_Product1(), pathKey.getPrice_Product1(), validKey.getPrice_Product1());
		HomePageHelper.productValidation(driver, pathKey.getName_Product2(), validKey.name_Product2, pathKey.getImg_Product2(), validKey.getImg_Product2(), pathKey.getPrice_Product2(), validKey.getPrice_Product2());
		HomePageHelper.productValidation(driver, pathKey.getName_Product3(), validKey.name_Product3, pathKey.getImg_Product3(), validKey.getImg_Product3(), pathKey.getPrice_Product3(), validKey.getPrice_Product3());
	}
}
