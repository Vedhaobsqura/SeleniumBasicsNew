package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class SubCategoryClass 
{


	WebDriver driver;
	
	public SubCategoryClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right'])[4]") WebElement SubCategory;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement NewBtn;
	@FindBy(xpath="//select[@name='cat_id']") WebElement CategoryDropTextField;
    @FindBy(xpath="//input[@id='subcategory']") WebElement SubCategoryTextField;
    @FindBy(xpath="//button[@type='submit']") WebElement SaveButton;
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']") WebElement Cancelbtn;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement SearchBtn;
	@FindBy(xpath="//select[@id='un']") WebElement SearchCategoryDropDownTextField;
	@FindBy(xpath="//input[@type='text']") WebElement SearchSubCategoryTextField;
	@FindBy(xpath="//button[@name='Search']") WebElement SearchSubCategorySaveBtn;
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']") WebElement ResetBtnInSearchSubCategory;
	@FindBy(xpath="(//a[@class='btn btn-sm btn btn-primary btncss'])[1]") WebElement EditbtnInListSubCategory;
	@FindBy(xpath="//select[@id='cat_id']") WebElement EditCategoryField;
	@FindBy(xpath="//input[@id='subcategory']") WebElement NewTextInSubCategoryFieldOfEdit;
	@FindBy(xpath="//button[@name='update']") WebElement UpdateBtnInEditSubCategory;
	@FindBy(xpath="(//div[@class='col-sm-6'])[1]") WebElement ListSubCategoryPage;
	
	
	
	public void clickSubCategoryField()
	{
		SubCategory.click();
	}
	
	
	public void clickNewButtonInListSubCategory()
	{
		NewBtn.click();	
	}
	
	public void selectCategorydropdownfield()
	{
		PageUtility pageselect= new PageUtility();
		pageselect.selectIndexFromSubCategory(CategoryDropTextField);
	}
	
	public void enterTextInsubCategoryField(String subcattext)
	{
		SubCategoryTextField.sendKeys(subcattext);
	}
	
	public void clickSaveButton()
	{
		SaveButton.click();
	}
	
	public void clickCancelButton()
	{
		Cancelbtn.click();	
	}
	
	public void clickSearchbtn()
	
	{
		SearchBtn.click();	
	}
	public void selectCategoryDropdownFromSearchSubCategory()
	{
		PageUtility pageselect= new PageUtility();
		pageselect.selectIndexFromSearchSubCategory(SearchCategoryDropDownTextField);
	}
	
	public void enterTextInSearchSubCategory(String SearchSubCategoryText)
	{
		SearchSubCategoryTextField.sendKeys(SearchSubCategoryText);	
	}
	
	public void clickSaveInSearchSubCategory()
	{
		SearchSubCategorySaveBtn.click();	
	}
	
	public void clickResetInSearchSubCategory()
	{
		ResetBtnInSearchSubCategory.click();
	}
	public void clickEditButtonInListOfSubCategoryProduct()
	{
		EditbtnInListSubCategory.click();
	}
	
	public void selectNewDropTextFromEditSubCategory()
	{
		PageUtility pageselect= new PageUtility();
		pageselect.selectIndexFromEditSubCategory(EditCategoryField);
	}
	public void enterNewTextInEditOfSubCategory(String EditNewTextSubCategoryText)
	{
		NewTextInSubCategoryFieldOfEdit.sendKeys(EditNewTextSubCategoryText);	
	}
	
	public void clicUpdateButtonInEditOfSubCategoryProduct()
	{
		UpdateBtnInEditSubCategory.click();
	}
	public boolean listOfSubCategoryPageIsDisplayed()
	{
		return ListSubCategoryPage.isDisplayed();
	}

}