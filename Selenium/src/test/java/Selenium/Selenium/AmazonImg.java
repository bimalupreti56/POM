package Selenium.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonImg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.lunchBrowser("chrome");
		browser.lunchUrl("https://www.amazon.com/");
		WebElementUtil ElementUtil = new WebElementUtil(driver);

		By tagname = By.tagName("img");
		List<WebElement> lists = ElementUtil.listOfLink(tagname);

		System.out.println(lists.size());
		
		for (WebElement elm : lists) {
			System.out.println(elm.getAttribute("src"));
		}

	}

}
