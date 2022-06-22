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

public class JupiterTestCase3 {
	
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
		JupiterToysHomePage.ShopLabel(driver).click();
		Thread.sleep(1000);
		
		//Click Stuffed Frog 2 Times
		for(int i=0;i<=1;i++) {
			JupiterToysHomePage.StufferFrog(driver).click();
		}
	
		//Click Fluffy Bunny 5 Times
        for(int i=0;i<=4;i++) {
			JupiterToysHomePage.FluffyBunny(driver).click();
		}
				
      //Click Valentine Bear 3 Times
        for(int i=0;i<=2;i++) {
			JupiterToysHomePage.ValentineBear(driver).click();
		}
		
        JupiterToysHomePage.Cart(driver).click();
        Thread.sleep(2000);
        
        //Verify Sub-total For each Product
        Assert.assertTrue(JupiterToysHomePage.Frog(driver).isDisplayed());
        Assert.assertTrue(JupiterToysHomePage.Bunny(driver).isDisplayed());
        Assert.assertTrue(JupiterToysHomePage.Bear(driver).isDisplayed());
        Assert.assertTrue(JupiterToysHomePage.TotalCost(driver).isDisplayed());   
	}
	
	@AfterMethod
	public void close() {
		//driver.close();
	}

}
