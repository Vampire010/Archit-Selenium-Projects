package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerify {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.get("https://parabank.parasoft.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"topPanel\"]/a[1]/img")).click();   
        
        WebElement soapRdioBtn = driver.findElement(By.xpath("//*[@id=\"accessMode1\"]"));        
        boolean isaccessMode1BtnSelected = soapRdioBtn.isSelected();      
        System.out.println("isaccessMode1BtnSelected: " + isaccessMode1BtnSelected);
        
        WebElement restRdioBtn = driver.findElement(By.xpath("//*[@id=\"accessMode2\"]"));  
        restRdioBtn.click();
        isaccessMode1BtnSelected = soapRdioBtn.isSelected();      
        System.out.println("isaccessMode1BtnSelected: " + isaccessMode1BtnSelected);
        
        
        boolean isaccessMode1BtnDisplayed = soapRdioBtn.isDisplayed();    
        System.out.println("isaccessMode1BtnDisplayed: " + isaccessMode1BtnDisplayed);
        System.out.println("*********************");
        
        boolean isaccessMode1BtnEnabled = soapRdioBtn.isEnabled();    
        System.out.println("isaccessMode1BtnEnabled: " + isaccessMode1BtnEnabled);
        System.out.println("*********************");
        

        driver.quit();
        
	}

}
