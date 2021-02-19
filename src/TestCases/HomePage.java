package TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
	
	@Test(priority=4, enabled=false)
	public void Policies_and_procedures_Packages()
	{
		WebElement element = driver.findElement(By.xpath("//h2[@class='title-inner1']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    	
    	driver.findElement(By.xpath("//a[contains(@class,'btn btn-sm btn-outline')]")).click();
    	boolean Actual = driver.findElement(By.className("slider-contain")).isDisplayed();
    	Assert.assertTrue(Actual);
    }
	
	@Test(priority=5, enabled=false)
	public void Rapid_Development_Packages()
	{
		WebElement element = driver.findElement(By.xpath("//h2[@class='title-inner1']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    	
    	driver.findElement(By.xpath("(//a[contains(@class,'btn btn-sm btn-outline')])[2]")).click();
    	boolean Actual = driver.findElement(By.className("slider-contain")).isDisplayed();
    	Assert.assertTrue(Actual);
    }
	
	@Test(priority=6, enabled=false)
	public void Tools_and_Forms_Packages()
	{
		WebElement element = driver.findElement(By.xpath("//h2[@class='title-inner1']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    	
    	driver.findElement(By.xpath("(//a[contains(@class,'btn btn-sm btn-outline')])[3]")).click();
    	boolean Actual = driver.findElement(By.className("slider-contain")).isDisplayed();
    	Assert.assertTrue(Actual);
    }
	
	@Test(priority=7, enabled=false)
	public void Webinars_Packages()
	{
		WebElement element = driver.findElement(By.xpath("//h2[@class='title-inner1']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    	
    	driver.findElement(By.xpath("(//a[contains(@class,'btn btn-sm btn-outline')])[4]")).click();
    	boolean Actual = driver.findElement(By.className("slider-contain")).isDisplayed();
    	Assert.assertTrue(Actual);
    }
	
	@Test(priority=8, enabled=false)
	public void Click_at_Arrow_To_See_Products()
	{
		WebElement element = driver.findElement(By.xpath("(//h2[@class='title-inner1'])[3]"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    	
    	for(int i=0; i<4; i++)
    	{
    		driver.findElement(By.xpath("//i[contains(@class,'fa fa-chevron-right')]")).click();
    	}
    	
    	for(int i=0; i<4; i++)
    	{
    		driver.findElement(By.xpath("//i[contains(@class,'fa fa-chevron-left')]")).click();
    	}
    }
	
	@Test(priority=9)
	public void Click_at_Arrow_To_See_Feedback()
	{
		WebElement element = driver.findElement(By.xpath("(//div[@class='media-body'])[9]"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    	

    	for(int i=0; i<2; i++)
    	{
    		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-chevron-left')])[2]")).click();
    	}
    	
    	for(int i=0; i<2; i++)
    	{
    		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-chevron-right')])[2]")).click();
    	}
    	
    	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
