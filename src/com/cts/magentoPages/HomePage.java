package com.cts.magentoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private static By iconclickLoc=By.xpath("//i[@class='fa fa-user']");
	public static void iconClick(WebDriver driver) {
		driver.findElement(iconclickLoc).click();
	}

}
