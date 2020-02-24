package com.atmecs.locators;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Locators {
	static Properties property;
	public static Properties loadProperty(String path) throws IOException {
		property=new Properties();
		FileInputStream file=new FileInputStream(path);
		property.load(file);
		return property;
	}
}
