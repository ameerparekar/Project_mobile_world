package Ameer.Mobiles_World;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Baseclass;
import pageObject.Allmobilepage;
import pageObject.LandingPage;
import pageObject.Order;
import pageObject.Supportpage;
import pageObject.latestPage;


public class Orderpage extends Baseclass {
	
	@BeforeMethod
	public static void beforeMethod() throws IOException {
	driver = initializeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	}
	
	@Test(dataProvider = "orderdata")
	public void OrderNavigation(String fname,String lname,String email, String pwd,String num,String add1,String add2, 
			String city, String zip ) throws IOException, InterruptedException
	{
		
		Order o=new Order(driver);
		o.Support().click();
		Thread.sleep(50);
		o.order().click();
		Set<String> window = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		Thread.sleep(50);
		o.firstname().sendKeys(fname); 
		Thread.sleep(50);
		o.lastname().sendKeys(lname); 
		Thread.sleep(50);
		o.Email().sendKeys(email); 
		Thread.sleep(50);
		o.Password().sendKeys(pwd); 
		Thread.sleep(50);
		o.Gender().click(); 
		Thread.sleep(50);
		o.Mobilenumber().sendKeys(num); 
		Thread.sleep(50);
		o.Add1().sendKeys(add1); 
		Thread.sleep(50);
		o.Add2().sendKeys(add2); 
		Thread.sleep(50);
		o.City().sendKeys(city); 
		Thread.sleep(50);
		o.State().click();
		Thread.sleep(50);
		o.Zip().sendKeys(zip);
		Thread.sleep(50);
		o.Brand().click();
		o.count().sendKeys("1");
		o.bought().click();
		o.check1().click();
		o.check2().click();
		o.ordernow().click();
	System.out.println("Order page successful");
	}
	
	@DataProvider //to give data for input in several times
	public Object[][] orderdata()
	{
		//Row---> For how many different datatypes test should run(5---> 0,1,2,3,4)
		//column--> how many values per test
		//String fname,String lname,String email, String pwd,String num,String add1,String add2, String city, String zip 
		//array list
		Object[][] data= new Object[2][9];
		data[0][0] = "Ameer";
		data[0][1] = "Musthaq B M";
		data[0][2] = "Admin@gmail.com";
		data[0][3] = "Admin@123";
		data[0][4] = "9876543210";
		data[0][5] = "Ist main road";
		data[0][6] = "Nagavara";
		data[0][7] = "Bangalore";
		data[0][8] = "560024";
		
		
		data[1][0] = "Am";
		data[1][1] = "Mu";
		data[1][2] = "Admingmail.com";
		data[1][3] = "Aeeftdmin@123";
		data[1][4] = "98543210";
		data[1][5] = "1s";
		data[1][6] = "Na";
		data[1][7] = "Bangaloreuyfij";
		data[1][8] = "5600265";
		return data;
				
	}
		
	
	
	@AfterMethod
	public static void AfterMethod() throws IOException {
		driver.quit();
		}
	
}
