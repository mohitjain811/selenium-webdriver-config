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
public class IframesHandling {
	
	public static void main(String args[]){
		  System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();      
		  
		  driver.get("C:/selenium_tests/iframe_demo.html");
		  
		  /* Locating iframe */
		  List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		  
		  int totaltags = elements.size();
		  
		  System.out.println("Total number of iframes on the Web Page is/are: "+totaltags); 
		  
		  driver.quit();
		  }
}
