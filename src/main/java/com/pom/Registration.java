package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	public WebDriver driver;
	
	
	

	@FindBy(xpath = "//a[text()='Registration']")
	private WebElement registration;

	
	@FindBy(id = "patient-name")
	private WebElement patientname;

	@FindBy(id = "Phone-No")
	private WebElement patientno;

	@FindBy(id = "patient-age")
	private WebElement patientage;

	@FindBy(id = "exampleInputEmail1")
	private WebElement email;

	@FindBy(id = "exampleInputPassword1")
	private WebElement password;

	@FindBy(id = "country-id")
	private WebElement country_drop;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;


	public WebElement getRegistration() {
		return registration;
	}
	
	public WebElement getPatientname() {
		return patientname;
	}

	public WebElement getPatientno() {
		return patientno;
	}

	public WebElement getPatientage() {
		return patientage;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCountry_drop() {
		return country_drop;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public Registration(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
