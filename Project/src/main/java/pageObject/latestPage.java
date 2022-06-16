package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class latestPage {

		public WebDriver driver;
		
		By latest = By.xpath("//a[@id='navbarDropdown'][1]");
		By samsung = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/div/a[1]");
		By lenovo = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/div/a[2]");
		By apple = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/div/a[3]");
		
	
		public latestPage(WebDriver driver) {
			this.driver=driver;
		
		}
		
		public WebElement getlatest()
		{
			return driver.findElement(latest);
		}
		
		public WebElement getSamsung()
		{
			return driver.findElement(samsung);
		}
		
		public WebElement getLenovo()
		{
			return driver.findElement(lenovo);
		}
		
		public WebElement getApple()
		{
			return driver.findElement(apple);
		}
}

