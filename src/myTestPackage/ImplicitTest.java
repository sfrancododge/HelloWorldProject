package myTestPackage;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitTest {

	public static void main(String[] args) {

		// Creating a driver object referencing WebDriver interface
		WebDriver driver;

		// Setting webdriver.gecko.driver property
		driver = new FirefoxDriver();
		
		

		// 1) Go to the website
		// visiting the desired website
		driver.get("https://www.altexsoft.com/blog/airline-ticketing/");

        //creating the wait condition with 10 seconds of maximum delay
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 

		//explicit wait until the given locator is loaded in the web site
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/nav/div/div[2]/div[1]/div/ul/li[1]/a")));

		//clicking on the link after the wait
		WebElement linkCompany = driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/div[1]/div/ul/li[1]/a"));
		linkCompany.click();

	}

}