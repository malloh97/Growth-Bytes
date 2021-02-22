package TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Assessments extends TestBase{
	
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
	public void HR_Assessment()
	{
        LogIn();
		
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.xpath("(//h4[@class='text-center'])[2]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		for (int i=0; i<=14; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		boolean Actual = driver.findElement(By.className("col-6")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=2, enabled=false)
	public void Sales_Assessment()
	{
        LogIn();
		
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.xpath("(//h4[@class='text-center'])[3]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<6; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		boolean Actual = driver.findElement(By.className("col-6")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=3, enabled=false)
	public void Financial_Assessment()
	{
        LogIn();
		
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.xpath("(//h4[@class='text-center'])[4]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<6; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<7; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<7; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		boolean Actual = driver.findElement(By.className("col-6")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=4, enabled=false)
	public void Marketing_Assessment()
	{
        LogIn();
		
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.xpath("(//h4[@class='text-center'])[5]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<6; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<5; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		boolean Actual = driver.findElement(By.className("col-6")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=5, enabled=false)
	public void Processes_Assessment()
	{
        LogIn();
		
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.xpath("(//h4[@class='text-center'])[6]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<6; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<5; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		boolean Actual = driver.findElement(By.className("col-6")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=6, enabled=false)
	public void Digitization_Assessment()
	{
        LogIn();
		
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.xpath("(//h4[@class='text-center'])[7]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<6; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		boolean Actual = driver.findElement(By.className("col-6")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	

	@Test(priority=7, enabled=false)
	public void TheStrategy_Assessment()
	{
        LogIn();
		
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.xpath("(//h4[@class='text-center'])[8]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<5; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<6; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		boolean Actual = driver.findElement(By.className("col-6")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	

	@Test(priority=8, enabled=false)
	public void OrganizationalStructure_Assessment()
	{
        LogIn();
		
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.xpath("(//h4[@class='text-center'])[9]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		for (int i=0; i<4; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<3; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<3; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		for (int i=0; i<3; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		}
		
		boolean Actual = driver.findElement(By.className("col-6")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=9, enabled=false)
	public void ComprehensiveEvaluation()
	{
		LogIn();
		
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.xpath("//h4[@class='text-center']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-solid')]")).click();
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-btn btn-solid w-100')]")).click();
		
		for (int i=0; i<14; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[contains(@class,'btn btn-btn btn-solid w-100')])[2]")).click();
		}
		
		for (int i=1; i<=1; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("//button[contains(@class,'btn btn-btn btn-solid w-100')]")).click();
		}
		
		
		for (int i=0; i<=14; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("(//button[contains(@class,'btn btn-btn btn-solid w-100')])[2]")).click();
		}
		
		for (int i=1; i<=1; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("//button[contains(@class,'btn btn-btn btn-solid w-100')]")).click();
		}
		
		for (int i=0; i<14; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]")).click();
			driver.findElement(By.xpath("(//button[contains(@class,'btn btn-btn btn-solid w-100')])[2]")).click();
		}
		
		for (int i=1; i<=1; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("//button[contains(@class,'btn btn-btn btn-solid w-100')]")).click();
		}
		
		for (int i=0; i<14; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
			driver.findElement(By.xpath("(//button[contains(@class,'btn btn-btn btn-solid w-100')])[2]")).click();
		}
		
		for (int i=1; i<=1; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("//button[contains(@class,'btn btn-btn btn-solid w-100')]")).click();
		}
		
		for (int i=0; i<14; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();
			driver.findElement(By.xpath("(//button[contains(@class,'btn btn-btn btn-solid w-100')])[2]")).click();
		}
		
		for (int i=1; i<=1; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("//button[contains(@class,'btn btn-btn btn-solid w-100')]")).click();
		}
		
		for (int i=0; i<14; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
			driver.findElement(By.xpath("(//button[contains(@class,'btn btn-btn btn-solid w-100')])[2]")).click();
		}
		
		for (int i=1; i<=1; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("//button[contains(@class,'btn btn-btn btn-solid w-100')]")).click();
		}
		
		for (int i=0; i<=14; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]")).click();
			driver.findElement(By.xpath("(//button[contains(@class,'btn btn-btn btn-solid w-100')])[2]")).click();
		}
		
		for (int i=1; i<=1; i++)
		{
			driver.findElement(By.className("custom-control-label")).click();
			driver.findElement(By.xpath("//button[contains(@class,'btn btn-btn btn-solid w-100')]")).click();
		}
		
		for (int i=0; i<=14; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
			driver.findElement(By.xpath("(//button[contains(@class,'btn btn-btn btn-solid w-100')])[2]")).click();
		}
		
		
	}
	
	@Test(priority=10, enabled=false)
	public void Send_The_Result_Of_Assessment_By_Email()
	{
		HR_Assessment();
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-solid send-btn')]")).click();
	}
	
	
}
