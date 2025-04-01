package test;

import org.testng.annotations.Test;


public class FirstClassTest {
	
	
	@Test(groups={"Smoke"})
	public void Demo()
	{
		System.out.println("Sorabh");
	}

	
	@Test
	public void Demo2()
	{
		System.out.println("Dhanu");
	}
}
