package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage_PO;
import pageObjects.RegistrationPage_PO;

public class RegistrationPageSteps {
	private HomePage_PO homePage = new HomePage_PO(DriverFactory.getDriver());
	private RegistrationPage_PO registerPage;
	String actLogInMesg;
	String actPageUrl;
	
	
	@Given("The User has clicked on the {string} button from the home page for register")
	public void the_user_has_clicked_on_the_sign_in_button_from_the_home_page_for_register(String element) {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
		registerPage = (RegistrationPage_PO) homePage.clickGetstartedfromPortal(element);
	}

	@Given("The user is on the new user registration page")
	public void the_user_is_on_the_new_user_registration_page() {
	   System.out.println("The user is in the sign in page");
	}
	@When("The user clicks {string}")
	public void the_user_clicks_register_button(String element) {
		
		registerPage.doElementClick(element);	   
	}
	

	@When("The user fills {string} with {string}")
	public void user_fills_an_element(String element,String details) throws FileNotFoundException, IOException, ParseException {
		
		registerPage.fillElement(element,details);	   
	}
	

	
	@Then("The error {string} appears below {string}")
	public void user_eneters_the_username(String msg,String element) {
		
		String errorMsg=registerPage.getMessage(element);	  
		System.out.println("errorMsg"+errorMsg);
		System.out.println("msg"+msg);
		assertTrue(errorMsg.contains(msg));
	}
	@Then("The {string} message {string} appears")
	public void warning_appears(String element,String msg) {
		
		String alertMsg=registerPage.getAlert(element);	  
		System.out.println("alertMsg"+alertMsg);
		System.out.println("msg"+msg);
		assertTrue(alertMsg.contains(msg));
	}
	




}
