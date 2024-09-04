package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginClass;
import pages.ManageProductClass;
import utilities.ExcelUtility;

public class LoginPageTestCase extends BaseClass 
{
//dataprovider -using data provider we can give invalid ad valid for same method no need to create new one 
	@DataProvider(name="credentials")
	public Object[][] testData() 
	{
		Object[][] input = new Object[2][2];
		input[0][0] = "admin";
		input[0][1] = "admin";
		//input[1][0] = "admin@123";
		//input[1][1] = "admin123";
		return input;
	}
	
@Test(priority=1,dataProvider = "credentials",groups= {"smoke"})
	public void verifyEnterValidUsernameandPasswordField(String username,String pwd) throws IOException 
	{
	
	
		
		//String username=ExcelUtility.getStringData1(1,0,"Login");
		//String pwd=ExcelUtility.getStringData1(1,1,"Login");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		System.out.println(username);
		System.out.println(pwd);
		boolean isDashboardLoaded= login.isDashboardDisplayed();
		assertTrue(isDashboardLoaded,Constants.ERRORMESSAGEFORLOGINVALIDUSERNAMEANDPASSWORD);
		
		
	}

@Test(priority=2)
@Parameters({"username","pwd"})
public void verifyInvalidUsernameValidpassword(String username,String pwd) throws IOException
{
	//String username=ExcelUtility.getStringData1(2,0,"Login");
	//String pwd=ExcelUtility.getStringData1(2,1,"Login");
	LoginClass login=new LoginClass(driver);
	login.enterusername(username);
	login.enterpwd(pwd);
	login.clicksigninbtn();
	boolean isAlertDisplayed= login.isAlertMessageDisplayed();
	assertTrue(isAlertDisplayed,Constants.ERRORMESSAGEFORINVALIDUNANDVALIDPWD);
	
    

}
@Test(priority=3)
public void verifyInvalidUsernamePassword() throws IOException
{
	String username=ExcelUtility.getStringData1(3,0,"Login");
	String pwd=ExcelUtility.getStringData1(3,1,"Login");
	LoginClass login=new LoginClass(driver);
	login.enterusername(username);
	login.enterpwd(pwd);
	login.clicksigninbtn();
	boolean isAlertDisplayed= login.isAlertMessageDisplayed();
	assertTrue(isAlertDisplayed,Constants.ERRORMESSAGEFORINVALIDUNANDPWD);
	
}
@Test(priority=4)
public void verifyValidUsernameInvalidPassword() throws IOException
{

	String username=ExcelUtility.getStringData1(1,0,"Login");
	String pwd=ExcelUtility.getStringData1(1,1,"Login");
	LoginClass login=new LoginClass(driver);
	login.enterusername(username);
	login.enterpwd(pwd);
	login.clicksigninbtn();
	boolean isAlertDisplayed= login.isAlertMessageDisplayed();
	assertTrue(isAlertDisplayed,Constants.ERRORMESSAGEFORVALIDUNANDINVALIDPWD);
		
}	
}
