package selenium;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(selenium.TestNGListeners.class)
public class TestNG {
	
	
	//Logger log = Logger.getLogger(TestNG .class.getName());
	
	WebDriver driver;
	
	
@AfterMethod
	public void setup(ITestResult result) throws IOException {
	if(result.getStatus()==ITestResult.FAILURE) {
		ScreenShot.getScreenshot(driver);	
	}
	
	}
//@Test
//public void FailedTestcase() {
//	driver=Demo.Browser();
//	String a = driver.findElement(By.xpath("//h2")).getText();
//	Assert.assertEquals(a, "\"Login to\"");
//}
//@Test(enabled=false)
//	   public void test() throws InterruptedException {
//	     System.out.println("test");
//	}
//	
@Test(priority=-2)
	    public void Login() throws InterruptedException, EncryptedDocumentException, IOException {
		 driver=Demo.Browser();     
		 LoginAction obj=new LoginAction ();
	     obj.kitelogin(driver);
	   // log.info("login Done");
	}

@Test(dependsOnMethods="Login",priority=-1)
	   public void Homepage() throws InterruptedException {
	    	 HomepageAction home =new HomepageAction ();
	    	    home.HomeAction(driver);	
	 }

	 
	 
@Test(dependsOnMethods="Login")

	    public void Buyandsells() {
	        PomforBuySell price=new PomforBuySell(driver);
	    	price.search(driver);
	    	Assert.assertNotNull(price.PriceNotNull());
	    	
	    
	    }
@Test(dependsOnMethods="Login",priority=1)
       public void profile() {
	        PomforProfile obj =new PomforProfile(driver);
	        obj.ActionOnProfile();
}
    
//@BeforeMethod
//
//       public void BM() {
//	        System.out.println("Beforemethod");	 
//   }
//    
//    
//    
}
