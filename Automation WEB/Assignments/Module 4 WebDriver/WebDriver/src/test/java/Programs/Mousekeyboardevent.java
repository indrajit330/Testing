package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connection.DriverConnection;

public class Mousekeyboardevent {
	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = DriverConnection.getDriver(url);
		
		// 1 Mouse Hover Event 
		
		WebElement Home = driver.findElement(By.linkText("Home"));
		WebElement Flight = driver.findElement(By.linkText("Flights"));
		WebElement Hotel = driver.findElement(By.linkText("Hotels"));
		WebElement cr = driver.findElement(By.linkText("Car Rentals"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Home).build().perform();
		action.moveToElement(Flight).build().perform();
		action.moveToElement(Hotel).build().perform();
		action.moveToElement(cr).build().perform();
		cr.click(); 
		
		// 2 Keyboard event 
		
		String url = "https://www.google.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement search = driver.findElement(By.name("q"));

		Actions actions = new Actions(driver);
		
		action.click(search)
		.keyDown(Keys.LEFT_SHIFT)
		.sendKeys("To learn software testing course")
		.pause(Duration.ofSeconds(5))
		.keyUp(Keys.LEFT_SHIFT)
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER)
		.build().perform();   
		
	}

}
