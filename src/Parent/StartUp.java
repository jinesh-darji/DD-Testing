package Parent;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.unicodetechnologies.xlsConnectivity.XLSDatatable_Connectivity;

public class StartUp {

	public static WebDriver driver = null;
	public static XLSDatatable_Connectivity Sign_In = null;

	
public void startup_main()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\eclipse\\Drivers\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Sign_In = new XLSDatatable_Connectivity(System.getProperty("C:\\Users\\user\\workspace1\\TestProject5\\src\\Validate_Data\\Sign_In.xlsx"));
		
	}
	
	
	
}
