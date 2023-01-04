package WebDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class Waits {
	@Test
	public void f() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.leafground.com/waits.xhtml");

		// Fluent Wait

		FluentWait fluentWait = new FluentWait(driver);

		fluentWait.withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		// Explicit Wait

		WebDriverWait var = new WebDriverWait(driver, 20);

		var.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("email")));

		driver.findElement(By.id("email")).sendKeys("yrupa1839@gmail.com");

		var.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		var.until(ExpectedConditions.alertIsPresent());
		var.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("email")));
		var.until(ExpectedConditions.elementToBeSelected(By.id("email")));

	}
}
