package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsSteps extends BaseClass{
	
	
//	@Given("open the chrome browser")
//	public void open_the_chrome_browser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
//	@Given("log the leaftaps application url")
//	public void log_the_leaftaps_application_url() {
//	    driver.get("http://leaftaps.com/opentaps/");
//	}
	@Given("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		boolean display = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(display==true) {
			System.out.println("user is on Home page, Test case passed");
	}
		else {
			System.out.println("User is not on home page, Test case failed");
		}

	}
	@But("User should get an error message")
	public void erromessage() {
		boolean display = driver.findElement(By.id("errorDiv")).isDisplayed();
		if(display==true) {
			System.out.println("Wrong Credential");
	}
		else {
			System.out.println("Correct Credential");
		}

	}

}
