package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
       
		@SuppressWarnings("deprecation")
		public static WebDriver callBrowser() {
        	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (5).exe");
//        	  	 ChromeOptions options =new ChromeOptions();
//        	  options.addArguments("--disable-notifications");
        	    WebDriver driver =new ChromeDriver();
        	  driver.get("https://demo.guru99.com/test/ajax.html");
        	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS ); //implicit weight
        	    driver.manage().window().maximize();
        	     
				return driver;
				
				
         }
}


//https://kite.zerodha.com/                                  zeroda login 
//https://www.amazon.in/
//http://demo.guru99.com/V1/index.php                        dropdown
//https://www.naukri.com                                     popup 
//http://demo.automationtesting.in/Frames.html               iframe
// https://demoqa.com/frames                                  parent iframe
//https://www.globalsqa.com/demo-site/draganddrop/           drag and drop
//                                                           
//http://demo.guru99.com/test/web-table-element.php#%22);      mouse action 

                   

//https://demoqa.com/text-box                               keyboard action  

//http://demo.guru99.com/test/web-table-element.php#%22);     webtable


