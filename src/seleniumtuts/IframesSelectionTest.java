package seleniumtuts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author mohit
 *
 */
public class IframesSelectionTest {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("C:/selenium_tests/iframe_demo.html");

		List<WebElement> elements = driver.findElements(By.tagName("iframe"));

		for (WebElement element : elements) {
			driver.switchTo().frame(element);
		}

		System.out.println("Switching to the iframe!");
		System.out.println("Page control has switched to the URL in the frame!");

		/* Gathering the link text that is present on the web page */
		WebElement element = driver.findElement(By.xpath("//html/body/div/form/a"));

		System.out.println("The link text is: " + element.getText());

		driver.quit();
	}
}
