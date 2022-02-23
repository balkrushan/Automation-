package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;                   //http://demo.guru99.com/test/ajax.html
import org.openqa.selenium.WebElement;

public class Scrollup {
	public void Scrollupdown(WebDriver driver ) {
		
		//Scroll by using argument
		//WebElement s= driver.findElement(By.xpath("(//a[text()='Learn JavaScript'])[2]"));
		
	//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",s);
		
		  
		JavascriptExecutor e =((JavascriptExecutor)driver);
		               e.executeScript("window.scrollBy(500,900)");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Browser.callBrowser();
		Scrollup obj=new Scrollup();
		Thread.sleep(5000);
		obj.Scrollupdown(driver);
		

	}

}
