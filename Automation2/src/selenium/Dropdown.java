package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		 
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	
	         //WebDriver driver=Browser.callBrowser();//class name . method name ();
	           WebDriver driver1 =new ChromeDriver();
		     driver1.get("https://www.amazon.in/gp/sva/dashboard?ref_=nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f");
		   WebElement apay=driver1.findElement(By.xpath("//a[text()='Amazon Pay']"));
		   String p= apay.getText();
	   System.out.println(p);
//            WebElement Apay=driver.findElement(By.xpath("//a[contains(@data-csa-c-id,'brbcvx-nms17f-r8ybb8-ncsmva')]"));
//		     String s= Apay.getText();
//		     System.out.println(s);
//		     driver.findElement(By.linkText("Forgotten password?")); 
//		     driver.findElement(By.partialLinkText("Forgotten")); 
	         
// dropdown 	          
//            WebElement drop1 =driver.findElement(By.xpath("//select[@id='animals']"));
//            Select value = new Select (drop1);
//	        value.selectByVisibleText("Baby Cat");  //by test 
//	
//	        
//	        WebElement drop =driver.findElement(By.xpath("//select[@id='first']"));	       
//            Select value1 = new Select (drop);
//	         value1.selectByIndex(2) ;     //by index
//	        
//            WebElement drop2 =driver.findElement(By.xpath("//select[@id='first']"));	        
//            Select value2 = new Select (drop2);
//	        value2.selectByValue("apple");  // by value 
	            
//	       
//	          WebElement drop3 =driver.findElement(By.xpath("//select[@id='first']"));	       
//            Select value3 = new Select (drop3);
//           
//            value3.selectByVisibleText("Yahoo");
//            Thread.sleep(5000);
//            value3.selectByIndex(2) ;
//            Thread.sleep(5000);
//            value3.selectByValue("Microsoft");// value selected from html page 
//            
//            scenerio :1
	           // driver.get ("http://demo.guru99.com/test/radio.html");
//	         WebElement T =driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
//	         Boolean D= T.isDisplayed();
//	         System.out.println(D);
//	         String p = T.getText();
//	         System.out.println(p);
//	         
	         //scenerio :2
//	        driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
//	        WebElement T1 =driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
//	        Boolean p1= T1.isDisplayed();
//	        System.out.println(p1);
//	        String s1 = T1.getText();
//	        System.out.println(s1);
	        
	        //scenerio :3 
//	     WebElement tick =  driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//	    tick.click();
//	     Boolean w= tick.isSelected();
//     System.out.println("check box get selected then value be:" +w);
//	     Boolean v= tick.isEnabled();
//	     System.out.println(v);
	            
	            //scenerio :4
//	     WebElement ticked = driver .findElement(By.xpath("(//input)[1]"));
//	     Boolean b = ticked.isSelected();
//	     System.out.println("not selected so answaer is:"+b);
//	     Boolean x = ticked.isEnabled();
//	     System.out.println(x);
	     
	}

}
