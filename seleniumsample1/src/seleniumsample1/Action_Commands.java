package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Commands {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
		Actions doAction = new Actions(driver);
		
		 // Mouse Actions
		doAction.click(driver.findElement(By.xpath("//*[@id='hhfd']"))).perform();
		doAction.doubleClick(driver.findElement(By.xpath("//*[@id='hhfd']"))).perform();
		doAction.contextClick(driver.findElement(By.xpath("//*[@id='hhfd']"))).perform(); // Right Click
		doAction.moveToElement(driver.findElement(By.xpath("//*[@id='hhfd']"))).perform(); // Mouse Hover
		doAction.dragAndDrop(driver.findElement(By.xpath("//*[@id='hhfd']")), driver.findElement(By.xpath("//*[@id='hhfd']"))).perform();
		doAction.clickAndHold(driver.findElement(By.xpath("//*[@id='hhfd']"))).perform();
		doAction.release(driver.findElement(By.xpath("//*[@id='hhfd']"))).perform();
		doAction.dragAndDropBy(driver.findElement(By.xpath("//*[@id='hhfd']")), 0, 100).perform(); // Slider
		doAction.moveByOffset(0,100).build().perform(); // Scrolling
		
		// Drag and Drop Another Way
		doAction.clickAndHold(driver.findElement(By.xpath("//*[@id='hhfd']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='hhfd']")))
		.release(driver.findElement(By.xpath("//*[@id='hhfd']"))).build().perform();
		
		
		
		// Keyboard Actions
		
		doAction.keyDown(Keys.CONTROL).keyDown(Keys.chord("v")).perform();
		doAction.keyUp(Keys.CONTROL).keyDown(Keys.chord("v")).perform();
		doAction.sendKeys(Keys.CONTROL).sendKeys(Keys.chord("v")).perform();
		
		
		//
		
		

	}

}
