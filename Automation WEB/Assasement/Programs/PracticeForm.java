package basic.NewProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import connection.DriverConnection;

public class PracticeForm {
       public static void main(String[] args) {
       String url = "https://demoqa.com/automation-practice-form";
       WebDriver driver = DriverConnection.getDriver(url);
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       WebElement firstname = driver.findElement(By.id("firstName"));
       firstname.sendKeys("Selenium");
       
       WebElement lastname = driver.findElement(By.id("lastName"));
       lastname.sendKeys("user");
       
       WebElement email = driver.findElement(By.id("userEmail"));
       email.sendKeys("test@gmail.com");
       
       List<WebElement> list = driver.findElements(By.xpath("//div[@id='genterWrapper']/div[2]/div[1]"));
       System.out.println(list.size());
       list.get(0).click();
       
       WebElement mobile = driver.findElement(By.id("userNumber"));
       mobile.sendKeys("98897132");
       
       WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
       DOB.click();
       
       WebElement days = driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));
	   Select day = new Select(days);
	   day.selectByIndex(11);
		
	   WebElement months = driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));
	   Select month = new Select(months);
	   month.selectByValue("2");
		
	   WebElement years = driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));
	   Select year = new Select(years);
	   year.selectByVisibleText("1990");
       
	   WebElement search = driver.findElement(By.xpath("//div[@id='subjectsContainer']/div/div[1]"));
		
	   Actions action = new Actions(driver);
		
		action.click(search)
		.keyDown(Keys.LEFT_SHIFT)
		.sendKeys("Computer Science")
		.pause(Duration.ofSeconds(5))
		.keyUp(Keys.LEFT_SHIFT)
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER)
		.build().perform();
       
		List<WebElement> list1 = driver.findElements(By.id("hobbies-checkbox-1"));
	    System.out.println(list1.size());
	    list1.get(0).click();
       
	    WebElement Picture = driver.findElement(By.id("uploadPicture"));
	    Picture.sendKeys("D:\\download.jpg");
	    
       WebElement address = driver.findElement(By.id("currentAddress"));
       address.sendKeys("ABC address");
       
       
       WebElement states = driver.findElement(By.id("state"));
       Select state = new Select(states);
       state.selectByIndex(2);
       
       WebElement Cities = driver.findElement(By.id("city"));
       Select City = new Select(Cities);
       City.selectByIndex(1);
       
         
}
}
