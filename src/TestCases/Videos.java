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
	public void Home_Page_Video() throws InterruptedException
	{
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
	
	@Test(priority=2, enabled=false)
	public void HR_Video() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		
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
	
	@Test(priority=3, enabled=false)
	public void Sales_Video() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[2]")).click();
		
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
	
	@Test(priority=4, enabled=false)
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
	
	@Test(priority=5, enabled=false)
	public void Processes_Video() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[4]")).click();
		
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
	
	@Test(priority=6, enabled=false)
	public void Digitization_Video() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[5]")).click();
		
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
	

	@Test(priority=7, enabled=false)
	public void Strategy_Video() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[6]")).click();
		
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
	
	@Test(priority=8, enabled=false)
	public void Marketing_Video() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[7]")).click();
		
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
	
	@Test(priority=9)
	public void Organizational_Structure_Video() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[8]")).click();
		
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
