package Selenium.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebElementUtil {

	WebDriver driver;
	Actions act;

	public WebElementUtil(WebDriver dr) {
		driver = dr;
	}

	public WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public void click(By locator) {
		getElement(locator).click();
	}

	public void send(By name) {
		// TODO Auto-generated method stub
		getElement(name).sendKeys("Bimal");
	}

	public List<WebElement> listOfLink(By locator) {

		return driver.findElements(locator);

	}

	

	public void selectByIndex(By locator, int value) {

		Select select = new Select(driver.findElement(locator));
		select.selectByIndex(value);
	}
	
	public void selectByText(By locator, String value) {

		Select select = new Select(driver.findElement(locator));
		select.selectByVisibleText(value);
	}
	
	public void selectByValue(By locator, String value) {

		Select select = new Select(driver.findElement(locator));
		select.selectByValue(value);;
	}

}
