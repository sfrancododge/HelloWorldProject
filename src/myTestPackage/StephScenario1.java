package myTestPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StephScenario1 {

	public static void main(String[] args) {

		// Creating a driver object referencing WebDriver interface
		WebDriver driver;

		// Setting webdriver.gecko.driver property
		driver = new FirefoxDriver();

		// 1) Go to the website
		// visiting the desired website
		driver.get("https://www.facebook.com/");

		// waiting till the web page is 100% loaded
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 2) write user name

		// identify the user name text box
		WebElement txtBxUserName = driver.findElement(By.id("user-name"));

		// type the user name
		txtBxUserName.sendKeys("standard_user");

		// 3) write Password

		// identify the password text box
		WebElement txtBxPassword = driver.findElement(By.id("password"));

		// type the password
		txtBxPassword.sendKeys("secret_sauce");

		// 4) Click Login Button
		// identify the login btn
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		btnLogin.click();

	}

}
