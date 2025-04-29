package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import conn.DriverConnection;

public class Login2 {
	static String url = "https://www.facebook.com/";
	static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser() {
		driver = DriverConnection.getDriver(url);
	}

	@Test(dataProvider = "dp") 
	public void login(String email, String pass) {
		
		WebElement emailEle = driver.findElement(By.name("email"));
		WebElement passEle = driver.findElement(By.name("pass"));
		emailEle.sendKeys(email);
		passEle.sendKeys(pass);
	}
	
	@DataProvider(name = "dp")
	public static Object[][] getData(){
		
		Object[][] o = new Object[4][2];
		
		o[0][0] = "correct@gmail.com";
		o[0][1] = "correct@123";

		o[1][0] = "correct@gmail.com";
		o[1][1] = "incorrect@123";

		o[2][0] = "incorrect@gmail.com";
		o[2][1] = "correct@123";

		o[3][0] = "incorrect@gmail.com";
		o[3][1] = "incorrect@123";
		
		return o;
		
	}
	
}
