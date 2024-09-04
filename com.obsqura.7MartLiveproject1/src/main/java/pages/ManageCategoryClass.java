package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.PageUtility;

public class ManageCategoryClass
{
	WebDriver driver;
	
	
public ManageCategoryClass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right'])[4]") WebElement ManageCategoryField;
@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[2]") WebElement Chocolateitem;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement AlertondeletionofItem;
@FindBy(xpath="(//i[@class='fas fa-edit'])[2]") WebElement EditIcon;
@FindBy(xpath="(//input[@type='radio'])[2]") WebElement NoRadioButton;
@FindBy(xpath="//button[@name='update']") WebElement UpdateButton;
@FindBy(xpath="//h1[@class='m-0 text-dark']") WebElement ListCategoryPage;

public void clickManageCategoryField()
{
	ManageCategoryField.click();
}

public void deleteChocolateItem()
{
	
	Chocolateitem.click();
	Alert alert=driver.switchTo().alert();
	   String confirmationalert=alert.getText();
	 System.out.println("Confirmation alert text is:" +confirmationalert);
	  alert.accept();
	
}

public boolean isAlertDisplayedDeletionofItem()
{
	return AlertondeletionofItem.isDisplayed();
}


public void clickEditIcon()
{
	EditIcon.click();
}


public boolean selectNoRadioButton()
{
	NoRadioButton.click();
	return true;

}

public void clickUpdateButton()
{
	//PageUtility page=new PageUtility();
	//page.scrollWindowInManageCategory();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(250,250)");
    UpdateButton.click();
}

public boolean viewLisCategoryscreenIsDisplayed()
{
	return ListCategoryPage.isDisplayed();
}
















}






















