package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import conn.DriverConnection;

public class LoginTest {

	@Parameters({"email","pass"})
	@Test
	public void loginTest(String email, String pass) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement emailEle = driver.findElement(By.name("email"));
		WebElement passEle = driver.findElement(By.name("pass"));
		emailEle.sendKeys(email);
		passEle.sendKeys(pass);
	}
	
}
