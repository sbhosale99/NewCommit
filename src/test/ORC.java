package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ORC {

	@Test(groups={"Smoke"})
	public void ORCCreateUserWith()
	{
		System.out.println("Employee IS Created with ORC");
	}

	@BeforeTest
	public void ORCRehireUserWith()
	{
		System.out.println("Employee is rehired with ORC");
	}
	
	@AfterTest
	public void Manager()
	{
		System.out.println("I will execute First");
	}
	
	@Test
	public void CleanUpopartion()
	{
		System.out.println("Teshjfjf");
	}
}
