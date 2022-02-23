package selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMLogin {
	@FindBy(xpath ="//input[@type='text']") private WebElement user;
	@FindBy(xpath = "//input[@type='password']")private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continues;
	public POMLogin( WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	public void senduserid(String username ) 
	{
		
		user.sendKeys(username );
		
	}
	public void sendpassword(String passw )
	{
		
		pass.sendKeys(passw);
	}
	public void login() 
	{
		login.click();
		}
	public void sendpin(String pi,WebDriver driver) {
		WebDriverWait wait =new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(pin));
	 	
				
		pin.sendKeys(pi);
		
	}
	public void conti() {
		continues.click();
	}
	
	
}


