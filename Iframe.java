package selenium;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver =Demo.Browser("http://demo.automationtesting.in/Frames.html  ");
		  WebElement a   = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		  driver.switchTo().frame(a);
	  WebElement iframe =driver.findElement(By.xpath("//input[@type=\"text\"]"));
	  iframe.sendKeys("krushn");
	  driver.switchTo().defaultContent();
//	  Thread.sleep(5000);
	  WebElement s= driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		 s.click();
	  WebElement frame1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame1);
	 
     WebElement frame2= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	   driver.switchTo().frame(frame2);
		 WebElement parentframe= driver.findElement(By.xpath("//input[@type='text']"));
	     parentframe.sendKeys("kkk");
	     driver.switchTo().defaultContent();
		  WebElement z =driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[1]"));
          Actions action=new Actions(driver);
                 action.moveToElement(z).build().perform();
                 action.click();
               
                
	     driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
	     JavascriptExecutor j= (JavascriptExecutor)driver;
	    WebElement firstname =   driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
	           j.executeScript("arguments[0].value='balkrushan'",firstname);
	           String h = firstname.getText();
           System.out.println(h);
	     driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Sirsakar");
	   WebElement list=  driver.findElement(By.id("Skills"));
	    Select dropdown=new Select(list);
	    dropdown.selectByVisibleText("Java");
	    WebElement sel=  dropdown.getFirstSelectedOption();
	        System.out.println("option ="+sel.getText()) ;
	        List<WebElement> option= dropdown.getOptions();
	        for(WebElement element:option) {
	        	System.out.println("option=" +element.getText());
	        }
	       WebElement yearbox= driver.findElement(By.id("yearbox"));
	       Select select=new Select(yearbox);
	            select.selectByValue("1967");
	       WebElement month=driver.findElement(By.xpath("(//select[@type=\"text\"])[4]"));
	       Select selmonth=new Select(month);
	       selmonth.selectByVisibleText("September");
	      List<WebElement> ele= selmonth.getOptions();
	      for(WebElement g:ele) {
	    	  System.out.println(g.getText());
	    	  
	      }
	      
	                 
	      
	        driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();    
	        driver.findElement(By.xpath("//input [@id=\"imagesrc\"]")).sendKeys("D:\\kru\\krushna.jpeg");
	        driver.findElement(By.xpath("//input[@type='email']")).click();  ///button[@id='submitbtn']
	     WebElement tex=  driver.findElement(By.xpath("//span[text()='Provide a valid email id for further updates']"));
	     Assert.assertEquals(tex.getText(), "Provide a valid email id for further updates");
	     System.out.println(tex.getText());
	    	
	   
	    
	      
	        
	      //  driver.quit();
}
}
