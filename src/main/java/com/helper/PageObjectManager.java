package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.LogIn;
import com.pom.Registration;

public class PageObjectManager {

	public WebDriver driver;

	public PageObjectManager(WebDriver mdriver) {
		this.driver = mdriver;
	}

	public LogIn lp;

	public LogIn getLp() {
		if (lp == null) {
			lp = new LogIn(driver);
		}
		return lp;
	}
	
	public Registration reg;

	public Registration getreg() {
		if (reg == null) {
			reg = new Registration (driver);
		}
		return reg;
	}


}
