package seleniumtuts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * 
 * @author mohit
 *
 */
public class HubNodeModelDemo {
	public static void main(String args[]) {
		String baseURL = "https://www.google.com/";
		String hubURL = "http://192.168.5.7:4444/wd/hub";
		WebDriver driver = null;
		DesiredCapabilities capabilities = null;
		
		try {
			capabilities = DesiredCapabilities.chrome();
			capabilities.setPlatform(Platform.WIN10); 
			capabilities.setBrowserName("chrome"); 
			driver = new RemoteWebDriver(new URL(hubURL),capabilities);
			
			driver.get(baseURL);
			
			if ("Google".equals(driver.getTitle())) {
				System.out.println("The Test has Passed Successfully as the web page title matches.");
				System.out.println("The web page title is: " + driver.getTitle());
			} else {
				System.out.println("The test has failed!");
				System.out.println("The web page title is: " + driver.getTitle());
			}
			driver.quit();
		} catch (MalformedURLException exp) {
			exp.printStackTrace();
		}
	}
}
