package selenium;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginAction {
	 
      public void kitelogin(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException {
    	 
    	  
    	  Pomforlogin obj =new Pomforlogin(driver);
    	  Assert.assertEquals(obj.getheading(),"Login to Kite");
    	  SoftAssert asert =new SoftAssert();
    	  asert.assertEquals(obj.heading(), "Login to");
    	  
    	  
    	  obj.userid();
    	  obj.password();
    	  Assert.assertTrue(obj.enabled());
    	  obj.loginclick();
    	  
    	 // Thread.sleep(3000);
    	  Assert.assertTrue(obj.isdisplayed());
    	  obj.pinn(driver);
    	  obj.continues();
    	 // asert.assertAll();              //record failure event in soft assert
    	  
    	  
//    	  Pomforhomepage obj1=new Pomforhomepage(driver);
//    	  obj1.ActionDashbaord(driver);
//    	  obj1.ActionHolding();
//    	  Thread.sleep(2000);
//    	  obj1.ActionOrder();
//    	  obj1.ActionPosition();
    	  
    	  
    	  
      }
//	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
//		
//		WebDriver driver=Demo.Browser();
//		LoginAction obj=new LoginAction();
//        obj.kitelogin(driver);
//        
//       
//        
//        
//	} 

}
