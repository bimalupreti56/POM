package Selenium.Selenium;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;

public class TestNG {

	@BeforeMethod
	public void a() {
		System.out.println("test");
	}
	
	@Test
	public void b() {
		System.out.println("test");
	}
}
