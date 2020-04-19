package seleniumtuts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author mohit
 *
 */
public class SeleniumJDBCTesting {
	public static final String QUERY = "select *  from SEL_WEB_TESTING;";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String baseWebUrl = "";
		String expectedWebTitleFromDB = "";
		String webTitle = "";

		/* Load MySQL JDBC driver */
		Class.forName("com.mysql.jdbc.Driver");

		/* Create Connection to DB */
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seleniumwebtest", "MySQLDatabase",
				"seleniumtuts");

		/* Create Statement Object. */
		Statement stmt = conn.createStatement();

		/* Execute the SQL Query. Store results in ResultSet. */
		ResultSet rset = stmt.executeQuery(QUERY);

		/* While Loop iterates through all data present in a table. */
		while (rset.next()) {
			baseWebUrl = rset.getString(1);
			expectedWebTitleFromDB = rset.getString(2);
		}
		conn.close();
		System.out.println("baseWebUrl: " + baseWebUrl);
		System.out.println("Expected Web Title from DB: " + expectedWebTitleFromDB);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseWebUrl);
		webTitle = driver.getTitle();
		
		if (expectedWebTitleFromDB.contentEquals(webTitle)) {
			System.out.println("Web title is matching and Test has Passed!");
		} else {
			System.out.println("Web title is not matching and Test has Failed!");
		}
		driver.close();
	}
}
