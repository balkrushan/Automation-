package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pomforhomepage {
          @FindBy(xpath="//span[text()=\"Dashboard\"]")private WebElement dashboard;
          @FindBy(xpath="(//span[text()='Orders'])[1]") private WebElement Order;
      	@FindBy(xpath="(//span[text()=\"Holdings\"])[1]") private WebElement Holdings;
      	@FindBy(xpath="(//span[text()='Positions'])[1]" )private WebElement positions;
    
      	
      	
      	public Pomforhomepage(WebDriver driver){
      		PageFactory.initElements(driver, this);
      	}
      	public void ActionDashbaord(WebDriver driver) throws InterruptedException {
      		dashboard.click();
      		   WebElement name=   driver.findElement(By.xpath("//span[text()=\"Rahul\"]"));
      		         String a= name.getText();
      		         String b="Rahul";
      		     if( b.equals(a)) {
      		    	 System.out.print("correct spleing");
      		     }
      		         Thread.sleep(5000);
      		       WebElement obj= driver.findElement(By.xpath("(//span[text()=\"View statement\"])[1]"));
      		     obj.isEnabled();
      		       if(obj.isEnabled()) {
      		    	   System.out.println("View statement is enable");
      		       }
      		       driver.findElement(By.xpath("//img[@alt=\"Kite logo\"]")).click();
  
      	}
      	public void ActionOrder() {
      		Order.click();
      		
      	}
      	public void ActionHolding() {
      		Holdings.click();
      	}
      	public void ActionPosition() {
      		positions.click();
      	}
      
}  
