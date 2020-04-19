package seleniumtuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class UsingSafariWebDriver {
    public static void main(String[] args) {
        /*declaration and instantiation of objects/variables*/
        WebDriver driverSA = new SafariDriver();
        String baseWebUrl = "https://www.facebook.com/";
        driverSA.get(baseWebUrl);
        String heading = driverSA.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/h2"))
        		.getText(); 
        System.out.println("Heading on the Web Page is: "+ heading);
        /*closing Safari Browser*/
        driverSA.close();
        /*Exiting the System*/
        System.exit(0);
    }
}
