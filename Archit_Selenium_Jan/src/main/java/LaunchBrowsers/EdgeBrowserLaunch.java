package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\msedgedriver.exe");  
		
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new EdgeDriver();  
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();

	}

}
