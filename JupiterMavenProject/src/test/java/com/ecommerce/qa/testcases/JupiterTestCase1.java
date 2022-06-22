package com.ecommerce.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.qa.pages.JupiterToysHomePage;

public class JupiterTestCase1 {
	
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

	@Test(invocationCount=5)
	public void jupiterContactTest() throws InterruptedException, IOException {
		String title = driver.getTitle();
		System.out.println("Title Of the page : " + title);
		JupiterToysHomePage.ContactsLabel(driver).click();
		Thread.sleep(1000);
		JupiterToysHomePage.ContactsSubmitLabel(driver).click();
		//Validate the error message
		String submitMessage=JupiterToysHomePage.SubmitMessage(driver).getText();
		Assert.assertEquals(submitMessage, "We welcome your feedback - but we won't get it unless you complete the form correctly.");
		JupiterToysHomePage.FeedbackForeName(driver).sendKeys("TESTEXAMPLE");
		JupiterToysHomePage.FeedbackEmail(driver).sendKeys("exampletest@yahoo.com");
		Thread.sleep(500);
		JupiterToysHomePage.FeedbackMessage(driver).sendKeys("Thanks");
		JupiterToysHomePage.ContactsSubmitLabel(driver).click();
		Thread.sleep(8000);
		Assert.assertTrue(JupiterToysHomePage.ValidateSuccessMessage(driver).isDisplayed());
}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	

}
