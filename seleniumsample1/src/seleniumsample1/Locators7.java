package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators7 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		// Facebook Account Creation Filling
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("yp");
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Reddy");
		
		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys("ypreddy@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).clear();
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ypreddy@gmail.com");
		
		
		
		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234567890");
		
		
		/*
		 * new Select(driver.findElement(By.name("birthday_day"))).selectByIndex(2);
		new Select(driver.findElement(By.name("birthday_month"))).selectByIndex(4);
		new Select(driver.findElement(By.name("birthday_year"))).selectByIndex(6);
		
		 */
		
		/*
		 * new Select(driver.findElement(By.name("birthday_day"))).selectByValue("7");;
		new Select(driver.findElement(By.name("birthday_month"))).selectByValue("4");
		new Select(driver.findElement(By.name("birthday_year"))).selectByValue("2016");
		 */
		
		 new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("14");;
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Jun");
		new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("2020");

		
		/*
		 * driver.findElement(By.name("birthday_day")).sendKeys("44");
		driver.findElement(By.name("birthday_month")).sendKeys("Jun");
		driver.findElement(By.name("birthday_year")).sendKeys("1994");
		
		 */
		driver.findElement(By.name("sex")).click();

		
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
	}

}
