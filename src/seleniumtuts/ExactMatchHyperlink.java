package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExactMatchHyperlink {

	public static void main(String[] args) {
		/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseWebUrl = "file:///C:/selenium_tests/exact_match_hyperlink.html";
		driver.get(baseWebUrl);
		String webTitle = "";

		/* Launch Chrome browser and browse the Base URL */
		driver.get(baseWebUrl);
		 
		/* get the actual value of the title */
		driver.findElement(By.linkText("click and explore")).click();
		
		webTitle = driver.getTitle();
		System.out.println("The Title of selected Website is : " + webTitle);

		/* closing Chrome Browser */
		driver.close();
		
		/* Exiting the System */
		System.exit(0);
	}
}
