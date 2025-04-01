package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CoreHR {
	
	@Test
	public void CoreHRCreateUserWith()
	{
		System.out.println("Employee IS Created");
	}

	@Test
	public void CoreHRRehireUserWith()
	{
		System.out.println("Employee is rehired");
	}
	
	@Test
	public void CoreHRUpdateFirstName()
	{
		System.out.println("FirstName is updated");
		Assert.assertTrue(false);
	}

}
