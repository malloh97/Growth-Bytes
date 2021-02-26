package TestCases;


import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class LogInPage extends TestBase{
	

   	@BeforeMethod
    public void setup(Method method) throws ATUTestRecorderException
    {
	   beforetest(method.getName());
    }

    @AfterMethod
    public void terdown(Method method) throws ATUTestRecorderException
    {
    	aftertest(method.getName());
    }
	
	@Test(priority=1,enabled=false)
	public void Addinfo_ScenarioTest()
	{
		driver.findElement(By.xpath("(//a[contains(@style,'color: rgb(153, 153, 153);')])[2]")).click();
		driver.findElement(By.id("email")).sendKeys("ahmadmalloh97@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234567");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		boolean Actual = driver.findElement(By.xpath("//i[contains(@class,'fa fa-user-circle')]")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	
	@Test(priority=2 ,enabled=false, dataProvider="Mydata")
	public void addinfo_ScenarioTest(String username, String password)
	{
		driver.findElement(By.xpath("(//a[contains(@style,'color: rgb(153, 153, 153);')])[2]")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		boolean Actual = driver.findElement(By.xpath("//i[contains(@class,'fa fa-user-circle')]")).isDisplayed();
		Assert.assertTrue(Actual);
		
	}
	
	@DataProvider
	public Object[][] Mydata()
	{
		Object[][] data = new Object[5][2];
		data[0][0] = "ahmadmalloh97@gmail.com";
		data[0][1] = "12";
		data[1][0] = "ahmad";
		data[1][1] = "123456";
		data[2][0] = "ahmadmalloh97@gmail.com";
		data[2][1] = "";
		data[3][0] = "";
		data[3][1] = "123456";
		data[4][0] = "";
		data[4][1] = "";
		
		return data;
	}
	 
	@Test(priority=3)
	public void ForgetpasswordTest()
	{
		driver.findElement(By.xpath("(//a[contains(@style,'color: rgb(153, 153, 153);')])[2]")).click();
		driver.findElement(By.className("text-black-70")).click();
		driver.findElement(By.id("email")).sendKeys("ahmadmalloh97@gmail.com");
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		boolean Actual = driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed();
		Assert.assertTrue(Actual);
	}

}
