package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author mohit
 *
 */
public class CaseSensitiveHyperLinks {
	
    public static void main(String[] args) {
    	/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseWebUrl = "file:///C:/selenium_tests/case_sensitive_match_hyperlink.html";
		driver.get(baseWebUrl);
		
        /*Launch Chrome browser and browse the Base URL*/
        driver.get(baseWebUrl);
        
        /* get the actual value of the title*/
        driver.findElement(By.partialLinkText("CLICK")).click();
        
        String websiteTitle2 = driver.getTitle(); 
        
        System.out.println("Title for selected Website for VIEW link: "+websiteTitle2);
        
        /*closing Chrome Browser and System*/
        driver.close();
       
        /* Exiting the System */
        System.exit(0);
    }
}

