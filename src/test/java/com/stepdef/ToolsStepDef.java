package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.helper.FileReadManager;
import com.helper.PageObjectManager;
import com.test.Tools_TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToolsStepDef extends BaseClass {
	WebDriver driver = Tools_TestRunner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User has Navigated to the Login Page")
	public void user_has_navigated_to_the_login_page() throws Throwable {
	
		String url = FileReadManager.getInstance().getCr().getUrl();
		getUrl(url);

	}

	@When("User enters the valid {string} into email field")
	public void user_enters_the_valid_into_email_field(String string) {

		inputValuestoWebelement(pom.getLp().getUsername(), string);
	}

	@When("User enters the valid {string} into the password field")
	public void user_enters_the_valid_into_the_password_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		inputValuestoWebelement(pom.getLp().getPassword(), string);

	}

	@When("User clicks on the Login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		clickonWebelement(pom.getLp().getSubmit());
		Thread.sleep(2000);
        clickonWebelement(pom.getLp().getPatientList());
        Thread.sleep(2000);
        clickonWebelement(pom.getLp().getPtCountry());
        Thread.sleep(2000);
        clickonWebelement(pom.getLp().getcontact());
        
	}

	@Then("User Should be able to logged in Successfully")
	public void user_should_be_able_to_logged_in_successfully() throws InterruptedException {
		Thread.sleep(3000);
		clickonWebelement(pom.getLp().getlogout());
	}

}