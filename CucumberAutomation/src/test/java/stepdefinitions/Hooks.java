package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberautomation.utilities.DriverManagerUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	private WebDriver driver;
	private DriverManagerUtility driverManagerUtility = new DriverManagerUtility();

	@Before
	public void setUp() {

		driver = driverManagerUtility.getInitializedDriver();
		
	}

	@After
	public void tearDown() {
		driverManagerUtility.closeDriver();
	}

}
