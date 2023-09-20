package com.cucumberautomation.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerUtility {

	private WebDriver driver;


	public void initializeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	public WebDriver getInitializedDriver() {
		if (driver == null) {
			initializeDriver();
		}
		return driver;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
