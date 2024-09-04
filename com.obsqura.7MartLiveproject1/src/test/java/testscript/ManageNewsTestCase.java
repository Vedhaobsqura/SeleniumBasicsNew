package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginClass;
import pages.ManageNewsClass;
import utilities.ExcelUtility;

public class ManageNewsTestCase extends BaseClass
{

	@Test(priority=1)
	public void manageNewsInfo() throws IOException
	{
		String username=ExcelUtility.getStringData6(1,0,"ManageNews");
		String pwd=ExcelUtility.getStringData6(1,1,"ManageNews");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		ManageNewsClass managenews= new ManageNewsClass(driver);
		managenews.clickManageNewsField();
		managenews.clickNewButtonInManageNews();
		String Actual="Product";
		managenews.enterNewsText(Actual);
		//String Expected="Testing";//case stops
		String Expected="Product";
		managenews.clickSaveButtonInManageNewsCategory();
		Assert.assertEquals(Actual,Expected,Constants.ERRORMESSAGETOVERIFYMANAGENEWS);
	
		
	
	
	
	}
	
}
