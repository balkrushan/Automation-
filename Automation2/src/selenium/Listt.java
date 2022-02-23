package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listt {
	public static WebDriver Browser1() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		return driver;
		}
	public static void main(String[] args) {
		      WebDriver driver = Listt.Browser1();
		  List<String> address1 = new ArrayList<String>(driver.getWindowHandles());
		  System.out.println(address1.get(0));
		  System.out.println(address1.get(1));
		  System.out.println(address1.get(3));
		  driver.switchTo().window(address1.get(3));
		try { 
	 driver.findElement(By.xpath("//img [@alt='Tech Mahindra']")).click();
		 String d1=driver.getTitle();
		 System.out.println(d1);
		}
	        catch(Exception p) { 
			System.out.println("invalid input");
		}
		    //driver.switchTo().frame(3);
		   // driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("velocity");    
	}	
	}
	
	
		
		

	
	
	
		
	

}
