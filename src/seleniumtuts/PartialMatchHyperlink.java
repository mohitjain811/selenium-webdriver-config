package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author mohit
 *
 */
public class PartialMatchHyperlink {
	
    public static void main(String[] args) {
    	/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseWebUrl = "file:///C:/selenium_tests/partial_match_hyperlink.html";
		driver.get(baseWebUrl);
		String webTitle = "";
        
        /*Launch Chrome browser and browse the Base URL*/
        driver.get(baseWebUrl);
        
        /* get the actual value of the title*/
        driver.findElement(By.partialLinkText("view")).click();
        webTitle = driver.getTitle();
        System.out.println("The title of selected Website is : "+webTitle); 
        
        /*closing Chrome Browser and System*/
        driver.close();
        
        /* Exiting the System */
        System.exit(0);
    }
}
