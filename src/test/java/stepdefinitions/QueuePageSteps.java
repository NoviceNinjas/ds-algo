package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pageObjects.QueuePage_PO;
import pageObjects.SignInPage_PO;

public class QueuePageSteps {
	private SignInPage_PO sigInPage = new SignInPage_PO(DriverFactory.getDriver());
	
	private QueuePage_PO queuePage;
	
	@Given("The user has already logged in the home page using")
	public void the_user_has_already_logged_in_the_home_page_using(DataTable credTable) throws InterruptedException {
		
		List<Map<String, String>> credntialList = credTable.asMaps();
		String uName = credntialList.get(0).get("username");
		String pwd = credntialList.get(0).get("password");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		//Thread.sleep(10000);
		queuePage = sigInPage.doLoginQueuePage(uName, pwd);
		//Thread.sleep(10000);
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

	@Then("The count of the links should be {int}")
	public void the_count_of_the_links_should_be(Integer expectedCount) {
	   Assert.assertTrue(expectedCount == queuePage.doGetCountNoOfLinks() );
	}

}
