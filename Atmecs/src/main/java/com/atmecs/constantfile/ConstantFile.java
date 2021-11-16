package com.atmecs.constantfile;

import java.io.File;

public class ConstantFile {
	public final static String file_Home =System.getProperty("user.dir") + File.separator;
	
	public final static String chrome_Home = file_Home +"driver" + File.separator;
	public final static String chrome_File= chrome_Home + "chromedriver.exe";
	
	public final static String config_Home = file_Home + "atmecs.resources" +File.separator + "configurationdata" + File.separator;
	public final static String config_File = config_Home + "atmecs.config.properties";
	
	public final static String locator_Home = file_Home + "atmecs.resources" + File.separator + "locatorsdata" + File.separator;
	public final static String locator_File = locator_Home + "atmecs.xpath.properties";
	
	public final static String testdata_Home = file_Home + "atmecs.resources" + File.separator + "testdata" + File.separator;
	public final static String testdata_File =testdata_Home+ "Testdata.xlsx";
	
	public final static String validation_Home = file_Home + "atmecs.resources" + File.separator + "validationdata";
	public final static String validation_File= validation_Home;
	
	public final static String test = "test name";
} 
