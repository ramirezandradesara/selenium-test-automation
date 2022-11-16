package com.Tests;

import com.Pages.PageCart;
import com.Pages.PageRegister;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestCart {
	
	private WebDriver driver;
	PageCart pageCart;
	
	@BeforeEach
	public void setUp() throws Exception {
		pageCart = new PageCart(driver, null);
		driver =pageCart.chromeDriverConnection();
		pageCart.link("https://opencart.abstracta.us/index.php?route=common/home");
	}
	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void addToCart() throws InterruptedException {
		pageCart.addToCart();
	}

}
