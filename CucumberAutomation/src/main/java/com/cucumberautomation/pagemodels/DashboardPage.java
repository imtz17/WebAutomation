package com.cucumberautomation.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);

	}

	public static final String PROFILE_XPATH = "//p[@class='oxd-userdropdown-name']";

	public String getProfileName() {
		return driver.findElement(By.xpath(PROFILE_XPATH)).getText();
	}

	public String getLoginPageTitle() {
		return driver.getTitle();

	}

}
