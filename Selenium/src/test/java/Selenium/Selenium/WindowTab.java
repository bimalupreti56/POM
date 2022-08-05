package Selenium.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.lunchBrowser("chrome");
		WebElementUtil ElementUtil = new WebElementUtil(driver);
		browser.lunchUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login\r\n");
		
		Thread.sleep(1000);
		
		
		By loc1 = By.xpath("//*[@id=\"social-icons\"]/a[2]");
		By loc2 = By.xpath("//*[@id=\"social-icons\"]/a[3]");
		ElementUtil.click(loc1);
		
		Set<String>	handels = driver.getWindowHandles();
		Iterator <String> itr = handels.iterator();
		
		String parent = itr.next();
		String child = itr.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
				
		driver.switchTo().window(parent);
		ElementUtil.click(loc2);
		String child1 = itr.next();
		driver.switchTo().window(child1);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[3]/section/div[1]/h2/div[2]/span")).getText());
		
		
		
	}
	


}
