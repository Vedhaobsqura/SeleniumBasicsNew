package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryClass 
{
WebDriver driver;
	
	public CategoryClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right'])[3]") WebElement CatgeoryField;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement SearchButton;
	@FindBy(xpath="//input[@type='text']") WebElement SearchText;
	@FindBy(xpath="//button[@name='Search']") WebElement SearchButtonInSearchList;
	
	public void clickCategoryField()
	{
		CatgeoryField.click();
	}
	
	public void clickSearchButton()
	{
		SearchButton.click();	
	}
	
	
	public void enterSearchField(String text)
	{
		SearchText.sendKeys(text);
	}
	
	
	public void clickSearchbuttonInSearchList()
	{
		SearchButtonInSearchList.click();
	}
	
		
	}
	
	
	
	
	
	

