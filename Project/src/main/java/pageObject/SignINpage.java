package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignINpage {

		public WebDriver driver;
		
		
		By Email = By.xpath("//input[@id='username']");
		By Password = By.id("password");
		By Loginbtn =By.xpath("//*[@id=\"submitForm\"]/div[4]/a");
		
	
		public SignINpage(WebDriver driver) {
			this.driver=driver;
		
		}

	

		public WebElement getEmail()
		{
			return driver.findElement(Email);
		}

		public WebElement getPassword()
		{
			return driver.findElement(Password);
		}
		
		public WebElement getLoginbtn()
		{
			return driver.findElement(Loginbtn);
		}
}
