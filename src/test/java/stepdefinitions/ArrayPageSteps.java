package stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
//import static org.testng.Assert.
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.junit.Assert;

import com.qa.Utils.LoggerLoad;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SignInPage_PO;
import pageObjects.ArrayPage_PO;

public class ArrayPageSteps {
	private SignInPage_PO sigInPage = new SignInPage_PO(DriverFactory.getDriver());
	private ArrayPage_PO arrayPage;

	//private By queuePageGetStarted = By.xpath("//a[@href='queue']");
	@Given("the user has already logged in the home page using for Array")
	public void the_user_has_already_logged_in_the_home_page_using_for_Array(DataTable credTable) throws InterruptedException {
		
		List<Map<String, String>> credntialList = credTable.asMaps();
		String uName = credntialList.get(0).get("username");
		String pwd = credntialList.get(0).get("password");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		//Thread.sleep(10000);
		arrayPage = sigInPage.doLoginArrayPage(uName, pwd);
		//Thread.sleep(10000);
	}

	@Given("The user is on the Array Page after logged in")
	public void the_user_is_on_the_Array_page_after_logged_in() {
	    System.out.println("The user is in the Array Page after logging in with correct credentials");
	}
	@When("The user clicks a {string} link")
	public void the_user_clicks_a_page_link(String pageName) throws InterruptedException {
		arrayPage.doPageClick(pageName); 
		LoggerLoad.info("in the_user_clicks_a_page_link url: "+ arrayPage.getCurrentURL());
	}
	@Then("The user should be redirected to {string} Page")
	public void the_user_should_be_redirected_to_string_page(String link) {
	    String currentURL=arrayPage.getCurrentURL();
	    System.out.println("in the_user_should_be_redirected_to_string_page url: "+ arrayPage.getCurrentURL());
	    assertTrue(currentURL.contains(link), "User redirected to " +link+" page");
	}
	
	@Given("The user is on the {string} Page")
	public void the_user_is_on_the_python_page(String pageName) throws InterruptedException {
		//arrayPage.doPageClick(pageName); 
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/"+pageName);
		LoggerLoad.info("in the_user_is_on_the_python_page current url: "+ arrayPage.getCurrentURL());
		LoggerLoad.info("The user is on " +pageName+" page");
	}
	@When("The user clicks Try Here button of {string} Page")
	public void the_user_clicks_try_here_button_of_in_a_page(String pageName) {
		LoggerLoad.info("in try here current url: "+ arrayPage.getCurrentURL());
		arrayPage.doElementClick("tryHere"); 
	}
	@Then("The Page should have Python Editor")
	public void the_page_should_have_python_editor() throws InterruptedException {
	    //assertTrue(arrayPage.isEditorDisplayed(), "page has python editor");
	    assertEquals(arrayPage.isEditorDisplayed("pythonEditor"), true);
	}
	@Then("user gets the following links to explore Practice page")
	public void user_gets_the_following_links_to_explore_practice_page(DataTable topicsTable) {
	   List<String> expPracticeTopicList = topicsTable.asList();
	   LoggerLoad.info("Expected Practice List: " + expPracticeTopicList);
	   List<String> actPracticeTopicList = arrayPage.doGetLinkHeaders();
	   LoggerLoad.info("Actual Practice List: " + actPracticeTopicList);
	   Assert.assertTrue(expPracticeTopicList.containsAll(actPracticeTopicList));
	}
	
	@Then("The count of the practice links should be {int}")
	public void the_count_of_the_practice_links_should_be(Integer expectedCount) {
	   Assert.assertTrue(expectedCount == arrayPage.doGetCountNoOfLinks() );
	}

	@Then("The Page should have following elements")
	public void the_page_should_have_the_elements(DataTable elements) throws InterruptedException {
	    //assertTrue(arrayPage.isEditorDisplayed(), "page has python editor");
		//boolean allFound=false;
		List<String> elementsNotFound=arrayPage.areElementsDisplayed(elements);
		System.out.println(elementsNotFound.toString());
		System.out.println(elementsNotFound.toArray());
		//if(!elementsNotFound.isEmpty())
		assertEquals(elementsNotFound.isEmpty(),true);
		//assertTrue(elementsNotFound.isEmpty(),"All elements found");
		//assertFalse(!elementsNotFound.isEmpty(),"Did not find"+elementsNotFound.toString());

		// assertEquals(arrayPage.areElementsDisplayed(), true);
	}
	@Given("The user is on the Practice Questions Page")
	public void the_user_is_on_the_practice_questions_page()  {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/array/practice"); 
		//System.out.println("in the_user_is_on_the_python_page current url: "+ arrayPage.getCurrentURL());
	    //System.out.println("The user is on " +pageName+" page");
	}
	@When("The user clicks {string} with code {string}")
	public void the_user_clicks_element_in_a_page(String elementName,String withCode) {
		System.out.println("in try here current url: "+ arrayPage.getCurrentURL());
		System.out.println("clicking: "+elementName);
		if(withCode.equals("false")) 
		arrayPage.clearCode();
		
		arrayPage.doElementClick(elementName); 
	}
	@Then("Nothing happens to the page")
	public void nothing_happens_to_the_page() throws InterruptedException {
		boolean outputDisplayed=arrayPage.isOutputDisplayed();
		LoggerLoad.info("outputDisplayed: "+outputDisplayed);
		assertTrue(!outputDisplayed);
	}

	@Then("Error message {string}")
	public void no_error_message_is_displayed(String value) throws InterruptedException {
		boolean displayStatus=Boolean.valueOf(value);
		String message=arrayPage.getAlertMessage();
		assertEquals(!message.contains("No Alert"),displayStatus);
	}

	@When("The user writes {string} code for {string}")
	public void the_user_writes_invalid_code(String codeType, String qno) throws InterruptedException, IOException, ParseException {
		LoggerLoad.info("in try here current url: "+ arrayPage.getCurrentURL());
		//System.out.println("clicking: "+elementName);
		arrayPage.doPutCode("array",codeType,qno);
	}
	
	@Then("Ouput Displayed {string}")
	public void output_is_seen_in_the_console(String os) throws InterruptedException {
		boolean consoleStatus=Boolean.valueOf(os);
		boolean outputDisplayed=arrayPage.isOutputDisplayed();
		LoggerLoad.info("outputDisplayed: "+outputDisplayed);
		assertEquals(outputDisplayed,consoleStatus);
	}
	@Then("The user see an error message {string}")
	public void the_user_see_an_error_message(String expectedMsg) {
		assertTrue(arrayPage.isOutputMatches("output", expectedMsg));
	}
	
}
