package LocaterExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParabankUserRegister 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
        
        WebElement registerLnk = driver.findElement(By.linkText("Register"));
        //WebElement registerLnk = driver.findElement(By.partialLinkText("Regi"));        
        registerLnk.click();
        
        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Archit");
        
        WebElement lastName = driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("RANAPARIYA");
        
        WebElement address = driver.findElement(By.name("customer.address.street"));
        address.sendKeys("#21 Gandhi Nagar - temple Town");
        
        WebElement city = driver.findElement(By.name("customer.address.city"));
        city.sendKeys("Ahamadabadh");
        //Absalute Xpath
        WebElement state = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
        state.sendKeys("Gujarath");
        
        //Relative Xpath
        WebElement zipCode = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
        zipCode.sendKeys("395004");
        
        //CSS Selector
        WebElement phoneNumber = driver.findElement(By.cssSelector("#customer\\.phoneNumber"));
        phoneNumber.sendKeys("395004");
        
        //Relative Xpath
        WebElement ssn = driver.findElement(By.xpath("//input[@id='customer.ssn']"));
        ssn.sendKeys("5646737838");
        
        WebElement username = driver.findElement(By.xpath("//input[@id='customer.username']"));
        username.sendKeys("Archit_RANA2004-GUJ");

        
        WebElement password = driver.findElement(By.xpath("//input[@id='customer.password']"));
        password.sendKeys("Archit_RANAPARIYA@0123");
        
        WebElement repeatedPassword = driver.findElement(By.xpath("//input[@id='repeatedPassword']"));
        repeatedPassword.sendKeys("Archit_RANAPARIYA@0123");
        
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"));
        submitButton.submit();
	}


}
