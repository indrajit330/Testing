package basic.NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class Webtable7 {
	public static void main(String[] args) throws InterruptedException {
		   String url = "https://demoqa.com/webtables";
	       WebDriver driver = DriverConnection.getDriver(url);
	       
	       driver.manage().window().maximize();
	       
	       WebElement Edit = driver.findElement(By.xpath("//div[@id='edit-record-1']/svg/path"));
	       Edit.click();
	       Thread.sleep(3000);
	       
	       WebElement Delete = driver.findElement(By.xpath("//div[@id='delete-record-1']/svg/path"));
	       Delete.click();
	       Thread.sleep(3000);
	       
	       
}
}
