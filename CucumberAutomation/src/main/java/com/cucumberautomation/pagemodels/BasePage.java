package com.cucumberautomation.pagemodels;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;

	}

	public WebDriver getDriver() {
		return this.driver;
	}

}
