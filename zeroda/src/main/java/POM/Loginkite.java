package POM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Utility.Excelsheet;

public class Loginkite {
	 @FindBy(xpath="//input[@type='text']")private WebElement username;
     @FindBy(xpath="//input[@type='password']")private WebElement password;
     @FindBy(xpath="//button[@type='submit']")private WebElement submit;
     @FindBy(xpath="//input[@id='pin']")private WebElement pin;
     @FindBy(xpath="//button[@type='submit']")private WebElement sub;
    
     
     public Loginkite (WebDriver driver) 
     {
    	 PageFactory.initElements(driver, this);
     }
     public void Senduserid(String id) 
     {
    	 username.sendKeys(id);
     }
     public void Sendpass(String pass) 
     {
    	 password.sendKeys(pass);
     }
     public void Clicksubmit() 
     {
    	 submit.click();
     }
     public void Sendpin(WebDriver driver,String code) throws EncryptedDocumentException, IOException 
     {
    	 FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
    	 wait.withTimeout(Duration.ofMillis(5000));
    	 wait.pollingEvery(Duration.ofMillis(50));
    	 wait.ignoring(Exception.class);
    	 wait.until(ExpectedConditions.visibilityOf(pin));
    	 
    	 pin.sendKeys(code);
     }
     public void ClickConti() 
     {
    	 sub.click();
    	 
     }
     
}


