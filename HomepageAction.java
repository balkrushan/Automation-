package selenium;

import org.openqa.selenium.WebDriver;

public class HomepageAction {
     public void HomeAction(WebDriver driver) throws InterruptedException {
    	 Pomforhomepage obj1=new Pomforhomepage(driver);
   	  obj1.ActionDashbaord(driver);
   	  obj1.ActionHolding();
   	//  Thread.sleep(2000);
   	  obj1.ActionOrder();
   	  obj1.ActionPosition();
     }
}
