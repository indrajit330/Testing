package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import connection.DriverConnection;

public class gmailregister {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.gmail.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement ca = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span"));
		ca.click();
		Thread.sleep(3000);
		
		WebElement personal = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]"));
		personal.click();
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("test");
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("test1");
		
		WebElement next = driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
		next.click();
		Thread.sleep(3000);
		
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("12");
		
		WebElement day = driver.findElement(By.id("day"));
		day.sendKeys("25");
		
		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("1990");
		
		WebElement genders = driver.findElement(By.id("gender"));
		Select gender = new Select(genders);
		gender.selectByIndex(2);
		
		WebElement next1 = driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span"));
		next1.click();
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.name("Username"));
		username.sendKeys("tester123500");
		
		WebElement next2 = driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
		next2.click();
		Thread.sleep(3000);
		
		
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("test@12345");
		
		WebElement confirm = driver.findElement(By.name("PasswdAgain"));
		confirm.sendKeys("test@12345");
		
		WebElement next3 = driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span"));
		next3.click();
		Thread.sleep(3000);
		
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[2]/div/div[2]/div[1]/label"));
		phone.sendKeys("1234567890");
		Thread.sleep(3000);
		
		WebElement next4 = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span"));
		next4.click();
		Thread.sleep(3000);
		
		
		
	}

}
