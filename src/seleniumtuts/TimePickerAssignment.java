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
public class TimePickerAssignment {
	public static void main(String args[]) throws Exception {
		String dateAndTime = "24/08/2016 4:35 AM";
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
		WebDriver driverGC = new ChromeDriver();
		driverGC.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");

		/* button to open calendar */
		WebElement webElement = driverGC.findElement(By.xpath("//span[@aria-controls='datetimepicker_dateview']"));
		webElement.click();

		/* date and time slit into an array */
		String datetime[] = (dateAndTime.split(" ")[0]).split("/");
		Thread.sleep(1000);

		List<WebElement> listAllMonth = driverGC.findElements(By.xpath(
				"//div[@id='datetimepicker_dateview']" + "//table//tbody//td[not(contains(@class,'k-other-month'))]"));

		listAllMonth.get(Integer.parseInt(datetime[1]) - 1).click();
		Thread.sleep(1000);

		List<WebElement> listAllDate = driverGC.findElements(By.xpath(
				"//div[@id='datetimepicker_dateview']" + "//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		listAllDate.get(Integer.parseInt(datetime[0]) - 1).click();
		// click on the time picker button
		WebElement selectTimeElement = driverGC
				.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));
		selectTimeElement.click();
		// get list of times
		List<WebElement> timeElement = driverGC.findElements(
				By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));
		dateAndTime = dateAndTime.split(" ")[1] + " " + dateAndTime.split(" ")[2];
		for (WebElement element : timeElement) {
			if (webElement.getText().equalsIgnoreCase(dateAndTime)) {
				element.click();
			}
		}
	}
}