package test;

import org.testng.annotations.Test;

public class SendoDemoClass {
	
	
	@Test
	public void Ago()
	{
		System.out.println("From SendoDemoClass");
	}

	@Test(groups={"Smoke"})
	public void Ago2()
	{
		System.out.println("From SendoDemoClass and from Ago2 test case");
	}
}
