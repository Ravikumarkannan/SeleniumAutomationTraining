package com.swaglabs.helper;

import java.util.Properties;

import com.swaglabs.Locationreader.Locators;
import com.swaglabs.constantfile.ConstantFiles;

public class XpathPrice {
	
	static Properties properties;
	public static String reusableTextPath(String replaceValue) throws Exception {
		properties=Locators.loadProperty(ConstantFiles.locators_file);
		String inputValue = properties.getProperty("loc.price.product1");
		String outputValue = inputValue.replace("xxx", replaceValue);
		return outputValue;
		}
}
