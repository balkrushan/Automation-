package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomforProfile {
	@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement profile;
	
	public PomforProfile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ActionOnProfile() {
		profile.click();
	}

}
