package stepdefinitions;



import org.junit.Assert;

import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage_PO;
import pageObjects.SignInPage_PO;

public class SignInPageSteps {
	
	private HomePage_PO homePage = new HomePage_PO(DriverFactory.getDriver());
	private SignInPage_PO sigInPage;
	String actLogInMesg;
	String actPageUrl;
	
	@Given("The User has clicked on the {string} button from the home page")
	public void the_user_has_clicked_on_the_sign_in_button_from_the_home_page(String element) {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
		sigInPage = (SignInPage_PO) homePage.clickGetstartedfromPortal(element);
	}


	@Given("The user is in the Sign In page")
	public void the_user_is_in_the_sign_in_page() {
	   System.out.println("The user is in the sign in page");
	}

	@When("User eneters the username {string}")
	public void user_eneters_the_username(String string) {
		
		sigInPage.enterUname(string);	   
	}
	

	@And("The user eneters the password as {string}")
	public void the_user_eneters_the_password_as(String string) {
		sigInPage.enterPasswd(string);  
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		actLogInMesg = sigInPage.clickLoginButton() ;
		
	}

	
	@Then("The user is alerted with message that {string}")
	public void the_user_is_alerted_with_message_that(String string) {
		//System.out.println("The alert message is: " + actLogInMesg); 
		//System.out.println("The message from feature file is: " + string);
		Assert.assertTrue(actLogInMesg.contains(string));
	}

	@And("Sign Out link is displayed")
	public void sign_out_link_is_displayed() {
		Boolean myFlag = sigInPage.checkSignOutLinkIdDispalyed();
		//System.out.println("Cheking if sign out link is dispalyed or not : "+ myFlag);
	   Assert.assertTrue(myFlag);
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@When("The user clicks login button after leaving the username textbox and password textbox blank")
	public void the_user_clicks_login_button_after_leaving_the_username_textbox_and_password_textbox_blank() {
	  actLogInMesg =   sigInPage.clickLoginButtonwithblank();
	}

	@Then("The error message {string} appears below Username textbox")
	public void the_error_message_appears_below_username_textbox(String string) {
	   //System.out.println("The message we get is: " + actLogInMesg);
	   Assert.assertTrue(actLogInMesg.contains(string));
	}
	
	/////////////////////////////////////
	@When("The user clicks login button after entring the username {string} and leaving password textbox blank")
	public void the_user_clicks_login_button_after_entring_the_username_and_leaving_password_textbox_blank(String string) {
		sigInPage.enterUname(string);
		actLogInMesg =   sigInPage.clickLoginButtonwithblank();
	}

	@Then("The error message {string} appears below Password textbox")
	public void the_error_message_appears_below_password_textbox(String string) {
		 //System.out.println("The message we get is: " + actLogInMesg);
		   Assert.assertTrue(actLogInMesg.contains(string));
	}

	@When("The user clicks login button after entring the username blank and password {string}")
	public void the_user_clicks_login_button_after_entring_the_username_blank_and_password(String string) {
		sigInPage.enterPasswd(string);
		actLogInMesg =   sigInPage.clickLoginButtonwithblank();
	}

	


}