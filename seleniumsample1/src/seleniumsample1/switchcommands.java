package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchcommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
	    WebDriver ypreddy=new ChromeDriver();
	    
	    
	    ypreddy.get("http://firstnaukri.com");
	    ypreddy.manage().window().maximize();
	    
	    Thread.sleep(1000);
	    
	    ypreddy.findElement(By.xpath("//input[@value='Search']")).click();
	    ypreddy.findElement(By.xpath("//input[@value='Search']")).click();
	   
	}

}
