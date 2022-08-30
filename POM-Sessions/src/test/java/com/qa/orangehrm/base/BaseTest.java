package com.qa.orangehrm.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.orangehrm.factory.DriverFactory;
import com.qa.orangehrm.pages.AddEmployeePage;
import com.qa.orangehrm.pages.Directory;
import com.qa.orangehrm.pages.LoginPage;
import com.qa.orangehrm.pages.PimPage;
import com.qa.orangehrm.pages.PunchInPage;

public class BaseTest {
	
	private WebDriver driver;
	public Properties prop;
	public LoginPage loginPage;
	public PimPage pimPage;
	public AddEmployeePage addEmpPage;
	public PunchInPage punchInPage;
	public Directory dir;
	DriverFactory driverFact;
	
	
	@BeforeTest
	public void setUp() {
		driverFact = new DriverFactory();	
		prop = driverFact.init_prop();
		driver = driverFact.init_driver("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
	
	

}
