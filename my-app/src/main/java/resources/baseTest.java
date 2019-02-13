package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {

	public WebDriver driver;

	public WebDriver intializedriver() throws IOException {
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream(
				"C:\\Users\\BABHAL\\my-app\\src\\main\\java\\TestEnvironment.properties");
		properties.load(fileInputStream);
		String browserName = properties.getProperty("Browser");
		if (browserName.equals("chrome")) {
			System.getProperty("webdriver.chrome.driver",
					"C:\\Users\\BABHAL\\my-app\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}