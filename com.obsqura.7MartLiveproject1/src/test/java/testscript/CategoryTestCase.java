package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.CategoryClass;
import pages.LoginClass;
import utilities.ExcelUtility;

public class CategoryTestCase extends BaseClass
{

	@Test
	public void verifyClickingCategoryField() throws IOException
	{
		String username=ExcelUtility.getStringData3(1,0,"Category");
		String pwd=ExcelUtility.getStringData3(1,1,"Category");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		CategoryClass category = new CategoryClass(driver);
		category.clickCategoryField();
		String actual="List Categories | 7rmart supermarket";
		Assert.assertNotEquals(actual, "List Categories",Constants.ERRORMESSAGEFORCLICKCATEGORYFIELD);
		
	}
	@Test
	public void verifySearchButton() throws IOException
	{
		String username=ExcelUtility.getStringData3(1,0,"Category");
		String pwd=ExcelUtility.getStringData3(1,1,"Category");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		CategoryClass category = new CategoryClass(driver);
		category.clickCategoryField();
		category.clickSearchButton();
		category.enterSearchField("Electric");
		category.clickSearchbuttonInSearchList();
		Assert.assertTrue(true);
		
	}
	}

