package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Benifits {
	
	@Parameters({ "URL" })
	@Test
	public void beforeClass(String urlName)
	{
		System.out.println("It will Execute before al the methods in class");
		System.out.println(urlName);
	}
	
	@Test(dependsOnMethods = {"beforeClass","BenifitsUpdateTheSalary"})
	public void beforeAlltheMethod()
	{
		System.out.println("It will execute before all the test case");
	}
	@Parameters({ "URL" ,"API/KEY"})
	@Test
	public void BenifitsCreateSalary(String urlName, String ApiKeyvalue)
	{
		System.out.println("Url Added:"+urlName);
		System.out.println("Api Key Value added:"+ ApiKeyvalue);
	}

	@Test
	public void BenifitsUpdateTheSalary()
	{
		System.out.println("Salary is Updated");
	}
}
