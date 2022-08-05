package Selenium.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FreshworkLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.lunchBrowser("chrome");
		// browser.lunchUrl("file:///C:/Users/upret/OneDrive/Desktop/test.html");
		browser.lunchUrl("https://www.freshworks.com/#");
		WebElementUtil ElementUtil = new WebElementUtil(driver);

		By tagname = By.tagName("a");
		List<WebElement> lists = ElementUtil.listOfLink(tagname);

		System.out.println(lists.size());

		for (WebElement elm : lists) {

			if (!elm.getText().isEmpty()) {
				System.out.println(elm.getText() + " ----> " + elm.getAttribute("href"));
			}
		}

		// By sel = By.id("cars");
		// ElementUtil.selectByText(sel, "Saab");
		// ElementUtil.selectByValue(sel, "volvo");

	}

}
