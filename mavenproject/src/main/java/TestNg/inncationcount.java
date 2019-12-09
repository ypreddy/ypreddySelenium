package TestNg;

import org.testng.annotations.Test;

public class inncationcount 
{

	
	
	   @Test(priority=0,invocationCount=4)
	    public void InsertCard1()
	   {
		
        System.out.println("I am inserting the card");
	    }
		@Test(priority=1,invocationCount=1)
		public void Login()
		{
			
		System.out.println("i am login");
        }
		
		@Test(priority=2,invocationCount=1)
		public void  Password()
		{
			
		System.out.println("I am enterring password");

          }
}