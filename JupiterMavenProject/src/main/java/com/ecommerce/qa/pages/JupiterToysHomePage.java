package com.ecommerce.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JupiterToysHomePage {
	
	private static WebElement  element= null;
	
	public static WebElement ContactsLabel(WebDriver driver) {
		element  = driver.findElement(By.xpath("//a[@href='#/contact']"));
		return element;
	}
	
	public static WebElement ShopLabel(WebDriver driver) {
		element  = driver.findElement(By.xpath("//a[@href='#/shop']//ancestor::li"));
		return element;
	}
	
	public static WebElement ContactsSubmitLabel(WebDriver driver) {
		element  = driver.findElement(By.xpath("//div[@class='form-actions']/a"));
		return element;
	}
	
	public static WebElement SubmitMessage(WebDriver driver) {
		element  = driver.findElement(By.xpath("//div[@class='alert alert-error ng-scope']"));
		return element;
	}
	
	public static WebElement FeedbackForeName(WebDriver driver) {
		element  = driver.findElement(By.id("forename"));
		return element;
	}
	
	public static WebElement FeedbackEmail(WebDriver driver) {
		element  = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement FeedbackMessage(WebDriver driver) {
		element  = driver.findElement(By.id("message"));
		return element;
	}
	
	public static WebElement ValidateSuccessMessage(WebDriver driver) {
		element  = driver.findElement(By.xpath("//div[@ui-if='contactValidSubmit']/div"));
		return element;
	}
	
	public static WebElement StufferFrog(WebDriver driver) {
		element  = driver.findElement(By.xpath("//li[@id='product-2']/div/p/a"));
		return element;
	}
	
	public static WebElement FluffyBunny(WebDriver driver) {
		element  = driver.findElement(By.xpath("//li[@id='product-4']/div/p/a"));
		return element;
	}
	
	public static WebElement ValentineBear(WebDriver driver) {
		element  = driver.findElement(By.xpath("//li[@id='product-7']/div/p/a"));
		return element;
	}
	
	
	public static WebElement Cart(WebDriver driver) {
		element  = driver.findElement(By.xpath("//a[@href='#/cart']"));
		return element;
	}
	
	public static WebElement Frog(WebDriver driver) {
		element  = driver.findElement(By.xpath("//td[normalize-space()='$21.98']"));
		return element;
	}
	
	public static WebElement Bunny(WebDriver driver) {
		element  = driver.findElement(By.xpath("//td[normalize-space()='$49.95']"));
		return element;
	}
	
	
	public static WebElement Bear(WebDriver driver) {
		element  = driver.findElement(By.xpath("//td[normalize-space()='$44.97']"));
		return element;
	}
	
	public static WebElement TotalCost(WebDriver driver) {
		element  = driver.findElement(By.xpath("//strong[text()='Total: 116.9']"));
		return element;
	}
}
