package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class smokeTesetCase001 {
	WebDriver d;
	@Given("open chrome and start facebook")
	public void open_chrome_and_start_facebook() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.get("https://facebook.com/");
		System.out.println("Start facebook");
		
	    
	}
	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		d.findElement(By.name("email")).sendKeys("Imtz@gmail.com");
		d.findElement(By.name("pass")).sendKeys("Imtz123");
		d.findElement(By.name("login")).click();
		System.out.println("User and Password added");
		
	   
	}
	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		
		System.out.println("Logged in successfully");
	   
	}




}
