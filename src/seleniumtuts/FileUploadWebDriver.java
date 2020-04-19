package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author mohit
 *
 */
public class FileUploadWebDriver {
	public static void main(String[] args) {
		/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseWebUrl = "http://expirebox.com/";
        driver.get(baseWebUrl);
        /* get the actual value of the title*/
        
        WebElement element = driver.findElement(By.id("fileupload"));
        element.sendKeys("C:/selenium_tests/HTMLTable.html");
        
        /*closing Chrome Browser and System*/
        driver.close();
       
        /* Exiting the System */
        System.exit(0);
    }
}

