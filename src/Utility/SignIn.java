package Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Parent.StartUp;
import Validate_Data.Test_Data;

public class SignIn extends StartUp {

	@BeforeTest
	public void startcode(){
		
		startup_main();
	}
	
	@Test //(dataProvider = "get_data")
	public void testGetData()
	{
		
		System.out.println("111");
		driver.get("http://103.226.185.90/style_icon/catalog/");
		//Test_Data.SignIn(email , password);
	
	}
	
	/*
	@DataProvider
	public Object[][] get_data()
	{
		
		return Test_Data.DataDriven(Sign_In, "SignIn");
		
	}
	*/
}
