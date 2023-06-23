package myTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DanExample7 {

	public void wait(int intervalInMs) {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Test test = new Test();
		// Creating a driver object referencing WebDriver interface
		WebDriver driver;

		// Setting webdriver.gecko.driver property
		driver = new FirefoxDriver();
		// Using get() method to open a webpage
		driver.get("https://www.shoptoyota.ca/ontario/en");
		// Closing the browser

		test.wait(10000);
		driver.get("https://www.google.ca");

		test.wait(10000);
		driver.navigate().back();

		test.wait(10000);
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
