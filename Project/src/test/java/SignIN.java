

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Baseclass;
import pageObject.LandingPage;
import pageObject.SignINpage;

public class SignIN extends Baseclass{
	@BeforeMethod
	public static void beforeMethod() throws IOException {
	driver = initializeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	}
	
	@AfterMethod
	public static void AfterMethod() throws IOException {
		driver.quit();
		}
	
	@Test(dataProvider="getData")
	public void homePageNavigation(String Uname, String Password) throws IOException, InterruptedException
	{
		LandingPage lp = new LandingPage(driver);
		lp.getsignIN().click();
		
		
		SignINpage si = new SignINpage(driver);
		Thread.sleep(100);
		si.getEmail().sendKeys(Uname);
		Thread.sleep(100);
		si.getPassword().sendKeys(Password);
	
		Thread.sleep(100);
		si.getLoginbtn().click();
	}
	
	
	@DataProvider //to give data for input in several times
	public Object[][] getData()
	{
		//Row---> For how many different datatypes test should run(5---> 0,1,2,3,4)
		//column--> how many values per test
		
		//array list
		Object[][] data= new Object[5][2];
		data[0][0]="admin@gmail.com";
		data[0][1]="admin@123";
		
		data[1][0]="ad";
		data[1][1]="Admin@123";
		
		data[2][0]="abcdefghijklmn@gmail.com";
		data[2][1]="Admin@123";
		
		data[3][0]="Admin@gmail.com";
		data[3][1]="Admin@123456";
		
		data[4][0]="Admin@gmail.com";
		data[4][1]="Ad";
		
		return data;	
	}
	
	
}
