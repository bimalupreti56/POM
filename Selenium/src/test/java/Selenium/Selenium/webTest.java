package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class webTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		BrowserUtil util = new BrowserUtil();
		WebDriver driver = util.lunchBrowser("chrome");
		WebElementUtil elementUtil = new WebElementUtil(driver);
	 	  
		util.lunchUrl("https://www.facebook.com/");
		
		By newAccount = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a");
		By name = By.id("email");
		
		elementUtil.click(newAccount);
		
		//elementUtil.enter(name);
	}

}
