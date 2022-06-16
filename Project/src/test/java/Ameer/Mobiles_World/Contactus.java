package Ameer.Mobiles_World;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Baseclass;
import pageObject.Contact;


public class Contactus extends Baseclass{
	@BeforeMethod
	public static void beforeMethod() throws IOException {
	driver = initializeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	}
	
	@AfterMethod
	public static void AfterMethod() throws IOException {
		driver.quit();
		}
	
	@Test (dataProvider = "contactusdata")
	 public void ContactNavigation(String uname,String  email, String phno) throws IOException, InterruptedException
	 {
	
		Contact c =new Contact(driver);
		
		c.Support().click();
		c.Contactus().click();
		driver.manage().window().maximize();
		Set<String> window = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		driver.manage().window().maximize();
		c.uname().sendKeys(uname);
		c.Email().sendKeys(email);
		c.Phone().sendKeys(phno);
		Thread.sleep(100);
		c.Message().sendKeys("Lorem ipsum dolor sit amet consectetur adipisicing elit. Saepe dolorum adipisci recusandae praesentium dicta!");
		Thread.sleep(1000);
		c.Send().click();
	 }
	

	@DataProvider //to give data for input in several times
	public Object[][] contactusdata()
	{
		//Row---> For how many different datatypes test should run(5---> 0,1,2,3,4)
		//column--> how many values per test
		//String fname,String  emailid, String mob
		//array list
		Object[][] data= new Object[1][3];
		data[0][0] = "Ameer Musthaq B M";
		data[0][1] = "Admin@gmail.com";
		data[0][2] = "9567834231";
	
		/*// invalid first 
		data[1][0] = "Am";
		data[1][1] = "Admin@gmail.com";
		data[1][2] = "9567834231";
		
		data[2][0] = "AmeerMusthaqbmrtfh";
		data[2][1] = "Admin@gmail.com";
		data[2][2] = "9567834231";
		
	
		//invalid emailid
		data[3][0] = "Ameer Musthaq B M";
		data[3][1] = "Admingmail.com";
		data[3][2] = "9567834231";
		
		//invalid phonenumber
		data[4][0] = "Ameer Musthaq B M";
		data[4][1] = "Admin@gmail.com";
		data[4][2] = "95678342";
		
		data[5][0] = "Ameer Musthaq B M";
		data[5][1] = "Admin@gmail.com";
		data[5][2] = "956783423100";*/
		return data;
	}
	}

