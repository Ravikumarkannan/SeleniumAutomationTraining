package com.swaglabs.constantfile;

import java.io.File;

public class ConstantFiles {
	public final static String file_Home = System.getProperty("user.dir") + File.separator;

	public final static String driver_home = file_Home + "driver" + File.separator;
	public final static String chrome_file = driver_home + "chromedriver.exe";

	public final static String configuration_home = file_Home + "resources" + File.separator + "configurationdata" + File.separator;
	public final static String configuration_file = configuration_home + "configuration.properties";

	public final static String locators_home = file_Home + "resources" + File.separator + "locators" + File.separator;
	public final static String locators_file = locators_home + "locators.properties";
	
	public final static String testdata_home= file_Home + "resources" + File.separator + "testdata" + File.separator;
	public final static String testdata_file= testdata_home + "testdata.properties";

	public final static String validationdata_home=file_Home + "resources" + File.separator + "validationdata" + File.separator;
	public final static String validationdata_file= validationdata_home + "validationdata.properties";
}
