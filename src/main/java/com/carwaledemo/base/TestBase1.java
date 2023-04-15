package com.carwaledemo.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.carwale.keywords.UIKeywords1;

public class TestBase1 {
	@BeforeMethod
	public static void openBrowser() {
		UIKeywords1.openBrowser("Chrome");
		UIKeywords1.launchUrl("https://www.carwale.com");
	}
//	@AfterMethod
//	public static void tearDown() {
//		UIKeywords1.closeBrowser();
//	}
}
