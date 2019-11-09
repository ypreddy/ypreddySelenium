package seleniumsample1;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class locator1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      //ebay.com
      driver.get("https://signin.ebay.com");
      driver.manage().window().maximize();
      Thread.sleep(1000);
      
      // 
      driver.findElement(By.id("userid")).clear();
      driver.findElement(By. id("userid")).sendKeys("ypreddy");
      
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys("123456789");
     
      
	}
}
