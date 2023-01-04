package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickActionEx 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        //driver.get("https://parabank.parasoft.com/");
        driver.navigate().to("https://parabank.parasoft.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        
        driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Rama");
        
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).clear();
        
        //Thread.sleep(5000);
        driver.navigate().back();
        
      //Thread.sleep(5000);
        driver.navigate().forward();
        
       //Thread.sleep(5000);
        driver.navigate().refresh();
        
        driver.quit();
        
	}

}
