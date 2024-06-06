package com.devsu.pom;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends Base {

	By placeOrderButton = By.xpath("//div[2]/button");
	
	By nameInput = By.id("name");
	By countryInput = By.id("country");
	By cityInput = By.id("city");
	By creditInput = By.id("card");
	By monthInput = By.id("month");
	By yearInput = By.id("year");
	
	By PayButton = By.xpath("//div[@id='orderModal']/div/div/div[3]/button[2]");
	
	By buySuccess = By.xpath("//*/text()[normalize-space(.)='Thank you for your purchase!']/parent::*");
	
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void completePurchase() throws InterruptedException {
		waitElement(placeOrderButton);
		click(placeOrderButton);
		waitElement(nameInput);
		type("test1", nameInput);
		type("test2", countryInput);
		type("test3", cityInput);
		type("test4", creditInput);
		type("test5", monthInput);
		type("test6", yearInput);
		click(PayButton);
		assertEquals("Thank you for your purchase!", getText(buySuccess));
	}
}
