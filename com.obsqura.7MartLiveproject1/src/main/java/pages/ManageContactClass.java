package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageContactClass 
{
	WebDriver driver;

	public ManageContactClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right'])[5]") WebElement ManageContactField;
	@FindBy(xpath="//i[@class='fas fa-edit']") WebElement EditContactField;
	@FindBy(xpath="//input[@id='phone']") WebElement Phone;
	@FindBy(xpath="//input[@id='email']") WebElement EmailField;
	@FindBy(xpath="//textarea[@name='address']") WebElement AddressField;
	@FindBy(xpath="//button[@type='submit']") WebElement UpdateField;
	@FindBy(xpath="//h1[@class='m-0 text-dark']") WebElement ContactUsField;
	
	
	public void clickManageProduct()
	{
		
			WaitUtility waitutil=new WaitUtility();
			waitutil.waitManageContactText(ManageContactField);
			ManageContactField.click();
		}
	
	public void clickEditContactField() 
	{
		EditContactField.click();
	}
	
	
	public void clickPhoneField(String phone)
	{
		Phone.clear();
		Phone.sendKeys(phone);
	}
	
	
	public void clickEmailField(String emailtext)
	{
		EmailField.clear();
		EmailField.sendKeys(emailtext);
	}
	
	
	
	public void clickAddressField(String addtext)
	{
		AddressField.clear();
		AddressField.sendKeys(addtext);
	}
		
	
	public void clickUpdabtn()
	{
		UpdateField.click();	
	}
	
	 public boolean contactUsTextPageIsDisplayed()
		{
			return ContactUsField.isDisplayed();
		}
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

