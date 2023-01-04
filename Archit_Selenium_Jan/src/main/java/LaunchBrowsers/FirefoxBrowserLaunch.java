	package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\geckodriver.exe");  
		
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new FirefoxDriver(); 
       
        driver.get("https://www.selenium.dev/");
        
        driver.manage().window().maximize();

	}

}
