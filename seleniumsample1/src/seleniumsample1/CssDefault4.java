package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDefault4 {


	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("677378374832");
		
		driver.findElement(By.cssSelector("#pass")).clear();
		driver.findElement(By.cssSelector("#pass")).sendKeys("677378374832");
		
		
		driver.findElement(By.cssSelector("#u_0_2")).click();
		
		
		
		

	}

	
	
}
