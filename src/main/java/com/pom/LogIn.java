package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {

	public WebDriver driver;

	@FindBy(id = "exampleInputEmail1")
	private WebElement username;

	@FindBy(id = "exampleInputPassword1")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//a[text()='Patient List']")
	private WebElement PatientList ;
	
	@FindBy(xpath = "//a[text()='Patient Country']")
	private WebElement PtCountry ;
	
	@FindBy(xpath = "//a[text()='Contact']")
	private WebElement contact ;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout ;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getPatientList() {
		return PatientList;
	}
	
	public WebElement getPtCountry() {
		return PtCountry;
	}
	
	public WebElement getcontact() {
		return contact;
	}
	
	public WebElement getlogout() {
		return logout;
	}
	

	public LogIn(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
