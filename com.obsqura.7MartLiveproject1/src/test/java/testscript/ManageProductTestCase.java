package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginClass;
import pages.ManageProductClass;
import utilities.ExcelUtility;

public class ManageProductTestCase extends BaseClass 
{
	
	@Test
	public void listOfManageProduct() throws IOException
	{
		String username=ExcelUtility.getStringData7(1,0,"ManageProduct");
		String pwd=ExcelUtility.getStringData7(1,1,"ManageProduct");
		LoginClass login = new LoginClass(driver);
		login.enterusername(username);
		login.enterpwd(pwd);
		login.clicksigninbtn();
		ManageProductClass manage = new ManageProductClass(driver);
		manage.clickManageProductField();
		manage.clickMilkProductDeleteIcon();
		manage.clickSearchButton();
		manage.enterTitleInSearchField("pro");
		
	}
}
	
	/*
	 * @Test public void clickManageProduct()
	 * 
	 * {
	 * 
	 * ManageProductClass mpc =new ManageProductClass(driver);
	 * mpc.clickManageProductField();
	 * 
	 * }
	 * 
	 * @Test public void clickDeleteIconforProduct() {
	 * 
	 * ManageProductClass mpc = new ManageProductClass(driver);
	 * mpc.clickManageProductField();
	 *  Alert alert=driver.switchTo().alert();
	 *   String confirmationalert=alert.getText();
	 * System.out.println("Confirmation alert text is:" +confirmationalert);
	 * alert.accept(); 
	 * }
	 * 
	 * 
	 * public void clickSearchField() {
	 * 
	 * ManageProductClass mpc = new ManageProductClass(driver);
	 * mpc.clickSearchButton(); }
	 * 
	 * 
	 * public void enterValueForTitleField() { String
	 * Expectedtitle="List Products | 7rmart supermarket"; ManageProductClass mpc =
	 * new ManageProductClass(driver); mpc.enterTitleInSearchField(Expectedtitle);
	 * String ActualTitle="List Products | 7rmart supermarket";
	 * Assert.assertEquals(ActualTitle, Expectedtitle);
	 * 
	 * }
	 * 
	 * public void enterValueForProductCode() { String code="1234";
	 * ManageProductClass mpc = new ManageProductClass(driver);
	 * mpc.enterProductCodeInSearchField(code); }
	 * 
	 * public void selectGroceryFromCategoryField() { ManageProductClass mpc = new
	 * ManageProductClass(driver); mpc.chooseCategoryInSearchField();
	 * 
	 * 
	 * } public void selectGroceryFromSubCategoryField() { ManageProductClass mpc =
	 * new ManageProductClass(driver); mpc.chooseSubCategoryInSearchField(); }
	 * 
	 */
	

