package Assignment1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import connection.DriverConnection;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getDriver(url);
		
		// 1 alert
		WebElement btn1 = driver.findElement(By.id("alertButton"));
		btn1.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
 		alert.accept(); 
		
		//2 alert
		
		WebElement btn2 = driver.findElement(By.id("timerAlertButton"));
		btn2.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
 		alert.accept();
 		
 		//3 alert 
 		
 		WebElement btn3 = driver.findElement(By.id("confirmButton"));
		btn3.click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();
		
		// 4 alert
		
		WebElement btn4 = driver.findElement(By.id("promtButton"));
		btn4.click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert3.sendKeys("hello testers");
		alert3.accept(); 
		
	}

}
