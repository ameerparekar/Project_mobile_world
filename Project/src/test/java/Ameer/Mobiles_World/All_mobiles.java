package Ameer.Mobiles_World;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Baseclass;
import pageObject.Allmobilepage;
import pageObject.LandingPage;
import pageObject.Supportpage;
import pageObject.latestPage;


public class All_mobiles extends Baseclass {
	
	@BeforeMethod
	public static void beforeMethod() throws IOException {
	driver = initializeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	}
	
	/*@Test(dataProvider = "getsearchdata")
	public void SearchboxNavigation(String uname) throws IOException, InterruptedException
	{
		Allmobilepage amp = new Allmobilepage(driver);
		amp.getallMobiles().click();
		Thread.sleep(100);
		amp.getsearchbox().sendKeys(uname);
		Thread.sleep(2000);
	
	}
	
	
	@DataProvider //to give data for input in several times
	public Object[][] getsearchdata()
	{
		//Row---> For how many different datatypes test should run(5---> 0,1,2,3,4)
		//column--> how many values per test
		
		//array list
		Object[][] data= new Object[6][1];
		data[0][0]="Samsung galaxy A13";
		
		data[1][0]="Lenovo Legion 2";
		
		data[2][0]="Samsung @";
		
		data[3][0]="SA";
		
		data[4][0]="GA";
		
		data[5][0]="Le";
		
		return data;	
	}*/
	
	@Test()
	public void SpecficorderNavigation() throws IOException, InterruptedException
	{
		Allmobilepage amp = new Allmobilepage(driver);
		amp.getallMobiles().click();
		Thread.sleep(100);
		amp.getsearchbox().sendKeys("Samsung Galaxy S21");
		Thread.sleep(2000);
		amp.orderbtn().click();
		Set<String> window = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(window); 
		
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public static void AfterMethod() throws IOException {
		driver.quit();
		}
	
}
