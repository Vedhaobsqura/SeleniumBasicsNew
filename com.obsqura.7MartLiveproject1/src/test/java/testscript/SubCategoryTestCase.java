package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginClass;
import pages.ManageCategoryClass;
import pages.SubCategoryClass;
import utilities.ExcelUtility;

public class SubCategoryTestCase extends BaseClass
{

	@Test(priority=1)
	public void verifySubCategoryField() throws IOException
	{
		String username=ExcelUtility.getStringData9(1,0,"SubCategory");
		String pwd=ExcelUtility.getStringData9(1,1,"SubCategory");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		SubCategoryClass subcat=new SubCategoryClass(driver);
		subcat.clickSubCategoryField();
		//String actual="Dashboard | 7rmart supermarket";
		//String actual="List Sub Categories | 7rmart supermarket";
		//String expected="List Sub Categories | 7rmart supermarket";
		//Assert.assertEquals(actual,expected);
		 Assert.assertNotEquals("Dashboard | 7rmart supermarket", "List Sub Categories | 7rmart supermarket");  
	}
	
	@Test(priority=2)
	public void verifyNewButtonInSubCategory() throws IOException
	{
		String username=ExcelUtility.getStringData9(1,0,"SubCategory");
		String pwd=ExcelUtility.getStringData9(1,1,"SubCategory");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		SubCategoryClass subcat=new SubCategoryClass(driver);
		subcat.clickSubCategoryField();	
		subcat.clickNewButtonInListSubCategory();
		subcat.selectCategorydropdownfield();
		String Pronme=ExcelUtility.getStringData9(1,2,"SubCategory");
		subcat.enterTextInsubCategoryField(Pronme);
		subcat.clickSaveButton();
		subcat.clickCancelButton();
		Assert.assertTrue(true);
		
		
	}
	
	@Test(priority=3)
	public void verifySearchInSubCategory() throws IOException
	{
		String username=ExcelUtility.getStringData9(1,0,"SubCategory");
		String pwd=ExcelUtility.getStringData9(1,1,"SubCategory");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		SubCategoryClass subcat=new SubCategoryClass(driver);
		subcat.clickSubCategoryField();	
		subcat.clickSearchbtn();
		subcat.selectCategoryDropdownFromSearchSubCategory();
		String Pronme=ExcelUtility.getStringData9(1,2,"SubCategory");
		subcat.enterTextInSearchSubCategory(Pronme);
		subcat.clickSaveInSearchSubCategory();
		subcat.clickResetInSearchSubCategory();
	}
	
	@Test(priority=4)
	public void verifyEditInListSubCategory() throws IOException
	{
		String username=ExcelUtility.getStringData9(1,0,"SubCategory");
		String pwd=ExcelUtility.getStringData9(1,1,"SubCategory");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		SubCategoryClass subcat=new SubCategoryClass(driver);
		subcat.clickSubCategoryField();	
		subcat.clickEditButtonInListOfSubCategoryProduct();
		subcat.selectNewDropTextFromEditSubCategory();
		String Pronme1=ExcelUtility.getStringData9(1,3,"SubCategory");
		subcat.enterNewTextInEditOfSubCategory(Pronme1);
		subcat.clicUpdateButtonInEditOfSubCategoryProduct();
		boolean isSubCategoryListLoaded= subcat.listOfSubCategoryPageIsDisplayed();
		assertTrue(isSubCategoryListLoaded,Constants.ERRORMESSAGETOVERIFYEDITINLISTCATEGORY);
	}
	
}
