package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUPpage {

		public WebDriver driver;
		
		By signin = By.xpath("//*[@id=\"navbarSupportedContent\"]/button");
		By signup = By.xpath("//a[@href='signup.html']");
	
	
		public SignUPpage(WebDriver driver) {
			this.driver=driver;
		
		}


		public WebElement getsignin()
		{
			return driver.findElement(signin);
		}

		public WebElement getsignup()
		{
			return driver.findElement(signup);
		}

}
