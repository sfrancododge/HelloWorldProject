package myTestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DanExample8 {

	public static void main(String[] args) throws InterruptedException {

		Test test = new Test();
		// Creating a driver object referencing WebDriver interface
		WebDriver driver;

		// Setting webdriver.gecko.driver property
		driver = new FirefoxDriver();
		// Using get() method to open a webpage
		driver.get("https://www.shoptoyota.ca/ontario/en");
		// Closing the browser

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.ca");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().forward();

		// shop_widget

		/*
		 * WebElement shoppingCartBtn = driver.findElement(By.id("shop_widget"));
		 * shoppingCartBtn.click();
		 */

		// driver.quit();
		//// *[@id="APjFqb"]
	}

}
