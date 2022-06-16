package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {

		public WebDriver driver;
			
			By	Support = By.xpath("(//a[@id='navbarDropdown'])[2]");
			By	Contactus = By.xpath("//a[@onclick='openPopup()']");
			By	uname = By.xpath("//input[@placeholder='Username']");
			By	Email = By.xpath("//input[@placeholder='Email']");
			By	Phone = By.xpath("//input[@placeholder='Phone']");
			By	Message = By.xpath("//textarea[@placeholder='Message']");
			By	Send = By.xpath("//input[@value='Send']");
			
			
			public Contact(WebDriver driver) {
				this.driver=driver;
			}
			
			public WebElement Support()
			{
				return driver.findElement(Support);
			}
			public WebElement Contactus()
			{
				return driver.findElement(Contactus);
			}
			public WebElement uname()
			{
				return driver.findElement(uname);
			}
			public WebElement Email()
			{
				return driver.findElement(Email);
			}
			public WebElement Phone()
			{
				return driver.findElement(Phone);
			}
			public WebElement Message()
			{
				return driver.findElement(Message);
			}
			public WebElement Send()
			{
				return driver.findElement(Send);
			}
		}


