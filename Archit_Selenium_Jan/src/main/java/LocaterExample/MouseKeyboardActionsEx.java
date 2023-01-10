package LocaterExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActionsEx 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.get("file:///C:/Users/giris/git/Selenium-Projects/Archit_Selenium_Jan/src/main/java/LocaterExample/dblclick.html");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);

        
        WebElement Doubleclickme = driver.findElement(By.xpath("/html/body/button"));
        
        Actions act = new Actions(driver);
        act.doubleClick(Doubleclickme).perform();
        
        Thread.sleep(5000);
        act.contextClick(Doubleclickme).perform();

        Thread.sleep(5000);

        driver.quit();
	}

}
