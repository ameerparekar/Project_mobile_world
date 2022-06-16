package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Supportpage {

		public WebDriver driver;
		
		By	Support = By.xpath("(//a[@id='navbarDropdown'])[2]");
		By	Order = By.xpath("//a[@href='order.html']");
		By	ContactUs = By.xpath("//a[@onclick='openPopup()']");
	
		public Supportpage(WebDriver driver) {
			this.driver=driver;
		
		}
		
		public WebElement getSupport()
		{
			return driver.findElement(Support);
		}

		public WebElement getOrder()
		{
			return driver.findElement(Order);
		}
		
		public WebElement getContactUs()
		{
			return driver.findElement(ContactUs);
		}

	
}

