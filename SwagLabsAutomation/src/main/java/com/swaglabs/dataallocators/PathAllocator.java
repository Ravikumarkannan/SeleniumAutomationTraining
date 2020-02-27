package com.swaglabs.dataallocators;

import java.util.Properties;
import com.swaglabs.Locationreader.Locators;
import com.swaglabs.constantfile.ConstantFiles;
import com.swaglabs.helper.XpathPrice;

public class PathAllocator {
	public Properties properties;
	public String userName;
	public String password;
	public String login;

	public String img_Product1;
	public String name_Product1;
	public String price_Product1;

	public String img_Product2;
	public String name_Product2;
	public String price_Product2;

	public String img_Product3;
	public String name_Product3;
	public String price_Product3;
	
	public String dropdown;

	public void getPathData() throws Exception {
		properties = Locators.loadProperty(ConstantFiles.locators_file);
		setuserName();
		setPassword();
		setLogin();
		
		setImg_Product1();
		setName_Product1();
		setPrice_Product1();
		
		setImg_Product2();
		setName_Product2();
		setPrice_Product2();
		
		setImg_Product3();
		setName_Product3();
		setPrice_Product3();
		
		setDropdownPath();
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName() {
		userName = properties.getProperty("loc.UserName");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword() {
		password = properties.getProperty("loc.PassWord");

	}

	public String getLogin() {
		return login;
	}

	public void setLogin() {
		login = properties.getProperty("loc.Login");
	}

	public String getImg_Product1() {
		return img_Product1;
	}

	public void setImg_Product1() {
		img_Product1 = properties.getProperty("loc.img.product1");
	}

	public String getName_Product1() {
		return name_Product1;
	}

	public void setName_Product1() {
		name_Product1 = properties.getProperty("loc.name.product1");
	}

	public String getPrice_Product1() {
		return price_Product1;
	}

	public void setPrice_Product1() throws Exception {
		price_Product1 = XpathPrice.reusableTextPath("29.99");
	}

	public String getImg_Product2() {
		return img_Product2;
	}

	public void setImg_Product2() {
		img_Product2 = properties.getProperty("loc.img.product2");
	}

	public String getName_Product2() {
		return name_Product2;
	}

	public void setName_Product2() {
		name_Product2 = properties.getProperty("loc.name.product2");
	}

	public String getPrice_Product2() {
		return price_Product2;
	}

	public void setPrice_Product2() throws Exception {
		price_Product2 = XpathPrice.reusableTextPath("15.99");
	}

	public String getImg_Product3() {
		return img_Product3;
	}

	public void setImg_Product3() {
		img_Product3 = properties.getProperty("loc.img.product3");
	}

	public String getName_Product3() {
		return name_Product3;
	}

	public void setName_Product3() {
		name_Product3 = properties.getProperty("loc.name.product3");
	}

	public String getPrice_Product3() {
		return price_Product3;
	}

	public void setPrice_Product3() throws Exception {
		price_Product3 = XpathPrice.reusableTextPath("49.99");
	}
	
	public String getDropdownpath() {
		return dropdown;
	}
	public void setDropdownPath() {
		dropdown=properties.getProperty("loc.dropdown.price");
	}
}
