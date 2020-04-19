package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author mohit
 *
 */
public class UsingChromeWebDriver {
    public static void main(String[] args) {
    	/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driverGC = new ChromeDriver();
        String baseWebUrl = "https://www.facebook.com/";
        driverGC.get(baseWebUrl);
        String heading = driverGC.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/h2"))
        		.getText(); 
        System.out.println("Heading on the Web Page is: "+ heading);
        /*closing Google Chrome Browser*/
        driverGC.close();
        /*Exiting the System*/
        System.exit(0);
    }
}
