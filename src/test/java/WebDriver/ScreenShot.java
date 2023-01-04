package WebDriver;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	@Test
	public void f() throws IOException, AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/");
		
		TakesScreenshot TS = (TakesScreenshot) driver;
		File source = TS.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\mgroopa.m\\Desktop\\ScreenShots\\sc1.png");
		
		FileHandler.copy(source, destination);
		
		Robot robot = new Robot();
		
		Dimension dim =Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect =new Rectangle(dim);
		
		BufferedImage source1 =robot.createScreenCapture(rect);
		
		File destination1 = new File("C:\\Users\\mgroopa.m\\Desktop\\ScreenShots\\sc1.png");
		
		ImageIO.write(source1, "png", destination1);
		
		
	}
}
