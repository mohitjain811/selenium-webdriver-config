package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/**
 * 
 * @author mohit
 *
 */
public class SeleniumFormElementsAccess {
	public static void main(String[] args) {
		/* Setting the System Properties*/
    	System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		
    	String baseWebUrl = "file:///C:/selenium_tests/selenium_form_access.html";
		driver.get(baseWebUrl);
		
		// Input Box
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("secondname")).sendKeys("Tutorials");
		
		// Password Box
		driver.findElement(By.name("password")).sendKeys("welcome");
		
		// Radio Button
		driver.findElement(By.cssSelector("input[value='female']")).click();
		
		// Drop-down Box
		Select dropDown = new Select(driver.findElement(By.name("vehicle")));
		dropDown.selectByVisibleText("Sedan");
		
		// Selecting Items in a Multiple SELECT element
		Select selectItem = new Select(driver.findElement(By.name("profession")));
		selectItem.selectByVisibleText("Engineer");
		
		// TextArea
		driver.findElement(By.tagName("textarea")).sendKeys("Welcome to Selenium WebDriver World!");
		
		// Submit Button
		driver.findElement(By.name("Go")).submit();
		
		// Links
		driver.findElement(By.linkText("Google Search here")).click();
		
		/* closing Chrome Browser */
		driver.close();
		
		/* Exiting the System */
		System.exit(0);
	}
}