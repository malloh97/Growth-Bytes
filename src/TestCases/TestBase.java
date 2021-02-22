package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TestBase {
	
	public static WebDriver driver;
	public static ATUTestRecorder recorder; 

	
	public void beforetest(String name) throws ATUTestRecorderException
	{
		recorder = new ATUTestRecorder("C:\\Users\\ahmad\\eclipse-workspace\\Growth-Bytes\\TestRecorder", name, false);
		recorder.start();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(option);
		driver.get("https://growth-bytes.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cky-btn-accept")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void aftertest(String name) throws ATUTestRecorderException
	{
		System.out.println("Congrates, Testing of "+name+" Case is Finished");
		recorder.stop();
		//driver.quit();
	}
	
	public void LogIn()
	{
		driver.findElement(By.xpath("(//a[contains(@style,'color: rgb(153, 153, 153);')])[2]")).click();
		driver.findElement(By.id("email")).sendKeys("ahmadmalloh97@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234567");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
	}
	
	
}
