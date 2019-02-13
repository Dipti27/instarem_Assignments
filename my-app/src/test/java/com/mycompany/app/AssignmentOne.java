package com.mycompany.app;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import resources.baseTest;

public class AssignmentOne extends baseTest {

	/**
	 * This method will list all the product image which is displayed on amazon
	 * website.
	 * @throws IOException 
	 */
	@Test
	public void amazonListOfProductImage() throws IOException {
		
		driver = intializedriver();
		
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
