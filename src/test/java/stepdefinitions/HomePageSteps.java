package stepdefinitions;

import org.junit.Assert;

import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage_PO;

public class HomePageSteps {
	private HomePage_PO homePage = new HomePage_PO(DriverFactory.getDriver());
	
	public static String withoutSignedInMsg;
	public static String pageUrl;
	
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		homePage.doGetStartClick();
	}

	@Then("The URL of the page should contain {string}")
	public void the_url_of_the_page_should_contain(String expTitle) {
		pageUrl =  homePage.getHomePageURL();
	   System.out.println("The actual URL of the page is: " + pageUrl);
	   Assert.assertTrue(pageUrl.contains(expTitle));
	}

	@And("The user should see {int} panes with different data structires")
	public void the_user_should_see_panes_with_different_data_structires(int expectedMenuItem) {
		 int actMenuItems = homePage.countDropDownMenuItems();
		    System.out.println("The actual number of menu items are "+ actMenuItems );
		     Assert.assertEquals(expectedMenuItem, actMenuItems);
	}

	@And("Register Link is displayed")
	public void register_link_is_displayed() {
		Boolean myFlag = homePage.checkRegisterLinkIdDispalyed();
		System.out.println("Cheking if register link is dispalyed or not : "+ myFlag);
	   Assert.assertTrue(myFlag);
	}

	@And("Sign In Link is displayed")
	public void sign_in_link_is_displayed() {
		Boolean signInFlag = homePage.checkSignInLinkIdDispalyed();
		System.out.println("Cheking if sign in link is dispalyed or not : "+ signInFlag);
		Assert.assertTrue(signInFlag);
	}

	@Given("The user opens Home Page without loggin in")
	public void the_user_opens_home_page_without_loggin_in() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
		homePage.doGetStartClick();
	}

	@When("The user clicks any of the Get Started buttons below the data structures")
	public void the_user_clicks_any_of_the_get_started_buttons_below_the_data_structures() {
		 withoutSignedInMsg = homePage.doClickGetStartedwithoutlogginin();
	}

	@Then("It should alert the user with a message You are not logged in")
	public void it_should_alert_the_user_with_a_message_you_are_not_logged_in() {
	    System.out.println("The user is aletrted with the message: " +withoutSignedInMsg );
	    Assert.assertTrue(withoutSignedInMsg.contains("not logged in"));
	}

	@When("The user selects any data structures item from the drop down menu")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_menu() {
	withoutSignedInMsg = homePage.doClickmenuitemwithoutlogginin();
	   
	}

	@When("The user clicks Sign in")
	public void the_user_clicks_sign_in() {
		 homePage.doClickSignIn();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    System.out.println("The user is redirected to the sig in page: ");
	    
	}

}