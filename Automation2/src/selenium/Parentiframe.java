package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Parentiframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.callBrowser();
		WebElement webpage=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));  //click on iframe with in an iframe 
		webpage.click();
		
		Thread.sleep(2000);   //apply weight for page loading 
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));//move selenium focus on frame1 by using  webelemnt
		driver.switchTo().frame(frame1);                                                       //switch to frame first
		
		WebElement frame2 =driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));//frame 2 embeded inside the frame1
		driver.switchTo().frame(frame2);                                                     // so switch to frame 2nd 
		
		WebElement name=driver.findElement(By.xpath("//input[@type='text']"));                 //send value inside name filed of frame 2nd 
		name.sendKeys("krushna");
	//	driver.switchTo().parentFrame();  // return to frame1
		Thread.sleep(2000);
		driver.switchTo().defaultContent();                                                  //focus switch on main /default page from frame 
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		WebElement k=driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(k);
		WebElement k1=driver.findElement(By.xpath("//input[@type='text']"));
		k1.sendKeys("siraskar");
		
		
		

	}

}
