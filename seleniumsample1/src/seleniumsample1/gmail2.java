package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
           WebDriver ypreddy=new ChromeDriver();
           ypreddy.get("https://yahoo.com");
           ypreddy.manage().window().fullscreen();
           String tittle=ypreddy.getTitle();
           System.out.print("correct tittle");
           System.out.println("n.correct tittle");
	}
	

	
	}
