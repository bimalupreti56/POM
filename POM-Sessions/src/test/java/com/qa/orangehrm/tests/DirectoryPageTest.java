package com.qa.orangehrm.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseTest;

public class DirectoryPageTest extends BaseTest{

	@BeforeClass
	public void setUppp() {
		
		dir = loginPage.navToDirectoryPage(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void test() {
		dir.searchEmp();
	}
}
