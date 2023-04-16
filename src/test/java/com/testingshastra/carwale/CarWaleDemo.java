package com.testingshastra.carwale;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class CarWaleDemo {
	@Test
	public static void verifythatCarNameMatchedfromUsedcarsLocation() {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.carwale.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.cssSelector("li.o-pAUxC.nS6XVS")).click();

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector("a[href=\"/used/cars-for-sale/\"]"));
		action.moveToElement(element).build().perform();
		element.click();
		driver.executeScript("window.scrollBy(0,300)");
		// driver.navigate().refresh();
		driver.findElement(By.cssSelector("span#closeLocIcon")).click();
		// driver.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.cssSelector("select#drpCity")).sendKeys("Navi Mumbai");
		String Actualcarname = driver
				.findElement(By.cssSelector("span.spancarname.card-detail-block__title-text-with-year")).getText();
		String expectedcar = "Hyundai Creta";
		if (Actualcarname.equals(expectedcar)) {
			System.out.println("Result Matched");

		} else {
			System.out.println("Result did not Matched");
		}
	}

	@Test
	public void verifyFuelTypeOfMarutiSuzukiUsedCar() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.carwale.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.cssSelector("li.o-pAUxC.nS6XVS")).click();

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector("a[href=\"/used/cars-for-sale/\"]"));
		action.moveToElement(element).build().perform();
		element.click();
		driver.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.cssSelector("span#closeLocIcon")).click();
		driver.findElement(By.cssSelector("div.manufacture-box.content-inner-block-10")).click();

		driver.findElement(By.cssSelector("input[placeholder=\"Select Manufacturer\"]")).sendKeys("Mahindra");
		driver.findElement(By.cssSelector("li[data-testing-id=\"select-make-9\"]")).click();
		String ActualFueltype1 = driver.findElement(By.cssSelector("span[title=\"Diesel\"]")).getText();
		String expectedfuel = "Diesel";
		if (ActualFueltype1.equals(expectedfuel)) {
			System.out.println("result matched");

		} else {
			System.out.println("Result did not matched");
		}

	}

	@Test
	public void verifyThatCertifiedUsedCarsWithColors() {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.carwale.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.cssSelector("li.o-pAUxC.nS6XVS")).click();

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector("a[href=\"/used/cars-for-sale/\"]"));
		action.moveToElement(element).build().perform();
		element.click();
		driver.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.cssSelector("span#closeLocIcon")).click();

		driver.findElement(By.id("8")).click();
		driver.findElement(By.cssSelector("li[name=\"White\"]")).click();

	}
	
}