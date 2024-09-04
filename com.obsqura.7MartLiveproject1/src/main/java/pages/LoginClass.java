package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {

	WebDriver driver;

	public LoginClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement Username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Siginbtn;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement Dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement AlertText;
	@FindBy(xpath = "//button[@class='close']")
	WebElement Close;
	

	public void enterusername(String username) {
		Username.sendKeys(username);
	}

	public void enterpwd(String pwd) {
		Password.sendKeys(pwd);
	}

	public void clicksigninbtn() {
		Siginbtn.click();
	}

	public boolean isDashboardDisplayed() {
		return Dashboard.isDisplayed();
	}
	
	 
	  public boolean isAlertMessageDisplayed()
	  { return AlertText.isDisplayed(); 
	  }
	 

	public void closeAlertToast() {
		Close.click();
	}

}
