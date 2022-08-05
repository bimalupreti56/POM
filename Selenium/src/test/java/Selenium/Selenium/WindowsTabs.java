package Selenium.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.lunchBrowser("chrome");
		WebElementUtil ElementUtil = new WebElementUtil(driver);
		browser.lunchUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login\r\n");
		
		Thread.sleep(2000);
		
		By loc1 = By.xpath("//*[@id=\"social-icons\"]/a[1]");
		By loc2 = By.xpath("//*[@id=\"social-icons\"]/a[2]");
		By loc3 = By.xpath("//*[@id=\"social-icons\"]/a[3]");
		By loc4 = By.xpath("//*[@id=\"social-icons\"]/a[4]");
		ElementUtil.click(loc1);
		ElementUtil.click(loc2);
		ElementUtil.click(loc3);
		ElementUtil.click(loc4);
		
		Set<String>	handels = driver.getWindowHandles();
		Iterator <String> itr = handels.iterator();
		String parentWindow = itr.next();
		String child1 = itr.next();
		String child2 = itr.next();
		String child3 = itr.next();
		
		System.out.println(driver.switchTo().window(parentWindow).getTitle());
		System.out.println(driver.switchTo().window(child1).getTitle());
		System.out.println(driver.switchTo().window(child2).getTitle());
		System.out.println(driver.switchTo().window(child3).getTitle());	
		
	}

}
