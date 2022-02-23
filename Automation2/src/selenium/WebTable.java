package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver=Browser.callBrowser();
               List<WebElement> heading=  driver.findElements(By.xpath("//table//thead//tr//th"));
               int a=heading.size();
               System.out.println(a);
               List<WebElement>rows=driver.findElements(By.xpath("//table//tbody//tr"));
               System.out.println(rows.size());
                                   
               List<WebElement> column= driver.findElements(By.xpath("(//table//tbody//tr//td)[1]"));
               System.out.println(column.size());
//               
//               for (int i=0; i<a; i++) 
//               {
//            	   System.out.println(heading.get(i).getText());
//               }
//               for( int j=0; j<rows.size(); j++) 
//               {
//            	   System.out.println(rows.get(j).getText());
//               }
//               double r=0;
//       	    double m=0;
//       	    for(int i=1;i<=rows.size();i++)
//       	    {
//       	    	String max = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]")).getText();
//       	    	m = Double.parseDouble(max);
//       	    	System.out.println(m);
//       	    	if(m>r)
//       	    	{
//       	    		r=m;
//       	    	}
//       	    }
//       	    System.out.println("Maximum number is: " +r);
               
               
               
          
               
	}

}
