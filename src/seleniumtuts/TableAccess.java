package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author mohit
 *
 */
public class TableAccess {
    public static void main(String[] args) {
    	/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseWebUrl = "file:///C:/selenium_tests/HTMLTable.html";
		driver.get(baseWebUrl);
        String text = "";
        
        /*Launch Chrome browser and browse the Base URL*/
        driver.get(baseWebUrl);
        
        /* get the actual value of the title*/
        text=driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText(); 
        System.out.println("Selected Row and Column has text as: "+text); 
        
        /*closing Chrome Browser and System*/
        driver.close();
       
        /* Exiting the System */
        System.exit(0);
    }
}
