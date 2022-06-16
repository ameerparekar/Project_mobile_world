package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Allmobilepage {

		public WebDriver driver;
		
		By allMobiles = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a");
		By searchbox = By.xpath("//*[@class='form-control mb-4']");
		By orderbtn = By.xpath("(//a[text()='Order'])[2]");
	
		public Allmobilepage(WebDriver driver) {
			this.driver=driver;
		
		}
		
		public WebElement getallMobiles()
		{
			return driver.findElement(allMobiles);
		}
		
		public WebElement getsearchbox()
		{
			return driver.findElement(searchbox);
		}
		
		public WebElement orderbtn()
		{
			return driver.findElement(orderbtn);
		}
	
}

