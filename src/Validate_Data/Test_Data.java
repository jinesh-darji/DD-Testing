package Validate_Data;

import org.openqa.selenium.By;

import com.unicodetechnologies.xlsConnectivity.XLSDatatable_Connectivity;

import Parent.StartUp;

public class Test_Data extends StartUp{

	public static void SignIn(String email , String password)
	{
		
		driver.get("http://103.226.185.90/style_icon/catalog/");
		
		driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div[1]/a[1]/u")).click();
		driver.findElement(By.name("email_address")).clear();
		driver.findElement(By.name("email_address")).sendKeys(email);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.id("tdb1")).click();
		
		driver.navigate().back();
		
	}
	
	
	public static Object[][] DataDriven(XLSDatatable_Connectivity data , String sheetname)
	{
		
		
		int rows = data.totalRow(sheetname);
		int cols = data.totalColumn(sheetname);
		
		Object mydata[][] = new Object[rows-1][cols];
		
		for(int row=2 ; row<=rows ; row++)
		{
			for(int col=0 ; col<cols ; col++)
			{
				mydata[row-2][col] = data.getData(sheetname, col, row);
			}
		}
		
		return mydata;
		
	}
}
