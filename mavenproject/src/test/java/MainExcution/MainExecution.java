package MainExcution;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MainExecution
{
	@BeforeClass
	public static void bc()
	{
		System.out.println("Executed First");
	}
	@Before
	public  void b()
	{
		System.out.println("Exeuted Before");
	}
	@Test
	public  void test() {
		System.out.println("Iam First test method");	}
	

	@Test
	@Ignore
	public  void test1() {
		System.out.println("I am 2nd method");
	}
	
	@After
	public  void a()
	{
		System.out.println("Execute After");
	}
	@AfterClass
	public static void ac()
	{
		System.out.println("Executed Last");
	}
}
