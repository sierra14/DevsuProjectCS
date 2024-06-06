package com.devsu.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage extends Base {
	
	By frame = By.id("contcont");
	
	By article1 = By.xpath("//*[@id=\"tbodyid\"]/div[1]");
	By article2 = By.linkText("Nokia lumia 1520");
	
	By homeButton = By.cssSelector("a.nav-link");
	By addToCartButton = By.linkText("Add to cart");
	
	By cartPage = By.id("cartur");

	public StorePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void addArticlesToCart() throws InterruptedException {
		waitElement(article1);
		click(article1);
		waitElement(addToCartButton);
		click(addToCartButton);
		waitElementExplicit();
		acceptPopUp();
		click(homeButton);
		waitElement(article2);
		click(article2);
		waitElement(addToCartButton);
		click(addToCartButton);
		waitElementExplicit();
		acceptPopUp();
		waitElement(cartPage);
		click(cartPage);
	}
}
