package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMLoginAction {
	public void test1 () throws InterruptedException {
		
		WebDriver driver=Browser.callBrowser();
		POMLogin obj= new POMLogin(driver);
		   obj.senduserid( "OKP335" );
		    obj.sendpassword("EDC123456");
		    obj.login();
		 //Thread.sleep(2000);         // noneed bcoz implicit weight apply
		    
		    obj.sendpin("654321", driver);
		    obj.conti();
		    
	}
	
//	public void test2() {
//		
//		WebDriver driver=Browser.callBrowser();
//		POM obj= new POM(driver);
//		   obj.senduserid("");
//		    obj.sendpassword("");
//		    obj.login();
//		    obj.sendpin("654321");
//		    obj.conti();
//	}
	
	
	
	public void test4 (WebDriver driver) {
		
	}
	public static void main(String[] args) throws InterruptedException {
		POMLoginAction obj =new POMLoginAction();
		obj.test1();
		//obj.test2();
	}

}
