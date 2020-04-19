package seleniumtuts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSiblingFunction {

	public static void main(String args[]) {
		/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/selenium_tests/contain_ancestor_sibling.html");

		List<WebElement> webelements = driver
				.findElements(By.xpath("//div[@class='x2']/parent::div//a[@class='y1']//following-sibling::a"));

		for (WebElement webElement : webelements) {
			System.out.println(webElement.getText());
		}
		driver.quit();
	}
}
