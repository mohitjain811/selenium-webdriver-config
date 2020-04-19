package seleniumtuts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingContainsFunction {

	public static void main(String args[]) {
		/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		List<WebElement> webelements = driver
				.findElements(By.xpath("//h2[contains(text(),'Facebook')]"));

		for (WebElement webElement : webelements) {
			System.out.println(webElement.getText());
		}
		driver.quit();
	}
}
