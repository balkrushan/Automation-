package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	@SuppressWarnings("deprecation")
	public static WebDriver Browser () {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		return driver;
		
	}

}
