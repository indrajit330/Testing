package conn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection {
	public static WebDriver getDriver(String url) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\in\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
		 driver.get(url);
		 
		 driver.manage().window().maximize();
		 return driver;
	}
}
