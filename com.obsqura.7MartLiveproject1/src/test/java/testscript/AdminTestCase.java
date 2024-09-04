package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminClass;
import pages.LoginClass;
import retry.Retry;
import utilities.ExcelUtility;

public class AdminTestCase extends BaseClass


{

	
	@Test(priority=1,retryAnalyzer =retry.Retry.class)
	public void listOfAdminUsers() throws IOException
	{
		String username=ExcelUtility.getStringData2(1,0,"Admin");
		String pwd=ExcelUtility.getStringData2(1,1,"Admin");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		AdminClass admin=new AdminClass(driver);
		admin.clickAdminUsersField();
		admin.clickNewButtonofAdminUsers();
		String AdminUsername=ExcelUtility.getStringData2(1,2,"Admin");
		String Adminpwd=ExcelUtility.getStringData2(1,3,"Admin");
		admin.enterUsernameField(AdminUsername);
        admin.enterPasswordField(Adminpwd);
        admin.selectUserTypeDropDown();
        admin.clickSaveButton();
        String actualalert= "            Username already exists.        ";
        String expectedalert="            Username already exists.        ";
        Assert.assertEquals(actualalert,expectedalert,Constants.ERRORMESSAGEFORADMINUSER);
      
        
	

}
}
