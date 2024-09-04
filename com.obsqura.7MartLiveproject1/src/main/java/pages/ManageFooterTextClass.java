package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageFooterTextClass 
{

	
		WebDriver driver;
		
		
	public ManageFooterTextClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right'])[10]") WebElement ManageFooterText;
	@FindBy(xpath="//h1[@class='m-0 text-dark']") WebElement FooterTextDashboard;
	@FindBy(xpath="(//i[@class='fas fa-edit'])[2]") WebElement EditFootertext;
	@FindBy(xpath="//textarea[@name='address']") WebElement Address;
	@FindBy(xpath="//input[@id='email']") WebElement Email;
	@FindBy(xpath="//button[@name='Update']") WebElement Updatebtn;
	
	public void clickManageFooterTextField()
	{
		WaitUtility waitutil=new WaitUtility();
		waitutil.waitManageFooterText(ManageFooterText);
		ManageFooterText.click();
	}
	

	public void clickEditFooterText()
	{
		EditFootertext.click();
	}
	
    public void enteraddress(String add)	
    {
    	Address.clear();
    	Address.sendKeys(add);	
    }
	
	
    public void enterEmail(String email)	
    {
    	Email.clear();
    	Email.sendKeys(email);	
    }
	
    public void clickUpdateButton()
    {
    	Updatebtn.click();
    }
	
    public boolean footerTextPageIsDisplayed()
	{
		return FooterTextDashboard.isDisplayed();
	}
	
}
