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

import pageObjects.TreePage_PO;
import pageObjects.SignInPage_PO;

public class TreePageSteps {
	private SignInPage_PO sigInPage = new SignInPage_PO(DriverFactory.getDriver());
	private TreePage_PO treePage;

	//private By queuePageGetStarted = By.xpath("//a[@href='queue']");
	@Given("the user has already logged in the home page using for tree")
	public void the_user_has_already_logged_in_the_home_page_using_for_tree(DataTable credTable) throws InterruptedException {
		
		List<Map<String, String>> credntialList = credTable.asMaps();
		String uName = credntialList.get(0).get("username");
		String pwd = credntialList.get(0).get("password");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		//Thread.sleep(10000);
		treePage = sigInPage.doLoginTreePage(uName, pwd);
		//Thread.sleep(10000);
	}

	@Given("The user is on the tree Page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
	    System.out.println("The user is in the tree Page after logging in with correct credentials");
	}
	@When("The user clicks a {string} link in tree")
	public void the_user_clicks_a_page_link_in_tree(String pageName) throws InterruptedException {
		treePage.doPageClick(pageName); 
		LoggerLoad.info("in the_user_clicks_a_page_link url: "+ treePage.getCurrentURL());
	}
	@Then("The user should be redirected to {string} Page in tree")
	public void the_user_should_be_redirected_to_string_page_tree(String link) {
	    String currentURL=treePage.getCurrentURL();
	 //   System.out.println("in the_user_should_be_redirected_to_string_page url: "+ treePage.getCurrentURL());
	    Assert.assertTrue(currentURL.contains(link));
	}
	@Given("The user is on the {string} Page in tree")
	public void the_user_is_on_the_python_page_in_tree(String pageName) throws InterruptedException {
		//arrayPage.doPageClick(pageName); 
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/"+pageName);
		LoggerLoad.info("in the_user_is_on_the_python_page current url: "+ treePage.getCurrentURL());
		LoggerLoad.info("The user is on " +pageName+" page");
	}
	@When("The user clicks Try Here button of {string} Page in tree")
	public void the_user_clicks_try_here_button_of_in_a_page_in_tree(String pageName) {
		LoggerLoad.info("in try here current url: "+ treePage.getCurrentURL());
		treePage.doElementClick("tryHere"); 
	}
	
	@When("The user clicks {string} with code {string} in tree")
	public void the_user_clicks_element_in_a_page_in_tree(String elementName,String withCode) {
		//System.out.println("in try here current url: "+ treePage.getCurrentURL());
		//System.out.println("clicking: "+elementName);
		if(withCode.equals("false")) 
			treePage.clearCode();
		
		treePage.doElementClick(elementName); 
	}
	
	@When("The user writes {string} code for {string} in tree")
	public void the_user_writes_invalid_code_in_tree(String codeType, String qno) throws InterruptedException, IOException, ParseException {
		LoggerLoad.info("in try here current url: "+ treePage.getCurrentURL());
		//System.out.println("clicking: "+elementName);
		treePage.doPutCode("tree",codeType,qno);
	}
	@Then("Error message {string} in tree")
	public void no_error_message_is_displayed_in_tree(String value) throws InterruptedException {
		boolean displayStatus=Boolean.valueOf(value);
		String message=treePage.getAlertMessage();
		Assert.assertEquals(!message.contains("No Alert"),displayStatus);
	}
	@Then("Ouput Displayed {string} in tree")
	public void output_is_seen_in_the_console_in_tree(String os) throws InterruptedException {
		boolean consoleStatus=Boolean.valueOf(os);
		boolean outputDisplayed=treePage.isOutputDisplayed();
		LoggerLoad.info("outputDisplayed: "+outputDisplayed);
		Assert.assertEquals(outputDisplayed,consoleStatus);
	}
	@Then("The Page should have Python Editor in tree")
	public void the_page_should_have_python_editor_in_tree() throws InterruptedException {
	    //assertTrue(arrayPage.isEditorDisplayed(), "page has python editor");
		Assert. assertEquals(treePage.isEditorDisplayed("pythonEditor"), true);
	}
	@When("The user clicks ok on alert in tree")
	public void the_user_clicks_ok_on_alert() throws InterruptedException, IOException, ParseException {
		treePage.doAlertOk();
	//	Thread.sleep(10000);
	}
	
	@Then("No change in code in tree")
	public void no_change_in_code_in_tree() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(treePage.isCodePresent());
	}
}
