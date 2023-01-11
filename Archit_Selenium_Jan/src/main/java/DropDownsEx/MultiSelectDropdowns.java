package DropDownsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdowns 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.get("file:///C:/Users/giris/git/Selenium-Projects/Archit_Selenium_Jan/src/main/java/DropDownsEx/multiSelectDropdown.html");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        
        WebElement nav_search_dropdown =driver.findElement(By.id("cars"));
        
        Select dropdown = new Select(nav_search_dropdown);
        Thread.sleep(5000);

        dropdown.selectByIndex(0);
        
        Thread.sleep(5000);

        dropdown.selectByValue("opel");
        
        Thread.sleep(5000);
        
        dropdown.selectByVisibleText("Audi");

        Thread.sleep(5000);
        
        /*        
        dropdown.deselectByIndex(3);
        
        Thread.sleep(5000);
        
        dropdown.deselectByValue("volvo");
        
        Thread.sleep(5000);
        
        dropdown.deselectByVisibleText("Opel");
        
        Thread.sleep(5000);  */


        dropdown.deselectAll();
        
        driver.quit();
	}

}
