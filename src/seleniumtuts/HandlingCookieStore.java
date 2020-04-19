package seleniumtuts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author mohit
 *
 */
public class HandlingCookieStore {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://expirebox.com/");
		driver.findElement(By.xpath("//html/body/div/div/div/div/div/button")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("mohit");
		driver.findElement(By.name("password")).sendKeys("pRw1+Q2kti");

		/* File created  to store Cookie Information */
		File file = new File("SeleniumCookie.data");
		try { 
			/* Delete if there is any old file exists */
			file.delete();
			/* Create a new file */
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferwrite = new BufferedWriter(fileWriter);
			for (Cookie cookie : driver.manage().getCookies()) {
				String writeup = cookie.getName() + ";" + cookie.getValue() + ";" 
			            + cookie.getDomain() + ";" + cookie.getPath()
						+ "" + ";" + cookie.getExpiry() + ";" + cookie.isSecure();
				bufferwrite.write(writeup);
				bufferwrite.newLine();
				
				System.out.println(writeup);	
			}
			/* flush and close file writer */
			bufferwrite.flush();
			bufferwrite.close();
			fileWriter.close();
			
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}