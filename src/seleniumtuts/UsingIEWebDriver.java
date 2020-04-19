package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UsingIEWebDriver {
	 public static void main(String[] args) {
	        /*declaration and instantiation of objects/variables*/
		    System.setProperty("webdriver.internetexplorer.driver", "C:/selenium_tests/IEDriverServer.exe");
	        WebDriver driverIE = new InternetExplorerDriver();
	        String baseWebUrl = "https://www.facebook.com/";
	        driverIE.get(baseWebUrl);
	        String heading = driverIE.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/h2"))
	        		.getText(); 
	        System.out.println("Heading on the Web Page is: "+ heading);
	        /*closing IE Browser*/
	        driverIE.close();
	        /*Exiting the System*/
	        System.exit(0);
	    }
}
