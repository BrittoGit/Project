package com.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baseclass.BaseClass;
import com.helper.FileReadManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\dba\\Downloads\\ProjectView\\features\\login.feature",
		"C:\\Users\\dba\\Downloads\\ProjectView\\features\\ProviderRegistration.feature" }, glue = "com.stepdef", strict = true, dryRun = false, monochrome = true)

public class Tools_TestRunner {

	public static WebDriver driver = null;

	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReadManager.getInstance().getCr().getBrowser();

		try {
			driver = BaseClass.getBrowser(browser);

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Browser Name is Invalid");
		}
	}

	@AfterClass
	public static void closeBrowser() throws Throwable {

		driver.close();

	}
}
