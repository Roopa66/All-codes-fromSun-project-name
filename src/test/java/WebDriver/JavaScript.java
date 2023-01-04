package WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumSofware02112021\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// To create a alert

		js.executeScript("alert('Do you want to proceed with login')");

		Thread.sleep(3000);

		// Handle the alert

		Alert alert = driver.switchTo().alert();

		String alertmessage = driver.switchTo().alert().getText();

		System.out.println(alertmessage);

		alert.accept();

		// To print the URL

		String urlname = js.executeScript("return document.URL").toString();

		System.out.println(urlname);

//To print title

		String title = js.executeScript("return document.title").toString();

		System.out.println(title);

		js.executeScript("document.getElementById('txtUsername').value='Admin'");

		// Refresh page

		js.executeScript("history.go(0)");

		// To find the element and enter the value

		js.executeScript("document.getElementById('txtUsername').value='Admin'");

		// To get the value

		WebElement property = (WebElement) js.executeScript("return document.getElementById('txtUsername')");

		System.out.println(property.getAttribute("value"));

		js.executeScript("document.getElementById('txtPassword').value='admin123'");

		js.executeScript("document.getElementById('btnLogin').click()");

		// Scroll to the end of page

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);

		// js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		// Thread.sleep(3000);

//To get the html value

		String sText = js.executeScript("return document.getElementById('welcome').innerHTML").toString();

		System.out.println(sText);

		js.executeScript("document.getElementById('menu_leave_viewLeaveModule').click()");

		Thread.sleep(3000);

		// scroll by coordinates

		js.executeScript("window.scrollBy(0,200)");

		Thread.sleep(3000);

		// scroll to a particular element

		js.executeScript("document.getElementById('btnSave').scrollIntoView()");

		// Get the html value of table

		String tabledata = js.executeScript("return document.getElementById('resultTable').innerHTML").toString();

		System.out.println(tabledata);

		Thread.sleep(3000);

		// Navigate backward

		js.executeScript("window.history.back()");

		Thread.sleep(3000);

		// navigate forward

		js.executeScript("window.history.forward()");
	}
}
