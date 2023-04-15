package com.carwale.keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class UIKeywords1 {
	public static RemoteWebDriver driver;
	public static FluentWait<WebDriver> wait;
	

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("--incognito");
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
	
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void waitForElementToBePresent(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by) );
	}

	public static void closeBrowser() {
		driver.close();
	}
	public static WebElement findElement(String locatorType,String locatorValue) {
		if(locatorType.equalsIgnoreCase("xpath")) {
		return driver.findElement(By.xpath(locatorValue));
	}else if(locatorType.equalsIgnoreCase("id")) {
	return driver.findElement(By.id(locatorValue));
	}else if(locatorType.equalsIgnoreCase("name")) {
		return driver.findElement(By.name(locatorValue));
	}else if(locatorType.equalsIgnoreCase("className")) {
		return driver.findElement(By.className(locatorValue));
	}else if(locatorType.equalsIgnoreCase("linkText")) {
		return driver.findElement(By.linkText(locatorValue));
	}else if(locatorType.equalsIgnoreCase("partialLinkText")) {
		return driver.findElement(By.partialLinkText(locatorValue));
		
	}else if(locatorType.equalsIgnoreCase("cssSelector")) {
		return driver.findElement(By.cssSelector(locatorValue));
	}else if(locatorType.equalsIgnoreCase("tagName")) {
		return driver.findElement(By.tagName(locatorValue));
	}
		return null;
		
}
	public static void getTextMethod(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}

	public static void clickOn(By by) {						//overloading using by
		driver.findElement(by).click();
	}
	public static void clickOn(String locator) {					// overloading using string
		driver.findElement(By.cssSelector(locator)).click();
}
	public static void scrollDown(int x, int y) {
		driver.executeScript("windows.scrollBy(arguments[0],arguments[1])");

	}
	public static void moveToAction( String locatorType,String locatorValue) {
		Actions action=new Actions(driver);
		action.moveToElement(findElement(locatorType,locatorValue));
		action.perform();
	}
		public static void mouseHover(WebElement element) {
				Actions actions = new Actions(driver);
				actions.moveToElement(element).build().perform();
			}
			
		
	

	private static WebElement findElement(By cssSelector) {
		// TODO Auto-generated method stub
		return null;
	}
}