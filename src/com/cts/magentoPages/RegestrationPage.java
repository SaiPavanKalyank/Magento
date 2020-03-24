package com.cts.magentoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class RegestrationPage {
	private static By firstnameLoc=By.id("firstname");
	private static By lastnameLoc=By.id("lastname");
	private static By emailidLoc=By.id("email_address");
	private static By countryLoc=By.id("country");
	private static By selectcountryLoc=By.xpath("//option[@value='IN']");
	private static By companttypeLoc=By.id("customer_company_type");
	private static By selectcompanttypeLoc=By.xpath("//option[@value='tech_partner']");
	private static By customertypeLoc=By.id("customer_individual_role");
	private static By selectcustomertypeLoc=By.xpath("//option[@value='technical/developer']");
	private static By passwordLoc=By.id("password");
	private static By confirmpasswordLoc=By.id("confirmation");
	private static By termsandcondLoc=By.id("agree_terms");
	
	
	
	public static void enterFirstname(WebDriver driver, String firstname )
	{
		driver.findElement(firstnameLoc).sendKeys(firstname);
	}
	public static void enterLastname(WebDriver driver,String lastname)
	{
		driver.findElement(lastnameLoc).sendKeys(lastname);
	}
	public static void enterEmailaddress(WebDriver driver,String emailid)
	{
		driver.findElement(emailidLoc).sendKeys(emailid);
	}
	public static void selectCountry(WebDriver driver)
	{
		driver.findElement(countryLoc).click();
	    driver.findElement(selectcountryLoc).click();
	}
	public static void selectcompanyType(WebDriver driver,String companyname)
	{
		Select selectcompanytype=new Select(driver.findElement(companttypeLoc));
		selectcompanytype.selectByVisibleText(companyname);
	}
	public static void selectcustomerrole(WebDriver driver, String rolename)
	{
		Select selectrole= new Select(driver.findElement(customertypeLoc));
		selectrole.selectByVisibleText(rolename);
	}
	public static void enterpassword(WebDriver driver,String password)
	{
		 driver.findElement(passwordLoc).sendKeys(password);
	}
	public static void enterconfirmpassword(WebDriver driver,String confirmpassword)
	{
		driver.findElement(confirmpasswordLoc).sendKeys(confirmpassword);
	}
	public static void termsandcond(WebDriver driver)
	{
		driver.findElement(termsandcondLoc).click();
	}
	
}
