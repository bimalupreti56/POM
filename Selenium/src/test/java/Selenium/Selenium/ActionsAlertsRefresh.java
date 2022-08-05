package Selenium.Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsAlertsRefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.lunchBrowser("chrome");
		WebElementUtil ElementUtil = new WebElementUtil(driver);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act = new Actions(driver);
		//act.sendKeys(driver.findElement(By.id("email")),"bimal").perform();
		//driver.findElement(By.xpath("//*[@id=\"u_0_5_05\"]")).click();
		By rightClick = By.xpath("/html/body/div/section/div/div/div/p/span");
		By spanOptions = By.xpath("/html/body/ul//span");
		
		//act.click(driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"))).perform();
		act.contextClick(driver.findElement(rightClick)).perform();
		
		//getting elements and puttin it in list 
		List <WebElement> options = driver.findElements(spanOptions);
		for (WebElement elm : options) {
			String function = elm.getText();
			if (function.equals("Copy")) {
				elm.click();
				break;
			}
		}
		String s = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(s);
		
		//refresh
		driver.navigate().refresh();

		act.contextClick(driver.findElement(rightClick)).perform();
		
		//driver.findElement(By.id("pass")).sendKeys("aa");
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[2]")).click();
	
	}

}
