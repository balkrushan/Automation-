package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Findelements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.callBrowser();
		List<WebElement> d=driver.findElements(By.xpath("//a[text()='Learn SQL']"));
         int g= d.size();
         System.out.println(g);
        // d.get(0).click();
         Thread.sleep(5000);
         d.get(1).click();
	}

}
