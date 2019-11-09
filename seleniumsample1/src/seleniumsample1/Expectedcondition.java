package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Expectedcondition {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Drivers\\chromedriver.exe");
		WebDriver ypreddy=new ChromeDriver();
		
		 ypreddy.get("https://facebook.com");
		 ypreddy.manage().window().fullscreen();
		 
		Thread.sleep(10000);
		
		if(ExpectedConditions.attributeContains(By.id("u_0_m"),"id", "u_0_m").apply(ypreddy)==true)
		{
			System.out.println("url matched");
			
		}
		else
		{
			System.out.println("attribute desnot matched");
		}
		
		
		
	}

}
