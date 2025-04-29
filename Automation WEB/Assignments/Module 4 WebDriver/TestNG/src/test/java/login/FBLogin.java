package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import conn.DriverConnection;

public class Login {
	static String url = "https://www.facebook.com/";
	static WebDriver driver;
	
	@BeforeMethod
	public static void openBrowser() {
		driver = DriverConnection.getDriver(url);
	}
		
	@Test
	public void loginTest() {
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("test@test.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("test@123");
	}
		
	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}
}

