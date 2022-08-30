package com.qa.orangehrm.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.qa.orangehrm.base.BaseTest;
import com.qa.orangehrm.utils.Constants;
import com.qa.orangehrm.utils.Error;
import com.qa.orangehrm.utils.ExcelUtil;

public class AddEmployeePageTest extends BaseTest {
	
	@BeforeClass
	public void setupAddEmp() {
		addEmpPage = loginPage.navigateToAddEmpPage();
	}
	
	@DataProvider
	public Object[][] getEmpData(){
		Object data[][] = ExcelUtil.getTestData(Constants.EMP_SHEET_NAME);
		return data;
	}
	
	@Test(dataProvider = "getEmpData")
	public void addEmployeeDataTest(String firstName, String middleName, String lastName, 
			String empId, String photoPath) {
		Assert.assertTrue(addEmpPage.addEmployee(firstName,middleName,lastName,empId,photoPath));
	}
	
	

}
