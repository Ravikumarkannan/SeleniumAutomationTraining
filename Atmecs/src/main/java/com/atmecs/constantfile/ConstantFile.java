package com.atmecs.constantfile;

import java.io.File;

public class ConstantFile {
	public final static String file_Home =System.getProperty("user.dir") + File.separator;
	
	public final static String chrome_Home = file_Home +"chromedriver" + File.separator;
	public final static String chrome_File= chrome_Home + "chromedriver.exe";
	
	public final static String config_Home = file_Home + "atmecs.resources" + File.separator;
	public final static String config_File = config_Home + "atmecs.config.properties";
	
	public final static String locator_File = config_Home + "atmecs.xpath.properties";
}
