package com.swaglabs.Locationreader;

import java.io.FileInputStream;
import java.util.Properties;

public class Locators {
	public static Properties properties;

	public static Properties loadProperty(String path) throws Exception {
		properties = new Properties();
		FileInputStream file = new FileInputStream(path);
		properties.load(file);
		return properties;
	}
}
