package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POJO.Launchbrowser;
import POM.Homepage;
import POM.Loginkite;
import Utility.Excelsheet;

public class Validatelogin {
       WebDriver driver ; 
	  @Test
	  public void login() throws EncryptedDocumentException, IOException 
	  {
		  driver=Launchbrowser.projectlaunch();
		  Loginkite obj =new Loginkite(driver);
		  obj.Senduserid("OKP335");
			obj.Sendpass("EDC123456");
			obj.Clicksubmit();
			
			obj.Sendpin(driver,"654321");
			obj.ClickConti();
			
			
		  
	  }

	  @Test(dependsOnMethods="login")
	  public void home() 
	  {
		  Homepage obj =new Homepage(driver);
		  obj.ActioOnDashBoard(driver);
		  obj.ActionOnHoldings(driver);
	  }
	 
}



