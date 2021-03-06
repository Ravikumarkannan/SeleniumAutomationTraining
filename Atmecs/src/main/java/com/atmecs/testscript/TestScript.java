package com.atmecs.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.pathallocator.PathAllocator;
import com.atmecs.testbase.Testbase;

public class TestScript extends Testbase {

	PathAllocator key = new PathAllocator();

	@Test
	public void anavigateToCloudService() {
		key.getData();
		driver.findElement(By.xpath(key.getExplore())).click();
		driver.findElement(By.xpath(key.getAtmecs_Cloudservice())).click();
	}

	@Test
	public void bnavigateToCareers() {
		driver.findElement(By.linkText(key.getAtmecsCareers())).click();
	}

	@Test
	public void creturnToHomepage() {
		driver.findElement(By.xpath(key.getHomePage())).click();
	}
}
