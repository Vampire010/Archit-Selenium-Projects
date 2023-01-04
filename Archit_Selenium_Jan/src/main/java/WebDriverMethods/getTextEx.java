package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextEx {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[2]/a")).click();        
        WebElement aboutsTxt = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[1]"));        
        String pageTxt = aboutsTxt.getText();        
        System.out.println(pageTxt);
       
        System.out.println("******************************************");

        List<WebElement> pageText = driver.findElements(By.tagName("p"));
        for(WebElement pageText1 :  pageText )
        {
            System.out.println(pageText1.getText());
        }
        
        System.out.println("******************************************");
        
        List<WebElement> pageLinks = driver.findElements(By.tagName("a"));
        for(WebElement AllLinks :  pageLinks )
        {
            System.out.println(AllLinks.getAttribute("href"));
        }
                
        driver.quit();
	}

}
