package com.cucumberautomation.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public static final String USERNAME_XPATH = "//input[@name='username']";
	public static final String PASSWORD_XPATH = "//input[@name='password']";
	public static final String LOGIN_XPATH = "//button[@type='submit']";

	public void enterUserName(String userName) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys(userName);
	}

	public void enterPassword(String password) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	public void clickOnLoginButton() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public String getLoginPageTitle() throws InterruptedException {
		Thread.sleep(4000);
		return driver.getTitle();

	}

}
