package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import com.qa.Utils.ExcelReader;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePage_PO;
import pageObjects.SignInPage_PO;

public class QueuePageSteps {
	private SignInPage_PO sigInPage = new SignInPage_PO(DriverFactory.getDriver());
	
	private QueuePage_PO queuePage;
	
	static String actTitle;
	static String actUrl;
	static String invalidCode="abcdef";
	static String validCode = "print(\"Hello\")";
	static String alertBoxText ;
	static String consoleOutput;
	String pythonCode;
	static String expectedOutput;
	
	static String abc  = "def search(input_list, num):\r\n	output = 'Number is Not Found'\r\n	for x in input_list:\r\n		if x == num:\r\n			output = 'Number is found'\r\n	print(str(num) + ' is '+output)\r\ninput_list=[12,23,45,56,67]\r\nnum=45\r\nsearch(input_list,num)" ;
	
	@Given("The user has already logged in the home page using")
	public void the_user_has_already_logged_in_the_home_page_using(DataTable credTable) {
		
		List<Map<String, String>> credntialList = credTable.asMaps();
		String uName = credntialList.get(0).get("username");
		String pwd = credntialList.get(0).get("password");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		queuePage = sigInPage.doLoginQueuePage(uName, pwd);
		
	}

	@Given("The user is on the Queue Page after logged in")
	public void the_user_is_on_the_Queue_page_after_logged_in() {
	    System.out.println("The user is in the Home Page after logging in with correct crdentials");
	}

	
	

	@Then("user gets the following links to explore Queue page")
	public void user_gets_the_following_links_to_explore_queue_page(DataTable topicsTable) {
	   List<String> expQueueTopicList = topicsTable.asList();
	   System.out.println("Expected Queue Topic List: " + expQueueTopicList);
	   List<String> actQueueTopicList = queuePage.doGetLinkHeaders();
	   System.out.println("Actual Queue Topic List: " + actQueueTopicList);
	   Assert.assertTrue(expQueueTopicList.containsAll(actQueueTopicList));
	}

	@Then("The count of the links should be {int} on Queue Page")
	public void the_count_of_the_links_should_be_on_queue_page(Integer expectedCount) {
	   Assert.assertTrue(expectedCount == queuePage.doGetCountNoOfLinks() );
	}
	
	
	@When("The user clicks {string} button on Queue Page")
	public void the_user_clicks_button_on_queue_page(String string) {
		
		actTitle = queuePage.doGetLinkByStringNameAndClick(string);
		//System.out.println("The title inside when is: " + actTitle);
	    
	}

	@Then("The user should be directed to {string} on Queue Page")
	public void the_user_should_be_directed_to_on_queue_page(String string) {
		
		
		Assert.assertTrue(actTitle.contains(string));
		
	    
	}
	
		
	@When("The user clicks {string} link of Queue Page followed by {string} link")
	public void the_user_clicks_link_of_queue_page_followed_by_link(String string, String string2) {
	 
		queuePage.doClickOnPageByString(string);
	}

	

	@Then("The user should be redirected to a page having an tryEditor of Queue page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_of_queue_page() {
		
		actUrl = queuePage.doGetUrlOfCurrentPage();
		
		Assert.assertTrue(actUrl.contains("tryEditor"));
			    
	}

	@And("the page should have a Run button to test of Queue page")
	public void the_page_should_have_a_run_button_to_test_of_queue_page() {
	    
	    Assert.assertTrue(queuePage.isButtonDisplayed());
	}

	//////////////////////////////////////////////////////////////////////
	
	
	@When("The user writes the invalid python code on Queue Page")
	public void the_user_writes_the_invalid_python_code_on_queue_page() {
	    
	    queuePage.DoSendKeys(invalidCode);
	}
	
	

	@When("The user clicks the run button on Queue Page")
	public void the_user_clicks_the_run_button_on_queue_page() {
		queuePage.doButtonClick();
	   
	}

	@Then("The User is able to see the error message in pop up window on Queue Page")
	public void the_user_is_able_to_see_the_error_message_in_pop_up_window_on_queue_page() {
		
		alertBoxText = queuePage.doCaptureAlertText();
		
		System.out.println("The User is able to see the error message: "+ alertBoxText);
		
		Assert.assertTrue(alertBoxText.contains("NameError"));
	    
	}

	@When("The user click the ok button in the alert window on Queue Page")
	public void the_user_click_the_ok_button_in_the_alert_window_on_queue_page() {
		queuePage.doAcceptAlertBox();
		
	}	
	
	@When("The user writes the valid python code on Queue Page")
	public void the_user_writes_the_valid_python_code_on_queue_page() {
		 queuePage.DoSendKeys(validCode);
	}

	@Then("User is able to see the correct output in console on Queue Page")
	public void user_is_able_to_see_the_correct_output_in_console_on_queue_page() {
		consoleOutput =  queuePage.doGetOutput();
		System.out.println("The output from the console is: " + consoleOutput);
		//Do write assertion here
	}

/////////////////////////////////////////////////
	
	@When("The user writes the valid python code on Queue Page from {string} and {int}")
	public void the_user_writes_the_valid_python_code_on_queue_page_from_and(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData =  reader.getData("./src/test/resources/TestData/TestData.xlsx", sheetName);
		pythonCode = testData.get(rowNum).get("PythonCode") ;
						
		expectedOutput = testData.get(rowNum).get("Expected Output");
		
		System.out.println("The code is: "+ '\n' + pythonCode);
		System.out.println("The expected output is: "+ '\n' + expectedOutput);
		
		 queuePage.DoSendKeys(pythonCode);
	}

	@Then("User is able to see the expected output in console on Queue Page")
	public void user_is_able_to_see_the_expected_output_in_console_on_queue_page() {
		
		consoleOutput =  queuePage.doGetOutput();
		System.out.println("The output from the console is: " + consoleOutput);
	    
	}


}