package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.get("https://parabank.parasoft.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[2]/a")).click();   
        
        WebElement parabankLnk = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[3]/a"));        
        String txtColor = parabankLnk.getCssValue("color");       
        System.out.println("LinkText Color: " + txtColor);
        
        String fontSize = parabankLnk.getCssValue("font-size");       
        System.out.println("LinkText fontSize: " + fontSize);
        
        String fontFamily = parabankLnk.getCssValue("font-family");       
        System.out.println("LinkText fontFamily: " + fontFamily);
        
        Point getLocationlnk = parabankLnk.getLocation();       
        System.out.println("getLocationlnk : " + getLocationlnk);
        
        WebElement parabankImage = driver.findElement(By.xpath("//*[@id=\"topPanel\"]/a[2]/img"));        
        Dimension parabankImageSize = parabankImage.getSize();      
        System.out.println("parabankImageSize: " + parabankImageSize);
        
        driver.quit();
	}

}
