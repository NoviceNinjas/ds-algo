package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructPage_PO;

import pageObjects.SignInPage_PO;

public class DataStructPageSteps {
	
private SignInPage_PO sigInPage = new SignInPage_PO(DriverFactory.getDriver());
	
	private DataStructPage_PO datastructPage;
	static String actURL;
	

	
	@Given("The user has already logged in the home page for Data Structure modlule using")
	public void the_user_has_already_logged_in_the_home_page_for_data_structure_modlule_using(DataTable credTable) {

		List<Map<String, String>> credntialList = credTable.asMaps();
		String uName = credntialList.get(0).get("username");
		String pwd = credntialList.get(0).get("password");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		datastructPage = sigInPage.doLoginDataStructPage(uName, pwd);
	}

	@Given("The user is on the Data Structures Page after logged in")
	public void the_user_is_on_the_data_structures_page_after_logged_in() {
		
		System.out.println("The user is in the Home Page after logging in with correct crdentials");
	  
	}
	
	@When("The user clicks Time Complexity link on data structure page")
	public void the_user_clicks_time_complexity_link_on_data_structure_page() {
		
		datastructPage.doClickTimeComplexityLink();

	   
	}

	@Then("The user should be redirected to Time Complexity page on data structure page")
	public void the_user_should_be_redirected_to_time_complexity_page_on_data_structure_page() {
	  
		System.out.println("The URL of the page is: " +datastructPage.doGetPageUrl() );
		Assert.assertTrue(datastructPage.doGetPageUrl().contains("time-complexity"));
		
	}


	@Given("The user is on Time Complexity link of the Data Structures Page after logged in")
	public void the_user_is_on_time_complexity_link_of_the_data_structures_page_after_logged_in() {
		datastructPage.doClickTimeComplexityLink();
	}

	@When("The user clicks Try Here  button of Time Complexity page")
	public void the_user_clicks_try_here_button_of_time_complexity_page() {
		datastructPage.doClickButton();
	   
	}

	@Then("The user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String expURL) {
	    String actURL;
	    actURL = datastructPage.doGetPageUrl();
	    System.out.println("The URL of the current page: " + actURL);
	    Assert.assertTrue(actURL.contains(expURL));
	    
	}

	
	@When("The user clicks Practice Questions link of Time Complexity page")
	public void the_user_clicks_practice_questions_link_of_time_complexity_page() {
	   datastructPage.doClickLink();
	}

	@Then("The user redirected to the {string} page of Data Structures")
	public void the_user_redirected_to_the_page_of_data_structures(String string) {
	  String actUrl;
	  actUrl =datastructPage.doGetPageUrl();
	  System.out.println("The link for practice question page is: " + actUrl);
	  Assert.assertTrue(actUrl.contains("practice"));
	  
	}
	
	@Then("the practice page of Data structures is blank")
	public void the_practice_page_of_data_structures_is_blank() {
	   int actCount = datastructPage.doGetCountOfPracticeQuestions();
	   System.out.println("The count of questions on practcie page is: " + actCount);
	   Assert.assertTrue(actCount == 0 );
	   
	}
	
	
	@When("The user clicks on try here button at the bottom of Time Complexity page")
	public void the_user_clicks_on_try_here_button_at_the_bottom_of_time_complexity_page() {
	   datastructPage.doClickTryHereBttn();
	}

	@Given("The user clicks on try here button at the bottom of Time Complexity page of Data Structures page")
	public void the_user_clicks_on_try_here_button_at_the_bottom_of_time_complexity_page_of_data_structures_page() {
		 datastructPage.doClickTryHereBttn();
	}

	@When("The The user clicks the Run button without entring any code in the Editor for Data Structures page")
	public void the_the_user_clicks_the_run_button_without_entring_any_code_in_the_editor_for_data_structures_page() {
		datastructPage.doSendInput("");
		datastructPage.doClickRunBttn();
		actURL = datastructPage.doGetPageUrl();
		
	    
	}

	@Then("The user stays on the same page of Data Structures page")
	public void the_user_stays_on_the_same_page_of_data_structures_page() {
		Assert.assertTrue(actURL.contains("tryEditor"));
	}
	
}