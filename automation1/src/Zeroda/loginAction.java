package Zeroda;

import org.openqa.selenium.WebDriver;

import zmq.ZObject;

public class loginAction {
	public void loginzeroda(WebDriver driver) throws InterruptedException 
	{
		POMLogin obj =new POMLogin(driver);
		obj.Senduserid("OKP335");
		obj.Sendpass("EDC123456");
		obj.Clicksubmit();
		
		obj.Sendpin(driver,"654321");
		obj.ClickConti();
	}
	
	public void homeobject(WebDriver driver)
	{
		pomHome obj1 =new pomHome(driver);
		obj1.ActioOnDashBoard(driver);
		obj1.ActionOnOrder(driver);
		obj1.ActionOnHoldings(driver);
		obj1.ActionOnPositions(driver);
		obj1.search(driver, "TCS");
	}
	

	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriver driver = Browser.Callbrowser();
		  
		loginAction obj2 =new loginAction();
		
			obj2.loginzeroda(driver);
			//obj2.homeobject(driver);
		
						}
	

}
