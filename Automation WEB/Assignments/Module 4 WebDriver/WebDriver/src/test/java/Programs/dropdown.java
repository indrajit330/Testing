package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import connection.DriverConnection;

public class dropdown {
	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement countries = driver.findElement(By.name("country"));
		Select country = new Select(countries);
		country.selectByValue("INDIA");
		
	
	}

}
