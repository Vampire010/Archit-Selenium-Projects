package DropDownsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        
        WebElement nav_search_dropdown =driver.findElement(By.id("searchDropdownBox"));
        
        Select dropdown = new Select(nav_search_dropdown);
        Thread.sleep(5000);

        dropdown.selectByIndex(1);
        
        Thread.sleep(5000);

        dropdown.selectByValue("search-alias=electronics");
        
        Thread.sleep(5000);
        
        dropdown.selectByVisibleText("Appliances");

        Thread.sleep(5000);
        
        driver.quit();
	}
}
