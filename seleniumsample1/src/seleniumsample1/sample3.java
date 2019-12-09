package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("vivek");
		driver.findElement(By.name("lastname")).sendKeys("Yan");
		driver.findElement(By.id("u_0_r")).sendKeys("yan164@");
		driver.findElement(By.name("websubmit")).click(); 
		driver.findElement(By.linkText("Forgotten account?")).click();
		
	}
	
	
	}

