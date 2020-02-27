package com.swaglabs.dataallocators;

import java.util.Properties;

import com.swaglabs.Locationreader.Locators;
import com.swaglabs.constantfile.ConstantFiles;

public class TestDataAllocator {
	public Properties properties;
	public String userName;
	public String password;
	public String filterValue;

	public void getTestData() throws Exception {
		properties = Locators.loadProperty(ConstantFiles.testdata_file);
		setUserName();
		setPassword();
		setFilterValue();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName() {
		userName = properties.getProperty("username");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword() {
		password = properties.getProperty("password");
	}
	public String getFilterValue() {
		return filterValue;
	}
	public void setFilterValue() {
		filterValue=properties.getProperty("filtervalue");
	}
}
