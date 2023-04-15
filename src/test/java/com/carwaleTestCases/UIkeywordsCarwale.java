package com.carwaleTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.carwale.keywords.UIKeywords1;
import com.carwaledemo.base.TestBase1;

public class UIkeywordsCarwale extends TestBase1{
//	//public void verifythatCarNameMatchedfromUsedcarsLocation() {
//
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		option.addArguments("--incognito");
//		ChromeDriver driver = new ChromeDriver(option);
//		driver.get("https://www.carwale.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		driver.findElement(By.cssSelector("li.o-pAUxC.nS6XVS")).click();
//
//		Actions action = new Actions(driver);
//		WebElement element = driver.findElement(By.cssSelector("a[href=\"/used/cars-for-sale/\"]"));
//		action.moveToElement(element).build().perform();
//		element.click();
//		driver.executeScript("window.scrollBy(0,300)");
//		// driver.navigate().refresh();
//		driver.findElement(By.cssSelector("span#closeLocIcon")).click();
//		driver.findElement(By.cssSelector("select#drpCity")).sendKeys("pune");
//		String Actualcarname = driver.findElement(By.cssSelector("h2.card-detail-block__title")).getText();
//		String expectedcar = "Maruti Suzuki Wagon";
//		if (Actualcarname.equals(expectedcar)) {
//			System.out.println("result matched");
//
//		} else {
//			System.out.println("Result did not matched");
//		}


	//UIKeyword
	@Test
	public void verifythatCarNameMatchedfromUsedcarsLocation()throws InterruptedException {
		UIKeywords1.waitForElementToBePresent(By.cssSelector("li.o-pAUxC.nS6XVS"));
		UIKeywords1.clickOn(By.cssSelector("li.o-pAUxC.nS6XVS"));	
		WebElement element=UIKeywords1.driver.findElement(By.xpath("//a[text()='Buy Used Cars']"));
		UIKeywords1.mouseHover(element);
		
		}
		
	
	
	}
	
	
	

