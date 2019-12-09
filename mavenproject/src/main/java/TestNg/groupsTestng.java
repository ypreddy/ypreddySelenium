package TestNg;

import org.testng.annotations.Test;

public class groupsTestng 
{
	
	@Test(priority=0,groups="A")
	public void btestIT()
	{
		System.out.println("1");
	}

	@Test(priority=1,groups="A")
	public void AtestIT1()
	{
		System.out.println("2");
	}

	@Test(priority=2,groups="B")
	public void testIT2()
	{
		System.out.println("3");
	}
	@Test(priority=3,groups="C")
	public void btestIT3()
	{
		System.out.println("4");
	}


}
