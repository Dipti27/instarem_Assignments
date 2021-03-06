package com.mycompany.app;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import resources.baseTest;

public class AssignmentTwo extends baseTest {

	/**
	 * This will list all the malaysia's bank names and swift codes
	 * @throws IOException  Input output exception
	 */
	@Test
	public void swiftMalyasiaBankNamesAndCodes() throws IOException {
		
		//invoking browser
		driver = intializedriver();
		
		// URL of the website
		driver.get("https://www.theswiftcodes.com/malaysia/");

		// storing the bank grid in webelement
		WebElement listBanks = driver.findElement(By.cssSelector(".swift"));

		// taking the count of 2nd column for Bank names
		int count = listBanks.findElements(
				By.cssSelector("[class='swift'] td:nth-child(2)")).size();
		System.out.println("Malyasia's Bank Names  " + "Bank Swift Code");

		// storing the bank names in list
		List<WebElement> bankNames = listBanks.findElements(By
				.cssSelector("[class='swift'] td:nth-child(2)"));

		// storing the swift codes of respective banks in list
		List<WebElement> swiftCodes = listBanks.findElements(By
				.cssSelector("[class='swift'] td:nth-child(5)"));
		for (int i = 0; i < count; i++) {

			System.out.println(bankNames.get(i).getText() + " || "
					+ swiftCodes.get(i).getText());
		}
		driver.close();
	}
}
