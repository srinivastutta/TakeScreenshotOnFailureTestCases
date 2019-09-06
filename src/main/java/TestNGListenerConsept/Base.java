package TestNGListenerConsept;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	
	public static void Initilization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Setup Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com");
			
	}

	public static void TakeScreenshot(String TestMethodName) throws IOException {

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("E:\\Selenium\\Workspace\\TakeScreenshotOnFailureTestCases\\"
				+"Screenshots\\"+TestMethodName+"_"+".jpg"));
	
	}



}
