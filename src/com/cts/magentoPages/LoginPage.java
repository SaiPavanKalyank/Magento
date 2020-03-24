package com.cts.magentoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private static By usernameLoc=By.id("email");
private static By passwordLoc=By.id("pass");
private static By loginclickLoc=By.id("send2");
private static By errorMessgLoc=By.xpath("//span[contains(text(),'Invalid')]");
private static By registerLoc=By.xpath("//span[text()='Register']");

	public static void enterUsername(WebDriver driver,String username)
{
	
		driver.findElement(usernameLoc).sendKeys(username);
	}
	public static void enterPassword(WebDriver driver,String password)
	{
		driver.findElement(passwordLoc).sendKeys(password);
	}
	public static void loginclickLoc(WebDriver driver)
	{
		driver.findElement(loginclickLoc).click();
	}
	public static String errorMessg(WebDriver driver)
	{
		String errorMessg=driver.findElement(errorMessgLoc).getText();
		System.out.println(errorMessg);
		return errorMessg;
	}
	public static void clickOnRegister(WebDriver driver)
	{
		driver.findElement(registerLoc).click();
	}
}
