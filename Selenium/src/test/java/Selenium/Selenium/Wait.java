package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.lunchBrowser("chrome");
		WebElementUtil ElementUtil = new WebElementUtil(driver);
		driver.get("https://yourstodiscovernepal.com/");

		By userName = By.id("input-19");
		By pass = By.id("input-23");
		By login = By.id("login");
		
		WebDriverWait wait = new WebDriverWait(driver,5,1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(userName)).sendKeys("bimal");
		wait.until(ExpectedConditions.presenceOfElementLocated(pass)).sendKeys("123");
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
		
	}

}
