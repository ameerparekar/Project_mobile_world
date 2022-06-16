package Ameer.Mobiles_World;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Baseclass;
import pageObject.Allmobilepage;
import pageObject.LandingPage;
import pageObject.Supportpage;
import pageObject.latestPage;


public class Homepage extends Baseclass {
	
	@BeforeMethod
	public static void beforeMethod() throws IOException {
	driver = initializeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	}
	
	@Test(priority = 0)
	public void SamsungNavigation() throws IOException, InterruptedException
	{
		
		LandingPage lp = new LandingPage(driver);
		lp.getLatest().click();
		latestPage lap =new latestPage(driver);
		lap.getSamsung().click();
		Thread.sleep(200);
		JavascriptExecutor scroll =(JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 700)");
		
		
	}
	
	@Test(priority = 1)
	public void LenovoNavigation() throws IOException, InterruptedException
	{
		
		LandingPage lp = new LandingPage(driver);
		lp.getLatest().click();
		latestPage lap =new latestPage(driver);
		lap.getLenovo().click();
		Thread.sleep(200);
		
	}
	
	@Test(priority = 2)
	public void AppleNavigation() throws IOException, InterruptedException
	{
	
		LandingPage lp = new LandingPage(driver);
		lp.getLatest().click();
		latestPage lap =new latestPage(driver);
		Thread.sleep(200);
		lap.getApple().click();
		Thread.sleep(200);
		JavascriptExecutor scroll =(JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 700)");
		
	}
	
	@Test(priority = 3)
	public void allmobileNavigation() throws IOException, InterruptedException
	{
		
		Allmobilepage amp = new Allmobilepage(driver);
		amp.getallMobiles().click();
		Thread.sleep(200);
		Assert.assertTrue(amp.getallMobiles().isDisplayed());
		
	}
	
	@Test(priority = 4)
	public void orderNavigation() throws IOException, InterruptedException
	{
		Supportpage amp = new Supportpage(driver);
		amp.getSupport().click();
		Thread.sleep(200);
		Set<String> window = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		amp.getOrder().click();	
		
	}
	
	@Test(priority = 5)
	public void ContactusNavigation() throws IOException, InterruptedException
	{
		Supportpage amp = new Supportpage(driver);
		amp.getSupport().click();
		Thread.sleep(200);
		amp.getContactUs().click();		
	}
	
	@Test(priority = 6)
	public void HomeFooterNavigation() throws IOException, InterruptedException
	{
		LandingPage lp = new LandingPage(driver);
		Thread.sleep(200);
		lp.gethomeFooter().click();
		Thread.sleep(200);
	}
	
	
	@Test(priority = 7)
	public void RightarrowNavigation() throws IOException, InterruptedException
	{
		LandingPage lp = new LandingPage(driver);
		Thread.sleep(1000);
		Set<String> window = driver.getWindowHandles();
		JavascriptExecutor scroll =(JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 2500)");
		Thread.sleep(2000);
		lp.getrightredarrow().click();
		Thread.sleep(2000);;
	}
	
	
	@AfterMethod
	public static void AfterMethod() throws IOException {
		driver.quit();
		}
	
}
