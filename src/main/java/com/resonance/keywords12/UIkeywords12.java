package com.resonance.keywords12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIkeywords12 {
	public static RemoteWebDriver driver ;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.chromedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.err.println("Invlaid browser name: " + browserName);
		}
	}

	public static void launchUrl(String url) {
		driver.get(url);
		System.out.println("Url is launched");
	}

	public static String getTitle() {
		System.out.println("Title of page: "+driver.getTitle());
		return driver.getTitle();
		
	}

	/**
	 * This method can be used to enter provided text in specified
	 * {@code WebElement}
	 * 
	 * @param element     in which you want to enter text
	 * @param textToEnter this is the text that you want to enter
	 * 
	 */
	public static void enterText(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);
	}

	public static void enterText(By by, String textToEnter) {
		driver.findElement(by).sendKeys(textToEnter);
	}

	public static void enterText(String locatorValue, String textToEnter) {
		driver.findElement(By.cssSelector(locatorValue)).sendKeys(textToEnter);
	}

	public static void click(String locatorType, String locatorValue) {
		     
	}
	public  static void closeBrowser() {
          driver.close();
          System.out.println("Browser windows are closed");
	}
	public static void quiteBrowser() {
           driver.quit();
           System.out.println("Browser windows are quit");
	}

	public static void click(String locator) {
		String locatorType = locator.split("##")[0];
		String locatorValue = locator.split("##")[1];
		 // driver.findElement(By.cssSelector(locator)).click();
		switch (locatorType) {
		case "XPATH":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
		case "CSS":
			driver.findElement(By.cssSelector(locatorValue)).click();
		/*case "ID":
			driver.findElement(By.id(locatorValue)).click();*/
			break;
		default:
			System.out.println("Invalid locator type: "+locatorType);
			break;
		}
	}
}
