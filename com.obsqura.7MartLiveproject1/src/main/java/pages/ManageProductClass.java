package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitUtility;



public class ManageProductClass 

{
	
WebDriver driver;

public ManageProductClass(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//p[text()='ManageProduct'])[2]") WebElement ManageProduct;
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]") WebElement MilkProduct;
	@FindBy(className="btn btn-rounded btn-primary") WebElement Searchbtn;
	@FindBy(xpath="(//input[@type='text'])[1]") WebElement TitleField;
	@FindBy(name="cd") WebElement ProductCode;
	@FindBy(xpath="//select[@id='cat_id']") WebElement Category;
	@FindBy(xpath="//select[@id='sb']") WebElement SubCategory;
	@FindBy(xpath="(//button[@type='submit'])[1]") WebElement SearchListProduct;
	
	
	public void clickManageProductField()
	{
		WaitUtility waitutil=new WaitUtility();
		waitutil.waitManageProduct(ManageProduct);
		ManageProduct.click();	
	}
	
	public void clickMilkProductDeleteIcon()
	
	{
		MilkProduct.click();
		
		
	}
	
	public void clickSearchButton()
	{
		Searchbtn.click();
		
	}
	
	public void enterTitleInSearchField(String title)
	{
		TitleField.sendKeys(title);	
		
	}
	
	public void enterProductCodeInSearchField(String Procode)
	{
		ProductCode.sendKeys(Procode);
	}
	
	
	  public void chooseCategoryInSearchField() 
	  {
		  
		  Select select = new Select(Category);
		  select.selectByIndex(5);  
		  
	 }
	 
	
	public void chooseSubCategoryInSearchField()
	{
	
		 Select select = new Select(SubCategory);
		  select.selectByValue("noodles");
	}
	
	public void clickSearchListProductButton()
	{
		SearchListProduct.click();
	}
}
