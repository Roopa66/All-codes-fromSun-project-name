package WebDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {
	@Test
	public void upload() throws AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/word_to_pdf");

		driver.findElement(By.id("pickfiles")).click();

		// Robot class created from awt package in java for window handling

		Robot robot = new Robot(); // Window handling class

		String filePath = "C:\\Users\\mgroopa.m\\Downloads\\M.G.Roopa_51916390.doc";// path in system from properties

		StringSelection transferData = new StringSelection(filePath); // convert convert human language to machine
																		// language

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(transferData, null);// System Clipbord

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		 driver.findElement(By.id("processTask")).click();

	}
}
