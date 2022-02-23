package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webdriver {
	
	public  void validation(WebDriver driver) throws IOException {
	
	WebElement key =driver.findElement(By.xpath("//body[@class='fbIndex UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_GB cores-gte4 _19_u hasAXNavMenubar']"));
     key.isDisplayed();
     if (key.isDisplayed()!=false) 
     {
    	 Subclass.Screenshot(driver,"kk");
     }
    
}
	public static void main(String[] args) throws IOException  {
		WebDriver driver=Browser.callBrowser();
		Webdriver obj= 	new Webdriver();
		obj.validation(driver);
		
		
		
	}
}
