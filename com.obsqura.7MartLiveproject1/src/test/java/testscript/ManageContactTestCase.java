package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginClass;
import pages.ManageContactClass;
import pages.ManageFooterTextClass;
import utilities.ExcelUtility;

public class ManageContactTestCase extends BaseClass
{

		@Test
		public void verifyContactField() throws IOException
		{
			String username=ExcelUtility.getStringData5(1,0,"ManageContact");
			String pwd=ExcelUtility.getStringData5(1,0,"ManageContact");
			LoginClass login = new LoginClass(driver);
			login.enterusername(username);
			login.enterpwd(pwd);
			login.clicksigninbtn();
			ManageContactClass managecontact = new ManageContactClass(driver);
			managecontact.clickManageProduct();
			managecontact.clickEditContactField();
			String phone=ExcelUtility.getIntegerData5(1,2,"ManageContact");
			String email=ExcelUtility.getStringData5(1,3,"ManageContact");
			String address=ExcelUtility.getStringData5(1,4,"ManageContact");
			managecontact.clickPhoneField(phone);
			managecontact.clickEmailField(email);
			managecontact.clickAddressField(address);
	        managecontact.clickUpdabtn();
			Boolean contactUsDashboard=managecontact.contactUsTextPageIsDisplayed();
			Assert.assertTrue(contactUsDashboard,Constants.ERRORMESSAGETOVERIFYCONTACTFIELD);

}

		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
}