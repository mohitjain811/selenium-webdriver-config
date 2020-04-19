package seleniumtuts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author mohit
 *
 */
public class SeleniumImplicitWait {
	
    public static void main(String[] args) {
    	
    	String expectedWebTitle = "Google";
        String actualWebTitle = "";
        
    	System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        String baseWebUrl = "https://www.google.com/";
        
        driver.get(baseWebUrl);
        /* Fetch the actual value of the title*/
        actualWebTitle = driver.getTitle();
        if (actualWebTitle.contentEquals(expectedWebTitle)){
            System.out.println("The Test has Passed!");
        } else {
            System.out.println("The Test has Failed!");
        }
        
        driver.findElement(By.name("noelementfound")); 
        driver.close();
        System.exit(0);
    }
}
