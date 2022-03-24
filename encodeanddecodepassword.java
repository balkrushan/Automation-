package selenium;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class encodeanddecodepassword {
	public static String decodedpass(String password) {
	byte[] decodedstring= Base64.decodeBase64(password);
	return (new String(decodedstring));
	}
     public static void main(String[] args) {
    	 WebDriver driver =Demo.Browser("https://demo.nopcommerce.com/login");
    	 driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("sirsakarb@gmail.com");
    	 driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(encodeanddecodepassword.decodedpass("dGVzdDEyMw=="));
    	 driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
    WebElement text=	 driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
    System.out.println(text.getText());
    	 
		
		
		
		
		
		
		
		
		
		
		
//    	 String str ="test123";
//    	byte[] encodedstring= Base64.encodeBase64(str.getBytes());
//    	System.out.print("encodedstring:"+new String(encodedstring));
		
	}
}
