package TestCases;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Videos extends TestBase
{
	@BeforeMethod
	public void setup(Method method) throws ATUTestRecorderException
	{
		beforetest(method.getName());
	}
	
	@AfterMethod
	public void teardwon(Method method) throws ATUTestRecorderException
	{
		aftertest(method.getName());
	}
	
	@Test(priority=1, enabled=false)
	public void Home_Page_Video()
	{
		driver.findElement(By.xpath("//div[@role='button']")).click();
		driver.findElement(By.className("close")).click();
	}
	
	@Test(priority=2, enabled=false)
	public void HR_Video() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@role='button']")).click();
		driver.findElement(By.className("close")).click();
	}
	
	@Test(priority=3, enabled=false)
	public void Sales_Video() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@role='button']")).click();
		driver.findElement(By.className("close")).click();
	}
	
	@Test(priority=4)
	public void Financial_Video() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@role='button']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(1);
		WebElement play = driver.findElement(By.xpath("//button[contains(@class,'play rounded-box state-paused')]"));
		play.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		Actions action = new Actions(driver);
		action.moveToElement(play).build().perform();
		WebElement share = driver.findElement(By.xpath("//button[contains(@class,'share-button rounded-box')]"));
		action.moveToElement(share).build().perform();
		action.click().build().perform();
		Thread.sleep(4000);
		driver.navigate().back();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
