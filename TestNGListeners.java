package selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestNGListeners extends ScreenShot implements ITestListener{
	  public void onTestStart(ITestResult result) {                             //TestListenerAdapter
		  System.out.println("test start succesfully" +result.getName());
	  }
	  public void onTestFailure(ITestResult result) {
		  System.out.println("test failure"+result.getName());
		  
	  }
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("test skipped"+ "="+result.getName());
	  }
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("test succesful"+result.getName());
		
	  }
}
