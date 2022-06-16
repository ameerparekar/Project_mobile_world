package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
public static WebDriver driver;
		public static WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Ameer.bm\\Desktop\\TEST\\Mobiles_World\\src\\main\\java\\Ameer\\Mobiles_World\\Data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ameer.bm\\Desktop\\TEST\\Mobiles_World\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
				driver = new FirefoxDriver();
		}
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
		
	
}
