package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaExecutor {
	public static void main(String[] args) throws InterruptedException {
		
	
	  WebDriver driver =Demo.Browser("http://demo.automationtesting.in/Frames.html  ");
	  driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
	   JavascriptExecutor z= ( JavascriptExecutor )driver ;
	   
	 
	    WebElement name=driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
	   z.executeScript("arguments[0].value='balkrushan'",name);
	}                     
}



//WebElement register = driver.findElement(By.xpath("//a[text()=\"Register\"]"));
//z.executeScript("arguments[0].click",register);



//WebElement x = driver.findElement(By.xpath("//a[text()=\"Register\"]"));
//z.executeScript("arguments[0].ScrollIntoviews",x);
