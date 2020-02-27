package com.swaglabs.dataallocators;

import java.util.Properties;

import com.swaglabs.Locationreader.Locators;
import com.swaglabs.constantfile.ConstantFiles;

public class ValidationDataAllocator {
	Properties properties;
	public String pageTitle;
	public String currentUrl;
	
	public String img_Product1;
	public String name_Product1;
	public String price_Product1;
	
	public String img_Product2;
	public String name_Product2;
	public String price_Product2;
	
	public String img_Product3;
	public String name_Product3;
	public String price_Product3;
	
	public void getValidationData() throws Exception {
		properties=Locators.loadProperty(ConstantFiles.validationdata_file);
		setPageTitle();
		setCurrentUrl();
		setImg_Product1();
		setName_Product1();
		setPrice_Product1();
		setImg_Product2();
		setName_Product2();
		setPrice_Product2();
		setImg_Product3();
		setName_Product3();
		setPrice_Product3();
	}
	
	public String getPageTitle() {
		return pageTitle;
	}
	public void setPageTitle() {
		pageTitle=properties.getProperty("valid.pageTitle");
	}
	
	public String getCurrentUrl() {
		return currentUrl;
	}
	public void setCurrentUrl() {
		currentUrl=properties.getProperty("valid.currentUrl");
	}
	
	
	
	
	public String getImg_Product1() {
		return img_Product1;
	}

	public void setImg_Product1() {
		img_Product1 = properties.getProperty("valid.img.product1");
	}
	
	public String getName_Product1() {
		return name_Product1;
	}

	public void setName_Product1() {
		name_Product1 = properties.getProperty("valid.name.product1");
	}

	public String getPrice_Product1() {
		return price_Product1;
	}

	public void setPrice_Product1() {
		price_Product1 = properties.getProperty("valid.price.product1");
	}
	
	public String getImg_Product2() {
		return img_Product2;
	}

	public void setImg_Product2() {
		img_Product2 = properties.getProperty("valid.img.product2");
	}
	
	public String getName_Product2() {
		return name_Product2;
	}

	public void setName_Product2() {
		name_Product2 = properties.getProperty("valid.name.product2");
	}

	public String getPrice_Product2() {
		return price_Product2;
	}

	public void setPrice_Product2() {
		price_Product2 = properties.getProperty("valid.price.product2");
	}

	public String getImg_Product3() {
		return img_Product3;
	}

	public void setImg_Product3() {
		img_Product3 = properties.getProperty("valid.img.product3");
	}
	
	public String getName_Product3() {
		return name_Product3;
	}

	public void setName_Product3() {
		name_Product3 = properties.getProperty("valid.name.product3");
	}

	public String getPrice_Product3() {
		return price_Product3;
	}

	public void setPrice_Product3() {
		price_Product3 = properties.getProperty("valid.price.product3");
	}
}
