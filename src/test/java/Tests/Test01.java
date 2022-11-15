package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Test01 {

	WebDriver driver;
	By email = By.name("email");
	By password = By.name("password");
	By bottomFinish = By.xpath("//*[@id=\'root\']/main/div/form/button");
	By bottomLogin = By.xpath("//*[@id=\'root\']/header/nav/a[2]");
	By searchBox = By.id("ciudad");
	
	@BeforeEach
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\driver\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://fe.deitech.online/");
	}
	@Test
	public void loginUser() throws InterruptedException {
		driver.findElement(bottomLogin).click();
		Thread.sleep(2000);
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("prueba9@prueba.com");
		Thread.sleep(2000);
		driver.findElement(password).sendKeys("pass123");
		Thread.sleep(2000);
		driver.findElement(bottomFinish).click();
	}
	@Test
	public void search() throws InterruptedException {
		driver.findElement(searchBox).clear();
		driver.findElement(searchBox).sendKeys("Punta del este");
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	@AfterEach
	public void tearDowm() {
		driver.quit();
	}

}