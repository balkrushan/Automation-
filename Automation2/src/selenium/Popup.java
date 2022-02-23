package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Popup {
	public void hiddenpopup(WebDriver driver) throws InterruptedException {
		WebElement signup=driver.findElement(By.xpath("//a[text()='Create a Page']"));
		signup.click();
		Thread.sleep(2000);
		WebElement signup1=driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		signup1.click();
		WebElement firstname =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firstname.sendKeys("krushna");
		WebElement surname  =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		surname.sendKeys("siraskar");
		WebElement dropdown  =driver.findElement(By.xpath("//select [@name='birthday_day']"));
		Select obj=new Select(dropdown);
		  obj.selectByIndex(9);
	  WebElement dropdown1  =driver.findElement(By.xpath("//select[@id='month']"));
			Select obj1=new Select(dropdown1);
		  obj1.selectByVisibleText("Aug");
		 
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.callBrowser();
		Popup obj1=new Popup();
		obj1.hiddenpopup(driver);
          
	}

}
