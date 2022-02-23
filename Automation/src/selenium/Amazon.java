package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (5)\\chromdriver.exe");
             WebDriver driver=new ChromeDriver();
             driver.get("https://www.amazon.in/");
          //   driver.navigate().to("");

	}

}
