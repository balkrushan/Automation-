package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void getScreenshot(WebDriver driver) throws IOException{
		          
				File  Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
				     File destination=new File("C:\\Users\\DELL\\kkk\\failed test case +.jpeg");//C:\\Users\\DELL\\kkk\\failed test case  +.jpeg
				    FileHandler.copy(Source, destination);
				}catch(IOException e) {
					e.printStackTrace();
					
				}

	}

}
//file:///C:/eclips-%20workspace/Automation/test-output/failed.png