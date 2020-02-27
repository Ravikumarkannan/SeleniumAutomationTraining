package com.atmecs.pathallocator;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.constantfile.ConstantFile;
import com.atmecs.locators.Locators;

public class PathAllocator {
	Properties property;
	String homePage;
	String explore;
	String atmecs_CloudService;
	String atmecs_careers;

	public void getData() {
		try {
			property = Locators.loadProperty(ConstantFile.locator_File);
		} catch (IOException e) {
			e.printStackTrace();
		}
		setExplore();
		setAtmecs_Cloudservice();
		setAtmecsCareers();
		setHomePage();
	}

	public String getExplore() { // navigate to expore
		return explore;
	}

	public void setExplore() {
		explore = property.getProperty("loc.atmecs.explore");
	}

	public String getAtmecs_Cloudservice() { // navigate to cloud service
		return atmecs_CloudService;
	}

	public void setAtmecs_Cloudservice() {
		atmecs_CloudService = property.getProperty("loc.atmecs.cloudservice");
	}

	public String getAtmecsCareers() { // navigate to careers
		return atmecs_careers;
	}

	public void setAtmecsCareers() {
		atmecs_careers = property.getProperty("loc.atmecs.careers");
	}

	public String getHomePage() { // navigate to home page
		return homePage;
	}

	public void setHomePage() {
		homePage = property.getProperty("loc.atmecs.home");
	}
}
