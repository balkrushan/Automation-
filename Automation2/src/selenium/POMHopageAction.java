package selenium;

import org.openqa.selenium.WebDriver;

public class POMHopageAction {
	
	
	
	
	
	
	
	public void homepage(WebDriver driver) throws InterruptedException
{
		POMLogin obj =new POMLogin(driver);
		 obj.senduserid( "OKP335" );
		    obj.sendpassword("EDC123456");
		    obj.login();
		    Thread.sleep(5000);
		    obj.sendpin("654321", driver);
		    obj.conti();
		    
}
	
	
 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.callBrowser();
		POMHopageAction obj8= new POMHopageAction();
		obj8.homepage(driver);
				 
		
		POMforhomepage obj1 = new POMforhomepage(driver);
		 
		    Thread.sleep(2000);
		   
		    Thread.sleep(5000);
		    obj1.ActioOnDashBoard(driver);
		    Thread.sleep(2000);
		    obj1.ActionOnOrder(driver);
		    obj1.ActionOnHoldings(driver);
		    obj1.ActionOnPositions(driver);
		    
		}
	
}
