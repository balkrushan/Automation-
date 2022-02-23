package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	@FindBy(xpath="//span[text()='Dashboard']") private WebElement Dashboard;
	@FindBy(xpath="//span[text()='Orders']") private WebElement Order;
	@FindBy(xpath="//span[text()='Holdings']") private WebElement Holdings;
	@FindBy(xpath="//span[text()='Positions']" )private WebElement positions;
	@FindBy(xpath="//input[@icon='search']")private WebElement search;
	public Homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void ActioOnDashBoard(WebDriver driver) 
	{
		Dashboard.click();
		WebElement obj =driver.findElement(By.xpath("(//span[text()='View statement'])"));
		obj.click();
		if(obj.isEnabled()) 
		{
		     System.out.println("View statement is enable");	
		}
		

}
	 public void ActionOnHoldings(WebDriver driver) 
	 {
		Holdings.click();
		WebElement drop= driver.findElement(By.xpath("//select[@name ='holdings-selector']"));
		drop.click();
		 Select a = new Select (drop);
		 a.selectByValue("mutualfunds");
}
}