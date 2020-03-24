package com.cts.magentoLoginTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cts.magentoPages.HomePage;
import com.cts.magentoPages.LoginPage;
import com.cts.magentoPages.RegestrationPage;
import com.cts.magentobase.LaunchWebDriver;
import com.cts.utlis.ExcelUtils;

public class RegestrationTest extends LaunchWebDriver{

	@DataProvider
	public String[][] regestrationData() throws IOException{
		return ExcelUtils.getSheetIntoStringArray("Resources/MagentoRegestration.xlsx", "RegistrationTest");
	}
	@Test(dataProvider = "regestrationData")
	public void regestrationTest(String firstname,String lastname,String emailid,String password,String confirmpassword,String company,String role)
	{
		HomePage.iconClick(driver);
		//clickOnRegister
		LoginPage.clickOnRegister(driver);
		//enterFirstname
		RegestrationPage.enterFirstname(driver, firstname);
		//enterLastname
		RegestrationPage.enterLastname(driver, lastname);
		//enterEmailaddress
		RegestrationPage.enterEmailaddress(driver, emailid);
		//selectCountry
		RegestrationPage.selectCountry(driver);
		
		//selectcompanyType
		RegestrationPage.selectcompanyType(driver,company);
		//selectcustomerrole
		RegestrationPage.selectcustomerrole(driver,role);
		//enterpassword
		RegestrationPage.enterpassword(driver, password);
		//enterconfirmpassword
		RegestrationPage.enterconfirmpassword(driver, confirmpassword);
		//termsandcond
		RegestrationPage.termsandcond(driver);
		
		/*
		 * driver.findElement(By.xpath("//button[@type='button']")).click();
		 * 
		 * driver.findElement(By.id("firstname")).sendKeys("fff");
		 * driver.findElement(By.id("lastname")).sendKeys("lll");
		 * driver.findElement(By.id("email_address")).sendKeys(
		 * "dztkakujcjmzbyskvj@awdrt.net");
		 * driver.findElement(By.id("country")).click();
		 * driver.findElement(By.xpath("//option[@value='IN']")).click();
		 * driver.findElement(By.id("customer_company_type")).click();
		 * driver.findElement(By.xpath("//option[@value='tech_partner']")).click();
		 * driver.findElement(By.id("customer_individual_role")).click();
		 * driver.findElement(By.xpath("//option[@value='technical/developer']")).click(
		 * ); driver.findElement(By.id("password")).sendKeys("myacct@123");
		 * driver.findElement(By.id("confirmation")).sendKeys("myacct@123");
		 * driver.findElement(By.id("agree_terms")).click();
		 * driver.findElement(By.id("registerSubmit")).click();
		 */
	}
	
	
}
