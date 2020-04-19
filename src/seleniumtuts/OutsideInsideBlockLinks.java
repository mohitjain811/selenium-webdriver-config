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
public class OutsideInsideBlockLinks {
    public static void main(String[] args) {
    	/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseWebUrl = "file:///C:/selenium_tests/inside_and_outside_hyperlink.html";
		driver.get(baseWebUrl);
		
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get(baseWebUrl);
        
        driver.findElement(By.partialLinkText("Outside")).click();
        String webTitle = driver.getTitle();
        System.out.println("The title of selected Website is : "+webTitle); 
        
        /*closing Chrome Browser and System*/
        driver.close();
       
        /* Exiting the System */
        System.exit(0);
    }
}
