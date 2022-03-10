package selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pomforlogin {
	@FindBy(xpath="//h2")private WebElement text;
	@FindBy(xpath="//input[@id='userid']") private WebElement user;
	@FindBy(xpath="//input[@id='password']") private WebElement pass;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement Conti;
	public  Pomforlogin (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String  getheading() {
		String txt=text.getText();
		return txt;
	}
	public String heading() {
		return text.getText();
		
	}
	public void userid() throws EncryptedDocumentException, IOException {
		
		user.sendKeys(excelsheet.ExcelsheetData(1, 0));
		
	}
	public void password() throws EncryptedDocumentException, IOException {
		pass.sendKeys(excelsheet.ExcelsheetData(1, 1));
	}
	public void loginclick() {
		login.click();
    
	}
	
	 public  boolean enabled() {
	    	boolean a=login.isEnabled();
	    	return a;
	    }
	public void pinn(WebDriver driver) throws EncryptedDocumentException, IOException {
		@SuppressWarnings("deprecation")
		WebDriverWait  obj1=new WebDriverWait(driver,30);
		obj1.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(excelsheet.ExcelsheetData(2,0));
		
	}
	public boolean isdisplayed() {
		return pin.isDisplayed();
	}
	public void continues() 
	{
		Conti.click();
		
	}

}
