package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author mohit
 *
 */
public class SeleniumExplicitWait {
	public static void main(String[] args) {
		
		String expectedWebTitle = "Google";
		String actualWebTitle = "";
		
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait driverWait = new WebDriverWait(driver, 10);
		String baseWebUrl = "https://www.google.com/";
		
		driver.get(baseWebUrl);
		/* get the actual value of the title */
		actualWebTitle = driver.getTitle();
		if (actualWebTitle.contentEquals(expectedWebTitle)) {
			System.out.println("The Test has Passed!");
		} else {
			System.out.println("The Test has Failed!");
		}
		WebElement webElement;
		webElement = driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("noelementfound")));
		webElement.click();
		driver.close();
		System.exit(0);
	}
}
