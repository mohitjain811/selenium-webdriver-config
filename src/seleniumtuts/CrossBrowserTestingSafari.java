package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author mohit
 *
 */
public class CrossBrowserTestingSafari {

	public static void main(String[] args) {
		
		/* Declaration and instantiation of driver Object */
		WebDriver driver = new ChromeDriver();
		
		String baseWebUrl = "https://www.linkedin.com/";
		driver.get(baseWebUrl);
		
		String heading = driver.findElement(By.xpath("//body/main/section/div/h1")).getText();
		System.out.println("The Web Page Heading is: " + heading);
		
		/* closing Safari Browser */
		driver.close();
		
		/* Exiting the System */
		System.exit(0);
	}
}
