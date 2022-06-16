package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order {

		public WebDriver driver;
			
			By	Support = By.xpath("(//a[@id='navbarDropdown'])[2]");
			By	order = By.xpath("//a[@class='dropdown-item'][normalize-space()='Order']");
			By	firstname = By.id("inputFirstName");
			By	lastname = By.xpath("(//label[@for='inputLastName'])/following-sibling::input");
			By	Email = By.id("inputEmail");
			By	Password = By.id("inputPassword");
			By	Gender = By.id("flexRadioDefault1");
			By	Mobilenumber = By.xpath("//*[@type='number']");
			By	Add1 = By.id(" address1");
			By	Add2 = By.xpath("//input[@id='address2']");
			By	City = By.xpath("//input[@id='inputCity']");
			By	State = By.xpath("//select[@id='inputState']/option[3]");
			By	Zip = By.xpath("//*[@id=\"inputZip\"]");
			By	Brand = By.xpath("//input[@rel='apple']");
			By	model = By.xpath("//div[@class='apple']//option[2]");
			By	count= By.xpath("//input[@placeholder='no of mobiles']");
			By bought= By.xpath("//*[@id=\"bought\"]/option[2]");
			By check1 = By.id("gridCheck1");
			By check2 = By.xpath("(//label[@for='gridCheck1'])[2]");
			By ordernow = By.xpath("//button[normalize-space()='Order Now']");
			
			public Order(WebDriver driver) {
				this.driver=driver;
			}
			
			public WebElement Support()
			{
				return driver.findElement(Support);
			}
			public WebElement order()
			{
				return driver.findElement(order);
			}
			public WebElement firstname()
			{
				return driver.findElement(firstname);
			}
			public WebElement lastname()
			{
				return driver.findElement(lastname);
			}
			public WebElement Email()
			{
				return driver.findElement(Email);
			}
			public WebElement Password()
			{
				return driver.findElement(Password);
			}
			public WebElement Gender()
			{
				return driver.findElement(Gender);
			}
			public WebElement Mobilenumber()
			{
				return driver.findElement(Mobilenumber);
			}
			public WebElement Add1()
			{
				return driver.findElement(Add1);
			}
			public WebElement Add2()
			{
				return driver.findElement(Add2);
			}
			public WebElement City()
			{
				return driver.findElement(City);
			}
			public WebElement Zip()
			{
				return driver.findElement(Zip);
			}
			public WebElement Brand()
			{
				return driver.findElement(Brand);
			}
			public WebElement model()
			{
				return driver.findElement(model);
			}
			public WebElement count()
			{
				return driver.findElement(count);
			}
			public WebElement bought()
			{
				return driver.findElement(bought);
			}
			public WebElement check1()
			{
				return driver.findElement(check1);
			}
			public WebElement check2()
			{
				return driver.findElement(check2);
			}
			public WebElement ordernow()
			{
				return driver.findElement(ordernow);
			}
			public WebElement State()
			{
				return driver.findElement(State);
			}
		}


