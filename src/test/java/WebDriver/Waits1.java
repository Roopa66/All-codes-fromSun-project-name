package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits1 {
	@Test
	public void f() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");

		WebDriverWait var = new WebDriverWait(driver, 20);

		var.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_idt87:j_idt89")));
		driver.findElement(By.id("j_idt87:j_idt89")).click();

		var.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:j_idt95")));
		driver.findElement(By.id("j_idt87:j_idt95")).click();

		var.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:j_idt96")));
		driver.findElement(By.id("j_idt87:j_idt96")).click();

		var.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:j_idt98")));
		driver.findElement(By.id("j_idt87:j_idt98")).click();

		var.until(ExpectedConditions.invisibilityOfElementWithText(By.id("j_idt87:j_idt92"), "I am about to hide"));
		driver.findElement(By.id("j_idt87:j_idt92")).click();

	}
}
