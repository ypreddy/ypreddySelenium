package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriversample11{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
     WebDriver ypreddy =new ChromeDriver();
     ypreddy.get("https://google.com");
     ypreddy.manage().window().maximize();
     Thread.sleep(10000);
     
     //;
     ypreddy.findElement(By.name("firstname"));
     

}
}