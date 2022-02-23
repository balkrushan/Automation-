package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup1 {
      public static void Alter(WebDriver driver) throws InterruptedException {
    	  WebElement id=driver.findElement(By.xpath("//input[@type='text']"));
  		id.sendKeys("12345");
  		 WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
  		submit.click();
  		Thread.sleep(2000);
  		Alert a=driver.switchTo().alert();
  		String msg =a.getText();
  		System.out.println(msg);
  		a.accept();   //accept alert
  		a.dismiss();//dismiss the alert 
  		
  		 
  		
      }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.callBrowser();
		Popup1.Alter(driver);
		

	}

}
