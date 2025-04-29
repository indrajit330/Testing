package Assignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class linkText {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		// linkText
		WebElement ca = driver.findElement(By.linkText("Create new account"));
		ca.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// PartiallinkText
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		System.out.println(links.size());
		for(WebElement e : links) {
			System.out.println(e.getText());
			
		}
		links.get(1).click();
		
		driver.navigate().back();
		
	}

}
