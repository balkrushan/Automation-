package selenium;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PomforBuySell {
	@FindBy(xpath="//div//input")private WebElement Search;
	@FindBy(xpath="(//div//input)[17]")private WebElement price;
   public PomforBuySell(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
   
		public void search(WebDriver driver) {
	      	Search.click();
	      	Search.sendKeys("TATACOFFE");
	      	WebElement obj  	=driver.findElement(By.xpath("//LI[@class='search-result-item']"));
	     	obj.click();
	     	
//	     	 WebDriverWait wait=new WebDriverWait(driver, 30);
//		     	wait.until(ExpectedConditions.visibilityOf(intraday));
	     	try{
	     		WebElement intraday    = driver.findElement(By.xpath("//label[@for=\"radio-155\"]"));
		     	intraday.click();	
	     	}
	     	catch(NoSuchElementException e) {
	     		e.printStackTrace();
	     	}
	       
	        driver.findElement(By.xpath("//button[@class=\"submit\"]")).click();                         
   }
		public String PriceNotNull() {
			return price.getText();
		}
		
}
