package seleniumsample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uiverificationcommand12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe");
    WebDriver ypreddy=new ChromeDriver();
    ypreddy.get("http://facebook.com");
    ypreddy.manage().window().maximize();
    
    Thread.sleep(1000);
    
    
    String pagetittle=ypreddy.getTitle();
    
    
    		
    		
    String pageTitle = ypreddy.getTitle();
    String pageURL = ypreddy.getCurrentUrl();
    String pageWindowId = ypreddy.getWindowHandle();
    //String pageSource = ypreddy.getPageSource();
    
    System.out.println(pageTitle+"\n"+pageURL+"\n"+pageWindowId+"\n");
    
    // Check url of the forgot password
    
    String ExpectedURL = "https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar";
    String ActualURL = ypreddy.findElement(By.linkText("Forgotten account?")).getAttribute("href");
    
    System.out.println(" Expected:"+ExpectedURL+"\nActualURL"+ActualURL);
    boolean Result = ExpectedURL.equals(ActualURL);
    
    System.out.print("The Result Is:"+Result);
	}

}
