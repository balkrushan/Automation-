package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {

	
	
		public void pageDetails(WebDriver driver)
		{
			WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
			firstname.sendKeys("VelocityPune");
			Actions actions = new Actions(driver);
			
			//select the firstnamefield data
			///press and hold the key
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("a");
			actions.keyUp(Keys.CONTROL);    // release the key
			
			//copy the selected data
				actions.keyDown(Keys.CONTROL);
					actions.sendKeys("c");
					actions.keyUp(Keys.CONTROL);
					
					//move to next field 
					actions.sendKeys(Keys.TAB);   // press and release the key
					
					//paste the selected data
					actions.keyDown(Keys.CONTROL);
					actions.sendKeys("v");
				actions.keyUp(Keys.CONTROL);
					
					actions.build().perform();
					
				}
				
				public static void main(String[] args) {
					WebDriver driver=Browser.callBrowser();
					Keyboardaction obj = new Keyboardaction();
					obj.pageDetails(driver);
					
				}
}
