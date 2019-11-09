package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssatribute5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).clear();
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("677378374832");
		
		driver.findElement(By.cssSelector("input[type='password'][id='pass']")).clear();
		driver.findElement(By.cssSelector("input[type='password'][id='pass']")).sendKeys("677378374832");
		
		
		driver.findElement(By.cssSelector("input[name='pass']")).click();
		
	}
}