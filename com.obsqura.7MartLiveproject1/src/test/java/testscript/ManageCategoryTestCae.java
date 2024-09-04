package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginClass;
import pages.ManageCategoryClass;
import utilities.ExcelUtility;

public class ManageCategoryTestCae extends BaseClass
{

	@Test(priority=1)
	public void verifyCategoryField() throws IOException
	{
		String username=ExcelUtility.getStringData4(1,0,"ManageCategory");
		String pwd=ExcelUtility.getStringData4(1,1,"ManageCategory");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		ManageCategoryClass managecat = new ManageCategoryClass(driver);
		managecat.clickManageCategoryField();
		String actual="List Categories | 7rmart supermarket";
		String expected="List Categories | 7rmart supermarket";
		Assert.assertEquals(actual,expected,Constants.ERRORMESSAGEFORVERIFYCATEGORYFIELD);
	}
		
		@Test(priority=2)
		public void verifyDeleteIcon() throws IOException
		{
		String username=ExcelUtility.getStringData4(1,0,"ManageCategory");
		String pwd=ExcelUtility.getStringData4(1,1,"ManageCategory");
	    LoginClass login = new LoginClass(driver);
	    login.enterusername(username);
	    login.enterpwd(pwd);
	    login.clicksigninbtn();
	    ManageCategoryClass managecat = new ManageCategoryClass(driver);
	    managecat.clickManageCategoryField();
		managecat.deleteChocolateItem();
		boolean isAlertDisplayed= managecat.isAlertDisplayedDeletionofItem();
		assertTrue(isAlertDisplayed,Constants.ERRORMESSAGEFORVERIFYDELETEICON);
		}
		@Test(priority=3)
		public void verifyEditicon() throws IOException
		{
			String username=ExcelUtility.getStringData4(1,0,"ManageCategory");
			String pwd=ExcelUtility.getStringData4(1,1,"ManageCategory");
			LoginClass login = new LoginClass(driver);
			login.enterusername(username);
			login.enterpwd(pwd);
			login.clicksigninbtn(); 
		    ManageCategoryClass managecat = new ManageCategoryClass(driver);
		    managecat.clickManageCategoryField();	
		    managecat.clickEditIcon();
		    managecat.selectNoRadioButton();
		    managecat.clickUpdateButton();
		   Boolean isListCategoryPageLoaded= managecat.viewLisCategoryscreenIsDisplayed();
		  assertTrue(isListCategoryPageLoaded,Constants.ERRORMESSAGEFOREDITICON);
		  }
		
		
		
		
	}

