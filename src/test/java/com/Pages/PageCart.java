package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageCart extends BasePage {

	By email = By.name("email");
	By password = By.name("password");
	By bottomLogin = By.xpath("//*[@id=\'root\']/header/nav/a[2]");
	By bottomFinish = By.xpath("//*[@id=\'root\']/main/div/form/button");
	By result= By.className("form-feedback");
	By account = By.className("dropdown open");
	
	public PageCart(WebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
	}
	
	public void loginUser() throws InterruptedException {
		oprimir(bottomLogin);
		teclear("prueba6@prueba.com",email);
		teclear("pass123",password);
		oprimir(bottomFinish);		
	}
}
