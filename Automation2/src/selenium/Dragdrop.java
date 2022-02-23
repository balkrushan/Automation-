package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	public void drag(WebDriver driver) 
	{
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class = 'demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		Actions actions =new Actions(driver);
		
		WebElement img = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	    actions.moveToElement(img);
	    
	    WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
	    actions.moveToElement(trash);
	    
	    actions.dragAndDrop(img, trash);
	    actions.perform();
	}

	public static void main(String[] args) {
		WebDriver driver=Browser.callBrowser();
		Dragdrop obj=new Dragdrop();
		    obj.drag(driver);
		
	}

}
