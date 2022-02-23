package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Subclass {
public static void Screenshot(WebDriver driver, String a) throws IOException {
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest=new File ("C:\\Users\\DELL\\kkk\\3rd + a+.jpeg" );
	 FileHandler.copy(source, dest);
	
}
	public static void main(String[] args) throws IOException {
		WebDriver driver=Browser.callBrowser();
		//Subclass.Screenshot(driver,"kk");

	    driver.switchTo().frame(3);
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("veloc");
		
		

	}

}
