package Assignment1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class Handlealert {
     public static void main(String[] args) throws InterruptedException {
	 String url = "http://demo.guru99.com/test/delete_customer.php";
	 WebDriver driver = DriverConnection.getDriver(url);
	 
	 WebElement id = driver.findElement(By.name("cusid"));
	 id.sendKeys("123");
	 
	 WebElement submit = driver.findElement(By.name("submit"));
	 submit.click();
	 
	 Alert alert = driver.switchTo().alert();
	 Thread.sleep(3000);
	 alert.accept();
	 
	 Alert alert1 = driver.switchTo().alert();
	 Thread.sleep(3000);
	 alert1.accept();
}
}
