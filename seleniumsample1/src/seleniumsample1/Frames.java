package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
	    WebDriver ypreddy=new ChromeDriver();
	    ypreddy.get("https://epass.apcfss.in/");
	    ypreddy.manage().window().maximize();
	    
	    Thread.sleep(1000);
		
	    WebElement frame =ypreddy.findElement(By.xpath("//frame[@name='menuFrame']"));
		
	    ypreddy.switchTo().frame(frame);
	    
	    
	    ypreddy.findElement(By.xpath("//a[.='Fee Structure']")).click();
	    
	   ypreddy.switchTo().defaultContent();
	   
	   ypreddy.switchTo().frame("bodyFrame");
	   
	   Thread.sleep(10000);
	   
	   WebElement dropdown=ypreddy.findElement(By.name("ins_board"));
	   new Select(dropdown).selectByIndex(2);
	   Thread.sleep(10000);
	   new Select(ypreddy.findElement(By.id("coursesId"))).selectByIndex(3);
	   
	   Thread.sleep(10000);
	   new Select(ypreddy.findElement(By.name("course_year"))).selectByIndex(1);
	   Thread.sleep(10000);
	   new Select(ypreddy.findElement(By.name("ac_year"))).selectByIndex(3);
	   
	   
	   ypreddy.findElement(By.name("submit")).click();
	   
	   
	   
		

	}

}
