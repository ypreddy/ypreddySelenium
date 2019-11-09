package seleniumsample1;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class speciallocator10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
		WebDriver ypreddy=new ChromeDriver();
		ypreddy.get("http://facebook.com");
		ypreddy.manage().window().fullscreen();
		Thread.sleep(1000);
	
		//ypreddy.findElement(new ByIdOrName("hehjsh")).clear();
		ypreddy.findElement(new ByChained(By.id("u_0_l"),By.tagName("div"),By.name("firstname"))).clear();
		ypreddy.findElement(new ByChained(By.id("u_0_l"),By.tagName("div"),By.name("firstname"))).sendKeys("567182");
		//ypreddy.findElement(new ByAll(By.id("hehjsh"),By.name("firstname"))).sendKeys(" I am done");
				
	}

	
}
