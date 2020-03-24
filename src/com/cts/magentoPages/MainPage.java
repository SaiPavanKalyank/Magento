package com.cts.magentoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
		private static By logoutLoc=By.linkText("Log Out");

		public static void logout(WebDriver driver)
		{
			driver.findElement(logoutLoc).click();
		}
		public static void waitForLogout(WebDriver driver)
		{
			WebDriverWait driverWait =new WebDriverWait(driver, 50);
			driverWait.until(ExpectedConditions.presenceOfElementLocated(logoutLoc));
		}
		public static String tittlecheck(WebDriver driver)
		{
			String actualTitle=driver.getTitle();
			return actualTitle;
		}
	}


