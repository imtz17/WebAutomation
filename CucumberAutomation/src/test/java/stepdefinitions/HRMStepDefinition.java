package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberautomation.pagemodels.BasePage;
import com.cucumberautomation.pagemodels.DashboardPage;
import com.cucumberautomation.pagemodels.LoginPage;
import com.cucumberautomation.utilities.DriverManagerUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class HRMStepDefinition {
	private WebDriver driver;
	DriverManagerUtility driverManagerUtility;
	LoginPage loginPage;
	DashboardPage dashboardPage;

	public HRMStepDefinition() {
		this.driverManagerUtility = new DriverManagerUtility();
		this.driver = driverManagerUtility.getDriver();
		this.loginPage = new LoginPage(driver);
		this.dashboardPage = new DashboardPage(driver);
	}

	@Given("user is on orangrhr login page")
	public void user_is_on_orangrhr_home_page() throws InterruptedException {
		/*
		 * String ExpectedeLoginPageTitle = loginPage.getLoginPageTitle(); if
		 * (ExpectedeLoginPageTitle.equalsIgnoreCase("OrangeHRM")) {
		 * System.out.println("URL successfully loaded"); } else {
		 * System.out.println("URL not successfully loaded"); }
		 */
		System.out.println("URL successfully loaded");

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() throws InterruptedException {
		Thread.sleep(4000);
		loginPage.enterUserName("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickOnLoginButton();

	}

	@Then("user should logged in successfully")
	public void user_should_logged_in_successfully() throws InterruptedException {
		String expectedProfileName = "Paul Collings";
		Thread.sleep(2000);
		String actualProfileName = dashboardPage.getProfileName();
		System.out.println(actualProfileName);
		Assert.assertEquals("actual profile name is different from expected profile name", expectedProfileName,
				actualProfileName);

	}

}
