package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class brokenlink {

	public static void main(String[] args) throws IOException {
	                 WebDriver driver=  Demo.Browser(); //"https://www.hyrtutorials.com/"
	                 List<WebElement> cells= driver.findElements(By.tagName("link"));
	                         int links=  cells.size();
	                         System.out.println(links);
	                         for(int i=0; i<=links; i++) {
	                        	 //by using herf attribute we can URL of requird link
	                        	  
	                        	WebElement Element = cells.get(i);
	                        	     String linkAddress= Element.getAttribute("href");
	                        	       URL url=new URL(linkAddress);
	                        	      URLConnection urlconnection = url.openConnection();  
	                        	       HttpURLConnection httpURLConnection =(HttpURLConnection) urlconnection;
	                        	       httpURLConnection.setConnectTimeout(5000);
	                        	       httpURLConnection.connect();
	                        	       int ResponseCode=httpURLConnection.getResponseCode();
	                        	       if(ResponseCode==200) {
	                        	    	   System.out.println(linkAddress +" - "+ ResponseCode + (" - ")+ "ok");
	                        	    	  
	                        	    	   
	                        	       }
	                         }
	}
}

	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	                        	    	   
	    	 