package com.cts.magentoLoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cts.magentoPages.HomePage;
import com.cts.magentoPages.LoginPage;
import com.cts.magentoPages.MainPage;
import com.cts.magentobase.LaunchWebDriver;
//import com.cts.magentotest.$missing$;
import com.cts.utlis.ExcelUtils;


public class LoginTest extends LaunchWebDriver
{
	
	
	/*
	 * @DataProvider public String[][] invalidCredentialData() { String[][] main =
	 * new String[2][3];
	 * 
	 * main[0][0]="balaji@gmail.com"; main[0][1]="bala123";
	 * main[0][2]="invalid username and password";
	 * 
	 * main[1][0]="peter221@gmail.com"; main[1][1]="peter123";
	 * main[1][2]="invalid username and password";
	 * 
	 * return main; }
	 */
	@DataProvider 
	public String[][] invalidCredentialData() throws Exception{
		return ExcelUtils.getSheetIntoStringArray("Resources/MagentoData.xlsx", "InvalidCredentialTest");
	}
	
	@Test(dataProvider="invalidCredentialData")
	public void invalidCredentialTest(String username,String password,String expctedErrorMessg) {

		HomePage.iconClick(driver);
		LoginPage.enterUsername(driver, username);
		LoginPage.enterPassword(driver, password);
		LoginPage.loginclickLoc(driver);
		LoginPage.errorMessg(driver);

	}
	
	@Test@Ignore
	public void validCredentialTest() {

		HomePage.iconClick(driver);
		LoginPage.enterUsername(driver, "balaji0017@gmail.com");
		LoginPage.enterPassword(driver, "welcome@123");
		LoginPage.loginclickLoc(driver);
		MainPage.waitForLogout(driver);
		String actualTitle = MainPage.tittlecheck(driver);

		String expectedTitle = "My Account";
		Assert.assertEquals(actualTitle, expectedTitle);
		MainPage.logout(driver);

	}

}
