package seleniumtuts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 * @author mohit
 *
 */
public class ContainSiblingAncestor {
	public static void main(String args[]){
	  WebDriver driver = new FirefoxDriver();        
	  driver.get("file:///C:/selenium_demo/Contain-Sibling-Ancestor.html");
	  //SIBLING Demonstration
	  List<WebElement> sibElements = driver.findElements(By.xpath("//a[contains(text(),"
	  		+ "'Inside div block 2.')]/parent::div//following-sibling::div[@class='c']//a"));
	  for (WebElement webElement : sibElements) {
		    System.out.println("SIBLING Demonstration: ");
	        System.out.println(webElement.getText());
	   }
	  //ANCESTOR Demonstration
	  List<WebElement> ancElements = driver.findElements(By.xpath("//a[contains(text(),'Inside div block 2.')]/ancestor::div//a"));
	  for (WebElement webElement : ancElements) {
		    System.out.println("ANCESTOR Demonstration: ");
	        System.out.println(webElement.getText());
	   }
	   driver.quit();
	  }
}
