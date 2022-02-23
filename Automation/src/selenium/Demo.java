package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;


public class Demo {

	public static void main(String[] args)  {
		 System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.navigate().to("");
		 
		 
		   // driver.navigate().to ("https://www.facebook.com/");
		   //  driver.manage().window().maximize();
		 //  driver.manage().window().minimize();
		      
		// driver.navigate().refresh();+
		    //  driver.navigate().back();
		    // driver.navigate().forward();
		  //driver.getCurrentUrl();
		      //driver.getTitle();
		      
		      //String title =   driver.getTitle();
		      //System.out.println(title);
//		  String url= driver.getCurrentUrl();
//		     System.out.println(url);
		     // driver.close();
		      //Dimension d= new Dimension(300,400); // set size of windows
		      // driver.manage().window().setSize(d);
		       
		     //  Point p= new Point(100,500); set size of 
		     // driver.manage().window().setPosition(p);
		     // WebElement email= driver.findElement(By.name("email"));//locatar name  for mail id 
		      //     email.sendKeys("sirsakarb");
		     // WebElement pass = driver.findElement(By.name("pass"));//locator name for pass
		  //   pass.click();
		     // WebElement id = driver.findElement(By.id("email"));// locator id 
		    //             id.submit();
		      
		  //   WebElement email= driver.findElement(By.cssSelector("input[name='email']"));//Css Selector  for this is mail id 
	        //       email.sendKeys("751162");
		    // WebElement pass= driver.findElement(By.cssSelector("input[name='pass']"));// Css Selector this is pass field 
		  // pass.sendKeys("krushna");
		             // WebElement input = driver.findElement(By.tagName("input"));
		             //          input.click();
		      
		      //xpath start 
		      
		  //  WebElement z = driver.findElement(By.xpath("//input[@id=\"email\"]"));  // attribute //tagname[@attribute="attribute value]
		   //   z.sendKeys("kkkk");
		    //  WebElement pas = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));//text//a[text()='Forgotten account?']")
		      //     pas.click();
		     // WebElement b = driver.findElement(By.xpath("(//input[contains(@name,'pass')])[2]"));//contains (//input[contains(@name,'pass')])[2]
		      //b.sendKeys("kk");
		    //  WebElement p = driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]"));
		    //  p.click();
		      
		      // w3s webpage 
		   //   WebElement p1 = driver.findElement(By.xpath("(/html/body/div[5]/div/div/div/a)[1]")); //absolute x path 
		    //  p1.click();
		      
		     // webElemnt l =driver.findElement(By.xpath("//tagname[contains(@attributename,value)] ));
	}
	
	

}
