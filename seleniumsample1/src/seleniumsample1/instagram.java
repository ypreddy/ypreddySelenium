package seleniumsample1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://instagram.com");
	driver.manage().window().maximize();
	
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("emailOrPhone")).clear();
	driver.findElement(By.name("emailOrPhone")).sendKeys("9912734683");
	
	
	}
	
	
	
}