package TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class MyAccount extends TestBase {
	
	@BeforeMethod
	public void setup(Method method) throws ATUTestRecorderException
	{
		beforetest(method.getName());
	}
	
	@AfterMethod
	public void teardown(Method method) throws ATUTestRecorderException
	{
		aftertest(method.getName());
	}
	
	@Test(priority=1, enabled=false)
	public void Control_Board_Test() throws InterruptedException
	{
		LogIn();
		Dashboard();
		
		boolean Actual = driver.findElement(By.xpath("//h3[contains(@class,'mt-3 text-center')]")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=2, enabled=false)
	public void Policies_Procedures_Test() throws InterruptedException
	{
		LogIn();
		Dashboard();
		
		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-bookmark')])[2]")).click();
		boolean Actual = driver.findElement(By.xpath("//h3[contains(@class,'mt-3 text-center')]")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=3, enabled=false)
	public void Rapid_Development_Test() throws InterruptedException
	{
		LogIn();
		Dashboard();
		
		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-trophy')])[2]")).click();
		boolean Actual = driver.findElement(By.xpath("//h3[contains(@class,'mt-3 text-center')]")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=4, enabled=false)
	public void Tools_Forms_Test() throws InterruptedException
	{
		LogIn();
		Dashboard();
		
		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-file')])[2]")).click();
		boolean Actual = driver.findElement(By.xpath("//h3[contains(@class,'mt-3 text-center')]")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	

	@Test(priority=5, enabled=false)
	public void Webinars_Test() throws InterruptedException
	{
		LogIn();
		Dashboard();
		
		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-video-camera')])[2]")).click();
		boolean Actual = driver.findElement(By.xpath("//h2[contains(@class,'mt-3 text-center')]")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=6, enabled=false)
	public void Ratings_Test() throws InterruptedException
	{
		LogIn();
		Dashboard();
		
		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-flag')])[2]")).click();
		boolean Actual = driver.findElement(By.xpath("(//th[@scope='col'])[2]")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=7)
	public void Edit_Account_Test() throws InterruptedException
	{
		LogIn();
		Dashboard();
		
		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-cog')])[2]")).click();
		driver.findElement(By.id("First name")).clear();
		driver.findElement(By.id("First name")).sendKeys("A7mad");
		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys("Mallo7");
		Thread.sleep(3000);
		
		WebElement phone = driver.findElement(By.id("phone_number"));
		Actions action = new Actions(driver);
		action.moveToElement(phone).click().build().perform();
		driver.findElement(By.id("phone_number")).clear();
		action.moveToElement(phone).click().build().perform();
		action.sendKeys("0795756832").build().perform();
		Thread.sleep(3000);
		
        WebElement company = driver.findElement(By.id("company_name"));
		action.moveToElement(company).click().build().perform();
		driver.findElement(By.id("company_name")).clear();
		action.moveToElement(company).click().build().perform();
		action.sendKeys("qiotic").build().perform();
		Thread.sleep(3000);
		
		WebElement emp = driver.findElement(By.id("number_of_employees"));
		Select select = new Select(emp);
		select.selectByIndex(2);
		
		WebElement section = driver.findElement(By.id("section"));
		Select select1 = new Select(section);
		select1.selectByIndex(5);
		
		WebElement postion = driver.findElement(By.id("job_title"));
		Select select2 = new Select(postion);
		select2.selectByIndex(5);
		
		WebElement country = driver.findElement(By.id("country"));
		Select select3 = new Select(country);
		select3.selectByIndex(3);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	}
	
	
	
	

}
