package test.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {

	@BeforeTest
	public void test() {
		System.out.println("before testing");
	}
	
	@Test
	public void test2() {
		System.out.println("testing1");
	}
	
	@Test
	public void test22() {
		System.out.println("testing");
	}
	
	@AfterTest
	public void test3() {
		System.out.println("After testing");
	}
}
