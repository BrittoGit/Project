package com.stepdef;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.helper.FileReadManager;
import com.helper.PageObjectManager;
import com.test.Tools_TestRunner;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProviderStepDef extends BaseClass {

	WebDriver driver = Tools_TestRunner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User Creates an Acccount on the Portal with mandatory Fields")
	public void user_creates_an_acccount_on_the_portal_with_mandatory_fields() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String url = FileReadManager.getInstance().getCr().getUrl();
		getUrl(url);

	}

	@Given("User Navigated to Registraion Page")
	public void user_navigated_to_registraion_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		clickonWebelement(pom.getreg().getRegistration());

		Thread.sleep(2000);

	}

	@When("User enters the required details in the Below Field1")
	public void user_enters_the_required_details_in_the_below_field1(DataTable dataTable) {

		Map<String, String> asMap = dataTable.asMap(String.class, String.class);

		String n = asMap.get("patient_name");
		inputValuestoWebelement(pom.getreg().getPatientname(), n);

		String num = asMap.get("Phone_Number");
		inputValuestoWebelement(pom.getreg().getPatientno(), num);

		String age = asMap.get("patient_age");
		inputValuestoWebelement(pom.getreg().getPatientage(), age);

		String email = asMap.get("Email_Address");
		inputValuestoWebelement(pom.getreg().getEmail(), email);

		String pass = asMap.get("password");
		inputValuestoWebelement(pom.getreg().getPassword(), pass);

		String country = asMap.get("Select_Country");

		selectDropDownOption(pom.getreg().getCountry_drop(), "value", country);

	}

	@When("User clicks on Submit")
	public void user_clicks_on_submit() {
		// Write code here that turns the phrase above into concrete actions
		clickonWebelement(pom.getreg().getSubmit());
	}

	@Then("User should be able to registered Successfully")
	public void user_should_be_able_to_registered_successfully() throws InterruptedException {

	}

}
