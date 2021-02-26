package TestCases;



import java.io.IOException;
import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class SignUpPage extends TestBase{
	

    public SignUpPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

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
	
	@Test(priority=1)
	public void RegisterTitleIsDesplyed()
	{
		driver.findElement(By.xpath("//a[contains(@style,'color: rgb(153, 153, 153);')]")).click();
		boolean Actual =  driver.findElement(By.xpath("//li[contains(@class,'breadcrumb-item active')]")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=2)
	public void AddInfoToRegister_HappyScenario()
	{
		driver.findElement(By.xpath("//a[contains(@style,'color: rgb(153, 153, 153);')]")).click();
		driver.findElement(By.id("First name")).sendKeys("Ahmad");
		driver.findElement(By.id("last_name")).sendKeys("Malloh");
		driver.findElement(By.id("phone_number")).sendKeys("795756832");
		driver.findElement(By.id("company_name")).sendKeys("Qiotic");
		
		WebElement employees = driver.findElement(By.id("number_of_employees"));
		Select emp = new Select(employees);
		emp.selectByIndex(1);
		
		driver.findElement(By.id("email")).sendKeys("ahmadmalloh97@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("rpassword")).sendKeys("123456");
		
		WebElement Section = driver.findElement(By.id("section"));
		Select Sec = new Select(Section);
		Sec.selectByIndex(10);
		
		WebElement Position = driver.findElement(By.id("job_title"));
		Select Pos = new Select(Position);
		Pos.selectByIndex(5);
		
		WebElement Country = driver.findElement(By.id("country"));
		Select Con = new Select(Country);
		Con.selectByIndex(3);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		boolean Actual = driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=3)
	public void AddInfoToRegister_SadScenario01()
	{
		driver.findElement(By.xpath("//a[contains(@style,'color: rgb(153, 153, 153);')]")).click();
		driver.findElement(By.id("First name")).sendKeys("Ahmad");
		driver.findElement(By.id("last_name")).sendKeys("Malloh");
		driver.findElement(By.id("phone_number")).sendKeys("0795756832");
		driver.findElement(By.id("company_name")).sendKeys("Qiotic");
		
		WebElement employees = driver.findElement(By.id("number_of_employees"));
		Select emp = new Select(employees);
		emp.selectByIndex(1);
		
		driver.findElement(By.id("email")).sendKeys("ahmadmalloh97@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("rpassword")).sendKeys("123456");
		
		WebElement Section = driver.findElement(By.id("section"));
		Select Sec = new Select(Section);
		Sec.selectByIndex(10);
		
		WebElement Position = driver.findElement(By.id("job_title"));
		Select Pos = new Select(Position);
		Pos.selectByIndex(5);
		
		WebElement Country = driver.findElement(By.id("country"));
		Select Con = new Select(Country);
		Con.selectByIndex(3);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
        boolean Actual = driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=4)
	public void AddInfoToRegister_SadScenario02()
	{
		driver.findElement(By.xpath("//a[contains(@style,'color: rgb(153, 153, 153);')]")).click();
		driver.findElement(By.id("First name")).sendKeys("Ahmad");
		driver.findElement(By.id("last_name")).sendKeys("Malloh");
		driver.findElement(By.id("phone_number")).sendKeys("0795756832");
		driver.findElement(By.id("company_name")).sendKeys("Qiotic");
		
		WebElement employees = driver.findElement(By.id("number_of_employees"));
		Select emp = new Select(employees);
		emp.selectByIndex(1);
		
		driver.findElement(By.id("email")).sendKeys("ahmadmalloh97@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("rpassword")).sendKeys("123");
		
		WebElement Section = driver.findElement(By.id("section"));
		Select Sec = new Select(Section);
		Sec.selectByIndex(10);
		
		WebElement Position = driver.findElement(By.id("job_title"));
		Select Pos = new Select(Position);
		Pos.selectByIndex(5);
		
		WebElement Country = driver.findElement(By.id("country"));
		Select Con = new Select(Country);
		Con.selectByIndex(3);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
        boolean Actual = driver.findElement(By.className("validate-error")).isDisplayed();
		Assert.assertTrue(Actual);
		
	}
	
	@Test(priority=5)
	public void AddInfoToRegister_SadScenario03()
	{
		driver.findElement(By.xpath("//a[contains(@style,'color: rgb(153, 153, 153);')]")).click();
		driver.findElement(By.id("First name")).sendKeys("Ahmad");
		driver.findElement(By.id("last_name")).sendKeys("Malloh");
		driver.findElement(By.id("phone_number")).sendKeys("0011");
		driver.findElement(By.id("company_name")).sendKeys("Qiotic");
		
		WebElement employees = driver.findElement(By.id("number_of_employees"));
		Select emp = new Select(employees);
		emp.selectByIndex(1);
		
		driver.findElement(By.id("email")).sendKeys("ahmadmalloh97@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("rpassword")).sendKeys("123456");
		
		WebElement Section = driver.findElement(By.id("section"));
		Select Sec = new Select(Section);
		Sec.selectByIndex(10);
		
		WebElement Position = driver.findElement(By.id("job_title"));
		Select Pos = new Select(Position);
		Pos.selectByIndex(5);
		
		WebElement Country = driver.findElement(By.id("country"));
		Select Con = new Select(Country);
		Con.selectByIndex(3);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
        boolean Actual = driver.findElement(By.className("text-danger")).isDisplayed();
		Assert.assertTrue(Actual);
	}
	
	@Test(priority=6)
	public void SubscribeTest()
	{
		driver.findElement(By.id("mce-EMAIL")).sendKeys("ahmad");
		driver.findElement(By.id("mc-submit")).click();
	}
	

}
