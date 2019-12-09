package ModularFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RepositoryClass extends InputDataClass
{
	WebDriver driver;
	public void BrowserLanching()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		// Webpage Lanching
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().fullscreen();
	}
	public void registerLink()
	{
		driver.findElement(RegisterNow).click();
	}
	public void IamFresherLink()
	{
		driver.findElement(IamFresher).click();
	}
	public void name()
	{
		driver.findElement(name).sendKeys(name1);
	}
}
