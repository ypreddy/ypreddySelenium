package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class song9 {

	public static void main(String[] args) {
		// TODO Auto-generated method
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Drivers\\chromedriver.exe");
		WebDriver ypreddy = new ChromeDriver();
		ypreddy.get("https:////https://www.isongs.download/naa");
		
		
		
		//tag[@attributename="attribute"]
		
		ypreddy.findElement(By.xpath("//https://www.isongs.download/naa")).clear();
						ypreddy.findElement(By.xpath("//input[@name='play']")).click();
	}

}
