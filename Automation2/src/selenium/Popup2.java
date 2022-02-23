package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Popup2 {
	

	public static void main(String[] args) {
//		WebDriver driver =Browser.callBrowser();
//    	String address = driver.getWindowHandle(); //when we have only one window
//    	   
//		System.out.println(address);
//		 String p= driver.getTitle();
//		System.out.println(p);
//		
//	
//		Set<String> address1 = driver.getWindowHandles(); // multiple windows(https://www.naukri.com/)
//		Iterator<String> a = address1.iterator();
//	String title ="Sopra";
//		
//		
//		while (a.hasNext()) 
//		{
//			driver.switchTo().window(a.next());
//			String currenttitle = driver.getTitle();
//			
//			if (currenttitle.equals(title))
//			{   
//			driver.manage().window().maximize();
//			driver.findElement(By.xpath("//body//a/img")).click();
//			}
//			else{
//				driver.close();
//				
//			}
//			}
			
//				 List<String> address2 = new ArrayList<String>(driver.getWindowHandles());
////				  
////				  System.out.println(address2.get(3));
//				  driver.switchTo().window(address2.get(1));
////				  driver.findElement(By.xpath("//body//a//img")).click();
//				  driver.findElement(By.xpath("(//span[text()='Help'])[1]")).click();
//				  
//			
		
//		
//			driver.switchTo().window(a.next());
//			System.out.println(driver.getTitle());
//			
//			driver.switchTo().window(a.next());
//			System.out.println(driver.getTitle());
//			
//			driver.switchTo().window(a.next());
//			System.out.println(driver.getTitle());
//			
//			driver.switchTo().window(a.next());
//			System.out.println(driver.getTitle());
//	 
	try {
		int a1 = 10;
 int b =17;
     int c = a1/b;
	       
	        System.out.println(c);
	        
		}catch  (ArithmeticException e)  {
			System.out.println("kk");
		}
		finally {
			System.out.println("kkk");
		}
		System.out.println("division");
}     
	

}	


