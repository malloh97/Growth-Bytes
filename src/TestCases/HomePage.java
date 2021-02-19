package TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class HomePage extends TestBase{
	
	@BeforeMethod()
	public void setup(Method method) throws ATUTestRecorderException
	{
		beforetest(method.getName());
	}
	
	@AfterMethod()
	public void teardown(Method method) throws ATUTestRecorderException
	{
		aftertest(method.getName());
	}
	
	@Test(priority=1, enabled=false)
	public void CheckIfUserNameClickableAndDisplyed()
	{
		LogIn();
		
		boolean Actual = driver.findElement(By.xpath("//li[contains(@class,'onhover-dropdown mobile-account')]")).isDisplayed();
		Assert.assertTrue(Actual);
		driver.findElement(By.xpath("//li[contains(@class,'onhover-dropdown mobile-account')]")).click();
		boolean Actual1 = driver.findElement(By.xpath("//i[contains(@class,'fa fa-sign-out')]")).isDisplayed();
		Assert.assertTrue(Actual1);
	}
	
	@Test(priority=2, enabled=false)
	public void Check_If_WishList_Displyed_And_Clickable()
	{
		LogIn();
		
		boolean Actual = driver.findElement(By.xpath("//li[@class='mobile-wishlist']")).isDisplayed();
		Assert.assertTrue(Actual);
		driver.findElement(By.xpath("//li[@class='mobile-wishlist']")).click();
		boolean Actual1 = driver.findElement(By.xpath("//li[contains(@class,'breadcrumb-item active')]")).isDisplayed();
		Assert.assertTrue(Actual1);
	}
	
	@Test(priority=3, enabled=false)
	public void Check_If_Emailaddress_Displyed_And_Clickable()
	{
		LogIn();
		
		boolean Actual = driver.findElement(By.xpath("//i[contains(@class,'fa fa-envelope')]")).isDisplayed();
		Assert.assertTrue(Actual);
		driver.findElement(By.xpath("//i[contains(@class,'fa fa-envelope')]")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
