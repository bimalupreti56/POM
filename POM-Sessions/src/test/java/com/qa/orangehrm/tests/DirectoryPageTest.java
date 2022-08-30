package com.qa.orangehrm.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseTest;

public class DirectoryPageTest extends BaseTest{

	@BeforeClass
	public void setUp() {
		
		dir = loginPage.navToDirectoryPage("admin","admin123");
		
	}
	
	@Test
	public void test() {
		dir.searchEmp();
	}
}
