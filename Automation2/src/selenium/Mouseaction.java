package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {
	
	public void amazon() throws InterruptedException
	{
		WebDriver driver= Browser.callBrowser();
		WebElement Account= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.moveToElement(Account);
		action.perform();
		WebElement order= driver.findElement(By.xpath("//span[text()='Your Orders']"));
		action.moveToElement(order);
		action.click();
		action.build().perform();
		
	
	}

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=Browser.callBrowser();
		Mouseaction obj=new Mouseaction();
		obj.amazon();

	}

}
