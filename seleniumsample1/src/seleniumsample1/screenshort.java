package seleniumsample1;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshort {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(1000);
	    
	    java.io.File img =( ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
	    FileUtils.copyFile(img,new java.io.File("D:\\Selenium Jars\\Screenshort\\facebook_loginfaliure.png"));
	}

}
