package basictest.Junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DriverConnection.DriverConnection;

public class AnnotationPrac {

	static String url = "https://www.facebook.com/";
	static WebDriver driver;
	
	@BeforeClass
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
		
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
