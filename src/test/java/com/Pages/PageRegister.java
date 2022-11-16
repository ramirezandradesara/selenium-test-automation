package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRegister extends BasePage {

	By buttonMyAccount = By.className("dropdown");
	By buttonRegister = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]");

	By name = By.id("input-firstname");
	By lastName = By.id("input-lastname");
	By email = By.id("input-email");
	By telephone = By.id("input-telephone");
	By password = By.id("input-password");
	By rePassword = By.id("input-confirm");

	By newsletter = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
	By policy = By.name("agree");
	By continueButton =  By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

	By result = By.xpath("//*[@id=\"content\"]/p[1]");
	
	public PageRegister(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void registerUser() throws InterruptedException {
		// 1
		oprimir(buttonMyAccount);
		Thread.sleep(2000);
		// 2
		oprimir(buttonRegister);
		Thread.sleep(2000);
		// 3
		teclear("Mob", name);
		teclear("Kageyama",lastName);
		teclear("mob98@hotmail.com",email);
		teclear("11663322",telephone);
		teclear("123456",password);
		teclear("123456",rePassword);
		Thread.sleep(2000);
		//4
		oprimir(newsletter);
		// 5
		oprimir(policy);
		Thread.sleep(2000);
		// 6
		oprimir(continueButton);
		Thread.sleep(5000);
		esperaExplicita(result,"Congratulations! Your new account has been successfully created!",10);
	}
}