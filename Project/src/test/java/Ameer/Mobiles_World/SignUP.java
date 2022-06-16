package Ameer.Mobiles_World;



import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Resources.Baseclass;
import pageObject.RegFormsignup;
import pageObject.SignUPpage;



public class SignUP extends Baseclass {
	
	@BeforeMethod
	public static void beforeMethod() throws IOException {
	driver = initializeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	}
	
	@Test (dataProvider = "getRegdata")
	public void Regnavigation(String fname,String lname, String  emailid, String pwd, String date,String mob ) throws IOException, InterruptedException {
	
	SignUPpage sup = new SignUPpage(driver);
	sup.getsignin().click();
	Thread.sleep(200);
	sup.getsignup().click();
	RegFormsignup rfs = new RegFormsignup(driver);
	rfs.Firstname().sendKeys(fname);
	Thread.sleep(10);
	rfs.Lastname().sendKeys(lname);
	Thread.sleep(10);
	rfs.email().sendKeys(emailid);
	Thread.sleep(10);
	rfs.password().sendKeys(pwd);
	Thread.sleep(10);
	rfs.date().sendKeys(date);
	Thread.sleep(10);
	rfs.Gendermale().click();
	Thread.sleep(10);
	rfs.Mob().sendKeys(mob);
	Thread.sleep(100);
	rfs.Shortbio().sendKeys("Be safe Take Care");
	rfs.Register().click();
	}	
	
	
	@DataProvider //to give data for input in several times
	public Object[][] getRegdata()
	{
		//Row---> For how many different datatypes test should run(5---> 0,1,2,3,4)
		//column--> how many values per test
		//String fname,String lname, String  emailid, String pwd, String date,String mob
		//array list
		Object[][] data= new Object[1][6];
		data[0][0] = "Ameer";
		data[0][1] = "Musthaq";
		data[0][2] = "Admin@gmail.com";
		data[0][3] = "Admin@123";
		data[0][4] = "18/01/1999";
		data[0][5] = "9876543210";
	
		/*// invalid first nd last name
		data[1][0] = "Am";
		data[1][1] = "Mu";
		data[1][2] = "Admin@gmail.com";
		data[1][3] = "Admin@123";
		data[1][4] = "12/04/2022";
		data[1][5] = "9876543210";
		
		data[2][0] = "AmeerMusthaqbmrtfh";
		data[2][1] = "AmeerMusthaqbmrtfh";
		data[2][2] = "Admin@gmail.com";
		data[2][3] = "Admin@123";
		data[2][4] = "12/04/2022";
		data[2][5] = "9876543210";
	
		//invalid emailid
		data[3][0] = "Ameer";
		data[3][1] = "Musthaq";
		data[3][2] = "Admingmail.com";
		data[3][3] = "Admin@123";
		data[3][4] = "12/04/2022";
		data[3][5] = "9876543210";
		
		//invalid password
		data[4][0] = "Ameer";
		data[4][1] = "Musthaq";
		data[4][2] = "Admingmail.com";
		data[4][3] = "Ad";
		data[4][4] = "12/04/2022";
		data[4][5] = "9876543210";
		
		data[5][0] = "Ameer";
		data[5][1] = "Musthaq";
		data[5][2] = "Admingmail.com";
		data[5][3] = "Admin@123456";
		data[5][4] = "12/04/2022";
		data[5][5] = "9876543210";
		//Mob invalid
		data[6][0] = "Ameer";
		data[6][1] = "Musthaq";
		data[6][2] = "Admin@gmail.com";
		data[6][3] = "Admin@123";
		data[6][4] = "18/01/1999";
		data[6][5] = "98765432";
		
		data[7][0] = "Ameer";
		data[7][1] = "Musthaq";
		data[7][2] = "Admin@gmail.com";
		data[7][3] = "Admin@123";
		data[7][4] = "18/01/1999";
		data[7][5] = "98765432100";*/
	
		return data;
	}
	@AfterMethod
	public static void AfterMethod() throws IOException {
		driver.quit();
		}
	
}
