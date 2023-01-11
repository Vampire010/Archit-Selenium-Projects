package Javascript_Alerts_Screenshot_Waits;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;


public class JavaScrip_Alerts_Confirm_Prompt 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\eclipse-workspace\\Archit_Selenium_Jan\\BrowserDrivers\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement alertsEx=driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/p[2]/a"));
    	WebElement confirmEx=driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/p[4]/a"));
    	WebElement promptEx=driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/p[6]/a"));

    	alertsEx.click();
    	Alert alrt = driver.switchTo().alert();
    	alrt.accept();
    	
    	
    	confirmEx.click();
    	alrt.accept();

    	
    	WebElement wait  = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/main/div/p[6]/a")));

    	promptEx.click();
    	
    	
    	alrt.sendKeys("Selenium");
    	alrt.accept();
    	
    	
    	
    	 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    	 Files.copy(screenshotFile, new File("C:\\Users\\giris\\git\\Selenium-Projects\\Archit_Selenium_Jan\\Screshots\\imgq.png"));

     	Thread.sleep(2000);

    	driver.quit();


	}
}
