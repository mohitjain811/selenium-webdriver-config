package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
/**
 * 
 * @author mohit
 *
 */
public class MouseEventWebDriver {
    public static void main(String[] args) {
    	/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseWebUrl = "https://www.walmart.ca/en";
        driver.get(baseWebUrl);
        /* get the actual value of the title*/
        
        WebElement headerelement = driver.findElement(By.linkText("Health"));
        Actions builder = new Actions(driver);
        /* To mouse over the link */
        Action mouseoverevent = builder.moveToElement(headerelement).build();
        mouseoverevent.perform();
        
        /* To click the selected link */
        Actions mouseclickevent = builder.moveToElement(headerelement).click();
        mouseclickevent.perform();
        
        /*closing Chrome Browser and System*/
        driver.close();
       
        /* Exiting the System */
        System.exit(0);
    }
}
