package com.example.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;

public class Google{
	@Given(" Launch Google Home Page")
	public void launchGoogle() {
		System.setProperty("webdriver.edge.driver","src/main/java/resources/msedgedriver.exe" );
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/index.html");
		driver.manage().window().maximize();
	}
	@Given("Launch Google Home Page")
	public void launch_google_home_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}