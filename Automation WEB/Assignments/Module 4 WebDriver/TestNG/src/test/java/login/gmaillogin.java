package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import conn.DriverConnection;

public class gmaillogin {
	static String url = "https://www.gmail.com/";
	static WebDriver driver;
	
	@BeforeTest
	public static void openBrowser() {
		driver = DriverConnection.getDriver(url);
	}
		
	@Test
	public void loginTest() throws InterruptedException {
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("test@gmail.com");
		
		WebElement next = driver.findElement(By.xpath("//div[@id='identifierNext']/div/button"));
        next.click();	
		Thread.sleep(3000);
        
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("test@123");
		
		WebElement next1 = driver.findElement(By.xpath("//div[@id='passwordNext']/div/button"));
        next1.click();
        Thread.sleep(3000);
	}
		
	@AfterTest
	public static void tearDown() {
		driver.quit();
	}
}

