package learningPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentOne {

	/**
	 * This method will list all the product image which is displayed on amazon
	 * website.
	 */
	@Test
	public void amazonListOfProductImage() {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//url of the website
		driver.get("https://www.amazon.in/");
		
		//storing the amazon body content in webelement
		WebElement ImageContent = driver.findElement(By
				.cssSelector("[id^='gw-content-grid']"));

		//storing the list of links 
		List<WebElement> imageListing = ImageContent.findElements(By
				.tagName("a"));

		for (int i = 0; i < imageListing.size(); i++) {
			System.out.println(imageListing.get(i).getAttribute("href"));
		}
		driver.close();
	}

}
