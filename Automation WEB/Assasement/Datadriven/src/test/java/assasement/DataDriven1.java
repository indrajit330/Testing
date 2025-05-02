package assasement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DriverConnection.DriverConnection;

public class DataDriven1 {

	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		String url ="https://www.demo.guru99.com/V4/";
		driver = DriverConnection.getDriver(url);
	}
	
	@Test(dataProvider = "dp")
	public void logintest(String email, String pass)
	{
		System.out.println(email+" "+pass);
		WebElement username =  driver.findElement(By.name("uid"));
		username.clear();
		username.sendKeys(email);
		WebElement password =  driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys(pass);
	}
	
	@DataProvider(name="dp")
	public static Object[][] data()
	{
		ExcellReader ex = new ExcellReader("location : data.xlsx", "login");
		int row = ex.rowCount();
		int col = ex.colCount();
		
		Object obj[][] = new Object[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = ex.getData(i, j);
				obj[i-1][j] = data;
			}
		}	
		return obj;
	}
}