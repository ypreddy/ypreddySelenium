package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class xpathcss8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Drivers\\chromedriver.exe");
		WebDriver ypreddy = new ChromeDriver();
		ypreddy.get("http://facebook.com");
		
		
		//tag[@attributeName='attributeValues']
		ypreddy.findElement(By.xpath("//input[@name='email']")).clear();
		ypreddy.findElements(By.xpath("//input[@name='passl']"));
		
		ypreddy.findElement(By.xpath("//input[@name='firstname']")).clear();
		ypreddy.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ypreddy");
	    
		
		ypreddy.findElement(By.xpath("//input[@name='lastname']")).clear();
		ypreddy.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yangala");
		
		ypreddy.findElement(By.xpath("//input[@name='reg_email__']")).clear();
		ypreddy.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ypreddy888@gmail.com");
		
		ypreddy.findElement(By.xpath("//input[@name='reg_passwd__']")).clear();
		ypreddy.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9912734683");
		
		ypreddy.findElement(By.xpath("//input[@name='birthday_day']")).clear();
		ypreddy.findElement(By.xpath("//input[@name='birthday_day']")).sendKeys("14");
		
		ypreddy.findElement(By.xpath("//input[@name='birthday_month']")).clear();
		ypreddy.findElement(By.xpath("//input[@name='birthday_year']")).sendKeys("1994");
		
		
		ypreddy.findElement(By.xpath("//input[@name='sex' and @id='u_0_a']")).click();
		
		ypreddy.findElement(By.xpath("//input[@name='websubmit']")).click();
		
		ypreddy.findElement(By.xpath("//input[@name='u_0_17']")).click();
	
	}
	
	

}
