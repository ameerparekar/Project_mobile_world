package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

		public WebDriver driver;
		
		
		By signin = By.xpath("//*[@id=\"navbarSupportedContent\"]/button");
		By latest = By.xpath("//a[@id='navbarDropdown'][1]");
		By homeFooter = By.xpath("/html/body/footer/ul/li[1]/a");
		By rightredarrow = By.xpath("//i[@class='fas fa-arrow-up']");
		
	
		public LandingPage(WebDriver driver) {
			this.driver=driver;
		
		}

		public WebElement getsignIN()
		{
			return driver.findElement(signin);
		}
		
		public WebElement getLatest()
		{
			return driver.findElement(latest);
		}
		
		public WebElement gethomeFooter()
		{
			return driver.findElement(homeFooter);
		}
		
		public WebElement getrightredarrow()
		{
			return driver.findElement(rightredarrow);
		}
}
