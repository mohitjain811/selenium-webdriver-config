package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author mohit
 *
 */
public class ImageHyperLinkAccess {
    public static void main(String[] args) {
    	/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        String baseWebUrl = "https://ca.yahoo.com/";
        String websiteTitle = "";
        
        /*Launch Chrome browser and browse the Base URL*/
        driver.get(baseWebUrl);
        
        /* get the actual value of the title*/
        driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div/div/h1/a/img")).click(); 
        
        websiteTitle = driver.getTitle();
        System.out.println("Title for selected Website: "+websiteTitle); 
        
        /* closing Chrome Browser */
		driver.close();
		
		/* Exiting the System */
		System.exit(0);
    }
}
