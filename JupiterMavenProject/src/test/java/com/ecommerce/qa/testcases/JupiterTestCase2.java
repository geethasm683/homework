package com.ecommerce.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.qa.pages.JupiterToysHomePage;

public class JupiterTestCase2 {
	
	private static WebDriver driver=null;
	static JavascriptExecutor js;
	JupiterToysHomePage jupiterHome;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.get("https://jupiter.cloud.planittesting.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void jupiterContactTest() throws InterruptedException, IOException {
		String title = driver.getTitle();
		System.out.println("Title Of the page : " + title);
		JupiterToysHomePage.ContactsLabel(driver).click();
		Thread.sleep(1000);
		JupiterToysHomePage.FeedbackForeName(driver).sendKeys("TESTEXAMPLE");
		JupiterToysHomePage.FeedbackEmail(driver).sendKeys("exampletest@yahoo.com");
		Thread.sleep(500);
		JupiterToysHomePage.FeedbackMessage(driver).sendKeys("Thanks");
		JupiterToysHomePage.ContactsSubmitLabel(driver).click();
		Thread.sleep(6000);
		Assert.assertTrue(JupiterToysHomePage.ValidateSuccessMessage(driver).isDisplayed());
}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	

}
