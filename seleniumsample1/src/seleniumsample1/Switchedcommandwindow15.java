package seleniumsample1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchedcommandwindow15 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
	    WebDriver ypreddy=new ChromeDriver();
	    
	    
	    ypreddy.get("http://facebook.com");
	    ypreddy.manage().window().maximize();
	    
	    Thread.sleep(1000);

		String MainWindowId = ypreddy.getWindowHandle(); // facebook id
		
		ypreddy.findElement(By.xpath("//a[text()='Instagram']")).click();
		
		Set<String> allWindowHandles = ypreddy.getWindowHandles(); // facebook id and instgm
		
		System.out.println(" "+MainWindowId +" \n"+allWindowHandles);
		
		for (String id : allWindowHandles)  // facebookid // instagrn
		{
			if(id!=MainWindowId)
			{
				ypreddy.switchTo().window(id);
				ypreddy.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("9912734683");
			}
		}
		
	
		
		
	}

}
