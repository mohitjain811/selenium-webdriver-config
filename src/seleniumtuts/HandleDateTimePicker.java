package seleniumtuts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author mohit
 *
 */
public class HandleDateTimePicker {
    public static void main(String[] args) {
   
    /*declaration and instantiation of objects*/
    System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    String baseWebUrl = "file:///C:/selenium_tests/selenium_date_time.html";
    driver.get(baseWebUrl);
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement webElement = driver.findElement(By.name("datetime-box")); 
    
    //Fill date as 08-11-1987
    webElement.sendKeys("0019841108");
    
    //Fill time as 02:30 PM 
    webElement.sendKeys("0230PM");
    
    /*closing Google Chrome Browser*/
    driver.close();
    
    /*Exiting the System*/
    System.exit(0);
	}
}
