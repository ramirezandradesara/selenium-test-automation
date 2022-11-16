package com.Tests;

import com.Pages.PageCart;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestCart {
	
	private WebDriver driver;
	PageCart pageLogin;
	
	@BeforeEach
	public void setUp() throws Exception {
		pageLogin = new PageCart(driver, null);
		driver =pageLogin.chromeDriverConnection();
		pageLogin.link("https://opencart.abstracta.us/index.php?route=common/home");
	
	}
	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		pageLogin.loginUser();
	}

}
