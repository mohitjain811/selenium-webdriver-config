package seleniumtuts;

import java.util.List;
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
public class AllHyperLinksAccess {
    public static void main(String[] args) {
    	/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseWebUrl = "file:///C:/selenium_tests/case_sensitive_match_hyperlink.html";
		driver.get(baseWebUrl);
		
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get(baseWebUrl);
        /* get the actual value of the title*/
        List<WebElement> linkOccurence = driver.findElements(By.tagName("a"));
        for(WebElement element : linkOccurence){
        	System.out.println("The Hyperlink occurrences  is : "+element.getText());
        } 	
        /*closing Chrome Browser and System*/
        driver.close();
       
        /* Exiting the System */
        System.exit(0);
    }
}
