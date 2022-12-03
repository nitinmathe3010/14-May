package testlayer;

import java.io.IOException;

import org.testng.annotations.Test;

import pageLayer.HomePage;
import pageLayer.LoginPage;
import testBase.TestBase;
import utility.ExcelReadData;

public class LoginPageTest extends TestBase {
	@Test
	public void logintest() throws IOException
	{
		HomePage home=new HomePage(driver);
		
		LoginPage login=new LoginPage(driver);
		
		home.clickOnLoginLink();
		login.enterUsername(ExcelReadData.readData("Logindata", 1, 0));
		login.enterPassword(ExcelReadData.readData("Logindata", 1, 1));
		login.clickOnLoginButton();
		
	}
	

}
