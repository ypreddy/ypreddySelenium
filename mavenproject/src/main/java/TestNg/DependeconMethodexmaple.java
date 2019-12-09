package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependeconMethodexmaple 
{

	
	@Test(priority=0)
	public void InsertCard()
	{
		
		System.out.println("I am inserting the card");
	}
	@Test(priority=1,dependsOnMethods="InsertCard")
	public void PIN()
	{
		System.out.println("I am entering the pin");
	}
	
	@Test(priority=2,dependsOnMethods="PIN")
	public void Options()
	{
		System.out.println("I am selecting options");
	}
	@Test(priority=3,dependsOnMethods="Options")
	public void WithDraw()
	{
		System.out.println("I am withdrawing the money");
	}
	
	
}
