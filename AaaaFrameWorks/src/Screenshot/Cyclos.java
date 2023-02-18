package Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cyclos { // gmail.com

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JESUS\\Downloads\\chromedriver.exe");

		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sandeeppokala35@gmail.com");

		// driver.findElement(By.xpath("//span[jsname='V67aGc']")).click();
		screenShots(driver);

	}

	public static void screenShots(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE); // converting the file
		// path define
		String path = "C:\\Screenshotpath\\Image" + "System.currentTimeMillis()+.png";

		File convt = new File(path); // File convertion covert
		FileUtils.copyFile(src, convt);
	}

}
