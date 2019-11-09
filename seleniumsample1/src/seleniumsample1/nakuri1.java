package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nakuri1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
 driver.manage().window().fullscreen();
 driver.findElement(By.name("q")).sendKeys("Naukri‎"+Keys.ENTER);
 Thread.sleep(10000);
 driver.findElement(By.className("sA5rQ")).click();
 
 driver.findElement(By.name("userType")).click();
 driver.findElement(By.name("lastname")).click();
 driver.findElement(By.name("number")).click();
 driver.close();
 

	}
}