package seleniumtuts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 * @author mohit
 *
 */
public class SeleniumIntegration {

	public String URL;

	public void setURL(String URL) {
		this.URL = URL;
	}

	public String getTitle() {
		/* Declaration and Instantiation of WebDriver object */
		WebDriver driver = new FirefoxDriver();
		String baseUrl = URL;
		driver.get(baseUrl);
		
		/* Get Web Title */
		String actualWebTitle = driver.getTitle();
		driver.close();

		return actualWebTitle;
	}
}
