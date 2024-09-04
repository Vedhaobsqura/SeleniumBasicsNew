package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminClass {


	WebDriver driver;
	
	public AdminClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right'])[1]") WebElement AdminUsers;
	@FindBy(xpath="(//i[@class='fas fa-edit'])[1]") WebElement AdminNewBtn;
	@FindBy(xpath="//input[@id='username']") WebElement AdminUsernameField;
	@FindBy(xpath="//input[@id='password']") WebElement AdminPasswordField;
	@FindBy(xpath="//select[@id='user_type']") WebElement AdminUserType;
	@FindBy(xpath="(//button[@type='submit'])[2]") WebElement AdminSaveBtn;
	
	public void clickAdminUsersField()
	{
		AdminUsers.click();
	}
	
	public void clickNewButtonofAdminUsers()
	{
		AdminNewBtn.click();
	}
	
	public void enterUsernameField(String AdminUsername)
	{
		AdminUsernameField.sendKeys(AdminUsername);	
	}
	
	public void enterPasswordField(String Adminpwd)
	{
		AdminPasswordField.sendKeys(Adminpwd);
	}
	
	public void selectUserTypeDropDown()
	{
		Boolean usertypeisSelected=AdminUserType.isSelected();
		System.out.println("UserType Field is selected by user:"+usertypeisSelected);
		PageUtility pageselect= new PageUtility();
		pageselect.selectIndexForAdmInUsers(AdminUserType);
		Boolean usertypeisSelected1=AdminUserType.isSelected();
		System.out.println("UserType Field is selected by user:"+usertypeisSelected1);
	}
	
	public void clickSaveButton()
	{
		AdminSaveBtn.click();
}
}
