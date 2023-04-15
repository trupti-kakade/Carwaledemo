package com.carwaleTestCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest1 {
	@Test
	public void verifythatCarNameMatchedfromUsedcarsLocation() {

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
		driver.findElement(By.cssSelector("select#drpCity")).sendKeys("pune");
		String Actualcarname = driver.findElement(By.cssSelector("h2.card-detail-block__title")).getText();
		String expectedcar = "Maruti Suzuki Wagon";
		if (Actualcarname.equals(expectedcar)) {
			System.out.println("result matched");

		} else {
			System.out.println("Result did not matched");
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

		driver.findElement(By.cssSelector("input[placeholder=\"Select Manufacturer\"]")).sendKeys("Maruti Suzuki");
		driver.findElement(By.cssSelector("li[data-testing-id=\"select-make-10\"]")).click();
		String ActualFueltype1 = driver.findElement(By.cssSelector("span[title=\"Diesel\"]")).getText();
		String expectedfuel = "Diesel";
		if (ActualFueltype1.equals(expectedfuel)) {
			System.out.println("result matched");

		} else {
			System.out.println("Result did not matched");
		}

	}

	@Test
	public void verifyColourOfUsedCar() {

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
		driver.findElement(By.cssSelector("li[name=\"Purple\"]")).click();

	}

//	@Test
//	public void verifykilometerofMarutiSuzukiUsedCar() {
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		option.addArguments("--disable-notifications");
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
//		// driver.navigate().back();
//		driver.executeScript("window.scrollBy(0,300)");
//		driver.findElement(By.cssSelector("span#closeLocIcon")).click();
//		driver.findElement(By.cssSelector("div.manufacture-box.content-inner-block-10")).click();
//
//		driver.findElement(By.cssSelector("input[placeholder=\"Select Manufacturer\"]")).sendKeys("Maruti Suzuki");
//		driver.findElement(By.cssSelector("li[data-testing-id=\"select-make-10\"]")).click();
//		List<WebElement> kilometerElement = driver.findElements(By.cssSelector("span.slkms"));
//		for (WebElement originalkilometer : kilometerElement) {
//			String kilometer = originalkilometer.getText();
//			Assert.assertEquals(kilometer.contains("kilometer"), "kilometer not same" + kilometer);
//
////			String kilometer=originalkilometer.getText();
////			System.out.println(kilometer);
////			String regex="([0-9]+[.][0-9]+)";
////			String input=kilometer;
////			
////			Pattern pattern=Pattern.compile(regex);
////			Matcher matcher=pattern.matcher(input);
////			while(matcher.find()) {
////				float perKilometer=Float.parseFloat(matcher.group());
////				Assert.assertTrue( perKilometer<75.00f);
////		}
//		}
//	}
	
	
	// PRANALI
	@Test
	public void verifyFuelTypeofMarutiSuzukiUsedCar() {// result matched
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
		driver.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.cssSelector("span#closeLocIcon")).click();
		//driver.findElement(By.cssSelector("div.manufacture-box.content-inner-block-7")).click();

		driver.findElement(By.cssSelector("input[placeholder=\"Select Manufacturer\"]")).sendKeys("Honda");
		driver.findElement(By.cssSelector("li[data-testing-id=\"select-make-7\"]")).click();

		String ActualFueltype1 = driver.findElement(By.cssSelector("span[title=\"Petrol\"]")).getText();
		String expectedfuel = "Petrol";
		if (ActualFueltype1.equals(expectedfuel)) {
			System.out.println("result matched");

		} else {
			System.out.println("Result did not matched");
		}

	}
	@Test
	public void verifyThatCertifiedUsedCarsWithColors1() {

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
		driver.findElement(By.cssSelector("li[name=\"Red\"]")).click();

	}
}