package LocaterExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        
        WebElement source=driver.findElement(By.xpath("//*[@id='credit2']/a"));
    	WebElement target=driver.findElement(By.xpath("//*[@id='bank']/li"));

    		Actions act=new Actions(driver);
    		
    		act.dragAndDrop(source, target).perform();
            Thread.sleep(5000);
            
            
            act.moveToElement(source).perform();
            
            Thread.sleep(5000);

            driver.quit();

	}

}
