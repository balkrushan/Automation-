package Zeroda;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

	//@SuppressWarnings("deprecation")
	public  static WebDriver  Callbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions Options =new ChromeOptions();
		Options.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(Options);
   	     driver.get("https://kite.zerodha.com/ ");
   	 // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   	     return driver;
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	  
   	                                                                                                                                  
   	                 
   	   
   	                 
   	        
   	        
   	  
   	  
   	                
   	         
   	               
   	  
   	  

	}

}
