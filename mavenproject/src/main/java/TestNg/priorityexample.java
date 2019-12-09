package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priorityexample 
{

	// Pre-requisties
	@BeforeSuite
	public void BS()
	{
		System.out.println("BS");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("BT");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("BC");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("BM");
	}
	@Test(priority=0)
	public void btestIT()
	{
		System.out.println("1");
	}

	@Test(priority=1)
	public void AtestIT1()
	{
		System.out.println("2");
	}

	@Test(priority=2)
	public void testIT2()
	{
		System.out.println("3");
	}
	@Test(priority=3)
	public void btestIT3()
	{
		System.out.println("4");
	}
	// Post-Requisties
	@AfterMethod
	public void AM()
	{
		System.out.println("AM");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("AC");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("AT");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("AS");
	}

}
