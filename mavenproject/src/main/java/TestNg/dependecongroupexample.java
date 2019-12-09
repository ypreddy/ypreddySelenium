package TestNg;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependecongroupexample 
{
	@Test(groups="A")
	
	public void A()
	{
		System.out.println("");
		
	}
	
	@Test(groups="B",dependsOnGroups="A")
	public void B()
	{
		System.out.println("");
		Assert.assertTrue(false);	
	}
	
	@Test(groups="c",dependsOnGroups="B")
	public void C()
	{
		System.out.println("");
		
	}
	
	@Test(groups="d",dependsOnGroups="c")
	public void D()
	{
		System.out.println("");
		Assert.assertTrue(false);
	}
}

