package seleniumtuts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 /**
  * 
  * @author mohit
  *
  */
public class SeleniumTestClass {
	
    public static void main(String[] args) {
        
    	/*declaration and instantiation of objects/variables*/
        WebDriver driver = new ChromeDriver();
        
        String baseWebUrl = "https://www.google.com/";
        String expectedWebTitle = "Google";
        String actualWebTitle = "";
        
        /*Launch Chrome browser and browse the Base URL*/
        driver.get(baseWebUrl);
        
        /* Get the actual value of the title*/
        actualWebTitle = driver.getTitle();
        
        /* Compare the Web actual title against the expected title*/
        if (actualWebTitle.contentEquals(expectedWebTitle)){
            System.out.println("Test has Passed!");
        } else {
            System.out.println("Test has Failed!");
        }
        
        /*Closing Chrome Browser*/
        driver.close();
        
        /*Exiting the System*/
        System.exit(0);
    }
}