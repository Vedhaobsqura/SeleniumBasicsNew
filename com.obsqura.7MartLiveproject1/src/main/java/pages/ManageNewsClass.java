package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsClass 
{

	WebDriver driver;
	
	public ManageNewsClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right'])[9]") WebElement ManageNewsCategory;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement ManageNewsCategoryNewButton;
	@FindBy(xpath="//textarea[@id='news']") WebElement NewsText;
	@FindBy(xpath="//button[@type='submit']") WebElement SavebtnManageNews;

	
	public void clickManageNewsField()
	{
		ManageNewsCategory.click();
	}
	
	public void clickNewButtonInManageNews()
	{
		ManageNewsCategoryNewButton.click();
	}
	
	public void enterNewsText(String newstext)
	{
		NewsText.sendKeys(newstext);
	}
	
	public void clickSaveButtonInManageNewsCategory()
	{
		SavebtnManageNews.click();
	}
}
