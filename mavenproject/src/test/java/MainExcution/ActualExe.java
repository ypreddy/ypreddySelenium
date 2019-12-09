package MainExcution;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ModularFrameWork.RepositoryClass;

public class ActualExe 
{
	static RepositoryClass ob;

	@BeforeClass
	public static void setUpBeforeClass() 
	{
		ob = new RepositoryClass();
		
		ob.BrowserLanching();
				
	}

	@AfterClass
	public static void tearDownAfterClass() 
	{
		ob.closeOP();
	}


	@Test
	public void test() 
	{
				
		ob.registerLink();
		
		ob.IamFresherLink();
		
		ob.name();
	}

}
