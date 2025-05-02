package basic.NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class Webtable6 {
	public static void main(String[] args) {
		   String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
	       WebDriver driver = DriverConnection.getDriver(url);
	       
	       driver.manage().window().maximize();
	       
	       WebElement Total = driver.findElement(By.xpath("//div[@id='post-body-1325137018292710854']/div[1]/div[1]/div[5]/table/tfoot/tr/th"));
	       System.out.println(Total.getText());
	       
	       WebElement bld = driver.findElement(By.xpath("//div[@id='post-body-1325137018292710854']/div[1]/div[1]/div[5]/table/tfoot/tr/td"));
	       System.out.println(bld.getText());
	       
	       
	       }
}
