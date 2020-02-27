package com.swagalabs.testscript;

import com.swaglabs.dataallocators.PathAllocator;
import com.swaglabs.dataallocators.TestDataAllocator;
import com.swaglabs.pageactions.PageActionDropdown;
import com.swaglabs.testbase.Testbase;

public class SortProduct extends Testbase{
	
	PathAllocator pathKey = new PathAllocator();
	TestDataAllocator testKey = new TestDataAllocator();
	
	public void sortProducts() throws Exception {
		pathKey.getPathData();
		testKey.getTestData();
		
		PageActionDropdown.dropdown(driver, pathKey.getDropdownpath(), testKey.getFilterValue());
	}
}
