package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Driver {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		// System.setProperty("webdriver.chrome.driver","D:\\April2022\\chromedriver.exe");

		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		if (title.equals("Facebook - log in or sign up"))
			System.out.println("Valid title");
		else
			System.out.println("Invalid title");
		
		//driver.findElement(By.id("email")).sendKeys("test");
		
		interactElement("email", "test123");
		interactElement("pass", "password");

	}

	static void interactElement(String findBy, String send) {
		
		By  id = By.id(findBy);
		driver.findElement(id).sendKeys(send);

		
	}
}
