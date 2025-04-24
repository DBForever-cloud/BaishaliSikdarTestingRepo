package PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPageObjectClass extends BasePage {
	
	public AccountPageObjectClass(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[@id='content']/h2[text()='My Account']")
	WebElement accountMsg;
	
	@FindBy(xpath="(//a[text()='Logout'])[2]")
	WebElement logoutOption;
	
	public String checkText(){
		return(accountMsg.getText());
	}
	public void clickLogout() {
		logoutOption.click();
	}

}
