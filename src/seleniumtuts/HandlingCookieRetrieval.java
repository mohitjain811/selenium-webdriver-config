package seleniumtuts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author mohit
 *
 */
public class HandlingCookieRetrieval {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try {
			File file = new File("SeleniumCookie.data");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			String strline;
			while ((strline = bufferReader.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(strline, ";");
				while (token.hasMoreTokens()) {
					String name = token.nextToken();
					String value = token.nextToken();
					String domain = token.nextToken();
					String path = token.nextToken();
					Date expiry = null;
					String val;
					if (!(val = token.nextToken()).equals("null")) {
						expiry = new Date(val);
					}
					Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
					Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);

					/* To add the stored cookie to our current session */
					driver.manage().addCookie(ck);
				}
			}
			bufferReader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		driver.get("https://expirebox.com/");
		driver.findElement(By.xpath("//html/body/div/div/div/div/div/button")).click();
	}
}
