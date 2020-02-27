package com.swagalabs.testscript;

import java.util.Properties;

import org.testng.annotations.Test;

import com.swaglabs.dataallocators.PathAllocator;
import com.swaglabs.dataallocators.TestDataAllocator;
import com.swaglabs.dataallocators.ValidationDataAllocator;
import com.swaglabs.helper.HomePageInfo;
import com.swaglabs.pageactions.PageActionSendKeys;
import com.swaglabs.pageactions.PageActionclick;
import com.swaglabs.testbase.Testbase;

public class Login extends Testbase {
	Properties properties;

	PathAllocator path_key = new PathAllocator();
	TestDataAllocator testTata_key= new TestDataAllocator();
	ValidationDataAllocator validKey=new ValidationDataAllocator();

	@Test
	public void login() throws Exception {
		path_key.getPathData();
		testTata_key.getTestData();
		validKey.getValidationData();
		PageActionSendKeys.SendkeysAction(driver, path_key.getuserName(), testTata_key.getUserName());
		PageActionSendKeys.SendkeysAction(driver, path_key.getPassword(), testTata_key.getPassword());
		PageActionclick.clickAction(driver, path_key.getLogin());
		
		HomePageInfo.validateHomePage(driver, validKey.getPageTitle(),validKey.getCurrentUrl());
	}
}
