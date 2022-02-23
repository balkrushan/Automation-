package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {

	public static void main(String[] args) {
		
		 // textby
		
		WebDriver driver=Browser.callBrowser();
		driver.switchTo().frame("singleframe");  //by text
		WebElement input =driver.findElement(By.xpath("//input[@type='text']"));    
		input.sendKeys("v");
		
		//by webelement
		
		WebDriver driver1=Browser.callBrowser();
	WebElement d =driver1.findElement(By.xpath("//iframe[@id='singleframe']"));    
		driver1.switchTo().frame(d);  
		WebElement input1 =driver1.findElement(By.xpath("//input[@type='text']"));    
		input1.sendKeys("velocity");
		
		//By Index : link:-f
		
	driver1.switchTo().frame(2);    //2nd iframe madhe aaaplya text index aahe 
	WebElement S2 = driver1.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(S2.getText());
		
		

	}

}
