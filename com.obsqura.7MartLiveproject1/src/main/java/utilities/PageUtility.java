package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
	WebDriver driver;
	
	

	public void selectIndexForAdmInUsers(WebElement elementindex) 
	  {
	   Select select=new Select(elementindex);
	   select.selectByIndex(1);
	   }
	 
	
	public void selectIndexFromSubCategory(WebElement categoryindex)
	{
		Select select=new Select(categoryindex);
		select.selectByValue("257");
	}
	
	public void selectIndexFromSearchSubCategory(WebElement searchSubCategory)
	{
		Select select=new Select(searchSubCategory);
		select.selectByValue("257");
	
    }
	
	public void selectIndexFromEditSubCategory(WebElement EditSubCategory)
	{
		Select select=new Select(EditSubCategory);
		select.selectByVisibleText("IphoneAirpod");
	
    }
	
	public void scrollWindowInManageCategory()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,250)");
	}
	
	

}	
	
	
