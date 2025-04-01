package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

	
	@Test(dataProvider = "getData")
	public void LoginCheck(String UserName,String Password)
	{
		System.out.println("The Username is:"+ UserName);
		System.out.println("The Password is:"+ Password);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//need to check LoginFunctalaity with 3 users
		//need to pass username password 3 times
		//[3]=Users
		//[2]=Values  username and password
		Object[][] data=new Object[3][2];
		
		
		data[0][0]="FIrstUsernameItIs";
		data[0][1]="FirstPasswordItIS";
		//2nd User
		data[1][0]="SecondUsernameItIs";
		data[1][1]="SecondPasswordItIS";
		//3rd User
		data[2][0]="ThirdUsernameItIs";
		data[2][1]="ThirdPasswordItIS";
		return data;
	}
}
