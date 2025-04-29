package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class Webtable {
	
	public static void main(String[] args) {
		 String url = "https://demo.guru99.com/test/web-table-element.php";	
		 WebDriver driver = DriverConnection.getDriver(url);
		 

		 List<WebElement> thead = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr[1]/th"));
		 for(WebElement e : thead)
		 {
			 System.out.print(e.getText()+" | ");
		 }
		 System.out.println();
		 
		 List<WebElement> rows = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
		 System.out.println(rows.size());
		 for(int i=1;i<=rows.size();i++)
		 {
			    List<WebElement> cols = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td"));
		        for(int j=1;j<=cols.size();j++)
		        {
		        	 List<WebElement> data = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]"));
		             for(WebElement text : data)  
		             {
		            	 System.out.print(text.getText()+" | ");
		             }
		        }
	            System.out.println();	 
		 }
		 } 

}