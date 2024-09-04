package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginClass;
import pages.ManageCategoryClass;
import pages.ManageFooterTextClass;
import utilities.ExcelUtility;

public class ManageFootertextTestCase extends BaseClass
{
	@Test
	public void verifyFooterTextField() throws IOException
	{
		String username=ExcelUtility.getStringData6(1,0,"ManageFooter");
		String pwd=ExcelUtility.getStringData6(1,1,"ManageFooter");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		ManageFooterTextClass managetext = new ManageFooterTextClass(driver);
		managetext.clickManageFooterTextField();
		managetext.clickEditFooterText();
		String address=ExcelUtility.getStringData6(1,2,"ManageFooter");
		String email=ExcelUtility.getStringData6(1,3,"ManageFooter");
		managetext.enteraddress(address);
		managetext.enterEmail(email);
		managetext.clickUpdateButton();
		Boolean FooterDashboard=managetext.footerTextPageIsDisplayed();
		Assert.assertTrue(FooterDashboard,Constants.ERRORMESSAGETOVERIFYFOOTERTEXTFIELD);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
