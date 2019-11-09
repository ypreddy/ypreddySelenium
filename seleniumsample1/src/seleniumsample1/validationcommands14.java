package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class validationcommands14 {

	public static void main(String args[]) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Drivers\\chromedriver.exe");
	WebDriver ypreddy=new ChromeDriver();
	Object ypredddy;
	 ypreddy.get("https://freecrm.com/register/");
	ypreddy.manage().window().fullscreen();
	Thread.sleep(1000);
	
	
	//1.isdispaly methed()
	Boolean b1=ypreddy.findElement(By.id("submitbutton")).isDisplayed();// is a submitbutton
	System.out.println("b1");//it is a true
	
	//2.isenabled method()
	Boolean b2=ypreddy.findElement(By.id("submitbutton")).isEnabled();//
	System.out.println("b2");
	
	ypreddy.findElement(By.name("Agree terms")).click();
	boolean b3=ypreddy.findElement(By.id("submitbutton")).isEnabled();
	System.out.println("b3");
	
}
}