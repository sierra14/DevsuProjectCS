package com.devsu.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class E2E_Test {

	private WebDriver driver;
	StorePage storePage;
	CartPage cartPage;
	
	@Before
	public void setUp() throws Exception {
		storePage = new StorePage(driver);
		driver = storePage.chromeDriverConnection();
		storePage.visit("https://www.demoblaze.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		cartPage = new CartPage(driver);
		storePage.addArticlesToCart();
		cartPage.completePurchase();
	}

}
