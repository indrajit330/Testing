package assasement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DriverConnection.DriverConnection;

public class Login {

	@Parameters({"email","pass"})
	@Test
	public void loginTest(String email, String pass) {
		String url = "https://www.demo.guru99.com/V4/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement emailEle = driver.findElement(By.name("uid"));
		WebElement passEle = driver.findElement(By.name("password"));
		emailEle.sendKeys(email);
		passEle.sendKeys(pass);
	}
	
}
