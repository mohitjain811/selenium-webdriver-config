package seleniumtuts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author mohit
 *
 */
public class ConfirmAlertDemo {
	public static void main(String[] args) {

		/* Instantiating the Chrome browser WebDriver */
		WebDriver driver = new ChromeDriver();

		/* Loading local HTML file */
		String localWebUrl = "file:///C:/selenium_tests/selenium_tests.html";
		driver.get(localWebUrl);
		driver.findElement(By.name("confirmButton")).click();

		/* Switch to Alert */
		Alert alert = driver.switchTo().alert();

		/* Capture alert message into a String. */
		String alertMsg = driver.switchTo().alert().getText();

		/* Display the alert message */
		System.out.println("The Confirm Alert box message is: " + alertMsg);

		/* Accepting the alert */
		alert.accept();

		/* closing the Google Chrome Browser */
		driver.close();

		/* Exiting the System */
		System.exit(0);
	}
}
