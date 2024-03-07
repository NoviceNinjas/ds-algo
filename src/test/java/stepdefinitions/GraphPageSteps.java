package stepdefinitions;



import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.junit.Assert;

import com.qa.Utils.LoggerLoad;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage_PO;
import pageObjects.SignInPage_PO;

public class GraphPageSteps {
	private SignInPage_PO sigInPage = new SignInPage_PO(DriverFactory.getDriver());
	private GraphPage_PO graphPage;

	@Given("the user has already logged in the home page using for Graph")
	public void the_user_has_already_logged_in_the_home_page_using_for_Graph(DataTable credTable) throws InterruptedException {
		
		List<Map<String, String>> credntialList = credTable.asMaps();
		String uName = credntialList.get(0).get("username");
		String pwd = credntialList.get(0).get("password");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		graphPage = sigInPage.doLoginGraphPage(uName, pwd);
	}

	@Given("The user is on the Graph Page after logged in")
	public void the_user_is_on_the_Graph_page_after_logged_in() {
	   LoggerLoad.info("The user is in the Graph Page after logging in with correct credentials");
	}
	@When("The user clicks a {string} link in graph")
	public void  the_user_clicks_a_page_link_in_graph(String pageName) throws InterruptedException {
		graphPage.doPageClick(pageName); 
		LoggerLoad.info("in the_user_clicks_a_page_link url: "+ graphPage.getCurrentURL());
	}
	@Then("The user should be redirected to {string} Page in graph")
	public void the_user_should_be_redirected_to_string_page_graph(String link) {
	    String currentURL=graphPage.getCurrentURL();
	    System.out.println("in the_user_should_be_redirected_to_string_page url: "+ graphPage.getCurrentURL());
	    Assert.assertTrue(currentURL.contains(link));
	}
	@Given("The user is on the {string} Page in graph")
	public void the_user_is_on_the_python_page_in_graph(String pageName) throws InterruptedException {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/"+pageName);
		LoggerLoad.info("in the_user_is_on_the_python_page current url: "+ graphPage.getCurrentURL());
		LoggerLoad.info("The user is on " +pageName+" page");
	}
	@When("The user clicks Try Here button of {string} Page in graph")
	public void the_user_clicks_try_here_button_of_in_a_page_in_graph(String pageName) {
		LoggerLoad.info("in try here current url: "+ graphPage.getCurrentURL());
		graphPage.doElementClick("tryHere"); 
	}
	
	@When("The user clicks {string} with code {string} in graph")
	public void the_user_clicks_element_in_a_page_in_graph(String elementName,String withCode) {
		System.out.println("in try here current url: "+ graphPage.getCurrentURL());
		System.out.println("clicking: "+elementName);
		if(withCode.equals("false")) 
			graphPage.clearCode();
		
		graphPage.doElementClick(elementName); 
	}
	
	@When("The user writes {string} code for {string} in graph")
	public void the_user_writes_invalid_code_in_graph(String codeType, String qno) throws InterruptedException, IOException, ParseException {
		LoggerLoad.info("in try here current url: "+ graphPage.getCurrentURL());
		graphPage.doPutCode("graph",codeType,qno);
	}
	@Then("Error message {string} in graph")
	public void no_error_message_is_displayed_in_graph(String value) throws InterruptedException {
		boolean displayStatus=Boolean.valueOf(value);
		String message=graphPage.getAlertMessage();
		Assert.assertEquals(!message.contains("No Alert"),displayStatus);
	}
	@Then("Ouput Displayed {string} in graph")
	public void output_is_seen_in_the_console_in_graph(String os) throws InterruptedException {
		boolean consoleStatus=Boolean.valueOf(os);
		boolean outputDisplayed=graphPage.isOutputDisplayed();
		LoggerLoad.info("outputDisplayed: "+outputDisplayed);
		Assert.assertEquals(outputDisplayed,consoleStatus);
	}
	@Then("The Page should have Python Editor in graph")
	public void the_page_should_have_python_editor_in_graph() throws InterruptedException {
	    Assert.assertEquals(graphPage.isEditorDisplayed("pythonEditor"), true);
	}
	@When("The user clicks ok on alert")
	public void the_user_clicks_ok_on_alert() throws InterruptedException, IOException, ParseException {
		graphPage.doAlertOk();
	}
	
	@Then("No change in code")
	public void no_change_in_code() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(graphPage.isCodePresent());
	}
}
