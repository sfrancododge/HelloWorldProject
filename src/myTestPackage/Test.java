package myTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// Creating a driver object referencing WebDriver interface
		// Setting webdriver.gecko.driver property
			//System.setProperty("webdriver.gecko.driver", "{path to geckodriver}\\geckodriver.exe");
			// Instantiating driver object and launching browser
		WebDriver driver;
		driver = new FirefoxDriver();
		// Using get() method to open a webpage
		driver.get("https://google.ca");
		WebElement googleSearchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		googleSearchBox.sendKeys("HelloWorld");
		// Closing the browser
		//driver.quit();
	
	}

}





