package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegFormsignup {

		public WebDriver driver;
		
		By Firstname = By.id("myName");
		By Lastname = By.xpath("//input[@placeholder='Last Name']");
		By email = By.xpath("//input[@placeholder='Enter Email']");
		By password = By.xpath("//input[@placeholder='Password']");
		By date = By.className("form-control");
		By Gendermale = By.xpath("//label[text()='Male']");
		By Mob = By.xpath("//input[@type='number']");
		By Shortbio = By.xpath("//textarea[@placeholder='Short Bio']");
		By Register = By.xpath("//button[@type='submit']");
		
		public RegFormsignup(WebDriver driver) {
			this.driver=driver;
		
		}
		
		public WebElement Firstname()
		{
			return driver.findElement(Firstname);
		}
		
		public WebElement Lastname()
		{
			return driver.findElement(Lastname);
		}
		
		public WebElement email()
		{
			return driver.findElement(email);
		}
		public WebElement password()
		{
			return driver.findElement(password);
		}
		public WebElement date()
		{
			return driver.findElement(date);
		}
		public WebElement Gendermale()
		{
			return driver.findElement(Gendermale);
		}
		public WebElement Mob()
		{
			return driver.findElement(Mob);
		}
		public WebElement Shortbio()
		{
			return driver.findElement(Shortbio);
		}
		public WebElement Register()
		{
			return driver.findElement(Register);
		}
	
}

