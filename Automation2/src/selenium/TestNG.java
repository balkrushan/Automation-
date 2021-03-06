package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG 
{
	           WebDriver driver; //initiate globly
	 
	@Test(priority=-1,invocationCount=2)
	public void test1()
	{
		System.out.println("test on  login");
	}
	
	@Test(priority=1,timeOut=3000)
	public void test2() throws InterruptedException
	{
		
		POMLogin obj= new POMLogin(driver);
		   obj.senduserid( "OKP335" );
		    obj.sendpassword("EDC123456");
		    obj.login();
		    Thread.sleep(2000);
		    obj.sendpin("654321", driver);
		    obj.conti();
	}
//	@Test(dependsOnMethods="test2")                     //Dependsonmethods="test2"
//	public void test3() throws InterruptedException {
//		POMforhomepage obj1 = new POMforhomepage(driver);
//        obj1.ActioOnDashBoard(driver);
//          Thread.sleep(2000);
//		    obj1.ActionOnOrder(driver);
//		    obj1.ActionOnHoldings(driver);
//		    obj1.ActionOnPositions(driver);
//	}
	
	@BeforeMethod
	public void BM ()
	{
		System.out.println("before method");
		 driver= Browser.callBrowser();
	}
	@AfterMethod
	public void AF() 
	{
		System.out.println("after method ");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("before Class ");
	}
	
	@AfterClass
	public void AC()
	{
		System.out.println("after class ");
	}
	
	@BeforeTest
	public void BT() 
	{
		System.out.println("before test ");
	}
	@AfterTest
	public void AT() 
	{
		System.out.println("after test");
	}

}
