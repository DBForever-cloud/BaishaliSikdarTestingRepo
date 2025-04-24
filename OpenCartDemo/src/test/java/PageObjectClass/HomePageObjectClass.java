package PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjectClass extends BasePage{
	
	public HomePageObjectClass(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//li[@class='dropdown'])[1]")
	WebElement myAccountDropDown;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li/a[text()='Register']")
	WebElement registerOption;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement loginOption;
	
	public void clickDropDown() {
		myAccountDropDown.click();
	}
	
	public void clickRegistrationOption() {
		registerOption.click();
	}
	
	public void clickLoginOption() {
		loginOption.click();
	}
	
	
}
