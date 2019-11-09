package seleniumsample1;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementverification13 
{
	public static void main(String s[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
	    WebDriver ypreddy=new ChromeDriver();
	    ypreddy.get("http://facebook.com");
	    ypreddy.manage().window().maximize();
	    
	    Thread.sleep(1000);
	    
	    WebElement username = ypreddy.findElement(By.name("email"));
	    
	   Point coordinates =  username.getLocation();
	   
	   int x = coordinates.getX();
	   int y = coordinates.getY();
	   
	   
	   org.openqa.selenium.Dimension h_w =username.getSize();
	   
	  int Height = h_w.getHeight();
	  int Width =h_w.getWidth();
	  
	  Rectangle all = username.getRect();
	  
	  int X= all.getX();
	  int Y = all.getY();
	  int height = all.getHeight();
	  int width =all.getWidth();
	  
	 String tagname = username.getTagName();
	 
	 
	}
	
	
}
