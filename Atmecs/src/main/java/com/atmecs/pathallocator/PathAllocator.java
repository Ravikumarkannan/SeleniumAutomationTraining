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
		setHomePage();
		setAtmecs_Cloudservice();
		setExplore();
		setAtmecsCareers();
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage() {
		homePage = property.getProperty("loc.atmecs.home");
	}

	public String getAtmecs_Cloudservice() {
		return atmecs_CloudService;
	}

	public void setAtmecs_Cloudservice() {
		atmecs_CloudService = property.getProperty("loc.atmecs.cloudservice");
	}

	public String getExplore() {
		return explore;
	}
	public void setExplore() {
		explore=property.getProperty("loc.atmecs.explore");
	}
	
	public String getAtmecsCareers() {
		return atmecs_careers;
	}
	public void setAtmecsCareers() {
		atmecs_careers=property.getProperty("loc.atmecs.careers");
	}
	public static void main(String[] args) throws Exception {
		PathAllocator path=new PathAllocator();
		path.getData();
		}
}
