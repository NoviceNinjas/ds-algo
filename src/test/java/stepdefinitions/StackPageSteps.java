package stepdefinitions;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SignInPage_PO;
import pageObjects.StackPage_PO;

public class StackPageSteps {
	private SignInPage_PO sigInPage = new SignInPage_PO(DriverFactory.getDriver());
	
	private StackPage_PO stackpage;
	
	public WebDriver driver;
	
	@Given("The user has already logged in the home page using stack")
	public void the_user_has_already_logged_in_the_home_page_using_stack(DataTable credTable) {
		
		List<Map<String, String>> credntialList = credTable.asMaps();
		String uName = credntialList.get(0).get("username");
		String pwd = credntialList.get(0).get("password");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		stackpage = sigInPage.doLoginStackPage(uName, pwd);
		
	}

	@Given("The user is on the Stack Page after logged in")
	public void the_user_is_on_the_Stack_page_after_logged_in() {
	    System.out.println("The user is in the Home Page after logging in with correct crdentials");
	}

	

	   @Given("The user clicks Operations in Stack button")
	   public void the_user_clicks_Operations_in_Stack_button()
	   {
		   stackpage.operationinstack();
		   
	   }
	   
	   @Then("The user should be directed to Operations in Stack Page")
	   public void The_user_should_be_directed_to_Operations_in_Stack_Page() 
	   {
		   //System.out.println("Operation in stack page is opened");
	      //throw new io.cucumber.java.PendingException();
	   }

	   @Given("The user is in the Operations in Stack page")
	   public void The_user_is_in_the_Operation_in_Stack_page()
	   {
		   stackpage.operationinstack();
	   }
	   
	      @Given("The user clicks Try Here button")

	       public void The_user_clicks_Try_Here_button()
	       {
	    	  stackpage.clicktryhere();
	    	 
	       }
	 
	  @Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	  
	  public void The_user_should_be_redirected_to_a_page_having_an_tryEditor_with_a_Run_button_to_test()	
	  {
		  
		 // System.out.println ("user is on tryEditor with a Run button ");
	  }
	  
	  
	  @Given("The user is on the tryEditor page of Operations in Stack page")
	  public void The_user_is_on_the_tryEditor_page_of_Operations_in_Stack_page()
	  {
		  stackpage.operationinstack();
		  stackpage.clicktryhere();
	  }
	  
	  @Given ("The User writes Valid python code")
	   
	  public void The_User_writes_Valid_python_code() {
		  
		 
		  stackpage.validvalue();
	  }
	  @When("click run button")
	  
	  public void click_run_button()
	  {
		  stackpage.runbutton();
	  }
	  
	  
      @Then ("User is able to see the output in console")
      public void User_is_able_to_see_the_output_in_console()
      {
    	  stackpage.verifyoutput();
    	 // System.out.println("New Output is:"+stackpage.doGetOutput());
      
      }
	  
	  
	  
	  @Given ("The User writes InValid python code")
	   
	  public void The_User_writes_InValid_python_code() {
		  
		 
		  stackpage.Invalidvalue();
	  }

	  
	  
      @Then ("User is able to see the error msg in pop up window")
      public void User_is_not_able_to_see_the_output_in_console()
      {
    	 // stackpage.verifyoutput();
    	  //System.out.println ("AlertBox Message is:"+stackpage.doCaptureAlertText());
      
      }

      @Given ("The user click the ok button in the alert window")
      public void The_user_click_the_ok_button_in_the_alert_window()
      {
    	 // System.out.println ("AlertBox Message is:"+stackpage.doCaptureAlertText());
    	  stackpage.doAcceptAlertBox();
    	  stackpage.doGetOutput();
    	  //System.out.println ("AlertBox Message is:"+stackpage.doGetOutput());
      }
      
      @Then ("The user is on the same page having Editor and Run button")
      
      public void The_user_is_on_the_same_page_having_Editor_and_Run_button() 
      {
    	  
    	  
    	  boolean elementpresent= stackpage.existsElement("//button[contains(text(),'Run')]");
    	  
    	   
    	 	// System.out.println("Run button is NOT present"); 

    	} 	
    	 	
      
      @When ("The user clicks <Implementation> button")
      public void The_user_clicks_Implementation_button()
      {

    	  stackpage.clickimplementation();
      }
      
      @Given ("The user is in the Implementation page")
      public void The_user_is_in_the_Implementation_page()
      {
    	  stackpage.clickimplementation();
      }
      
      @Then ("The user should be directed to <Implementation> Page")
      public void The_user_should_be_directed_to_implementation_page()
      {
    	  stackpage.clickimplementation();
      }
      
      @Given ("The user is on the tryEditor screen of Implementation page")
      public void The_user_is_on_the_TryEditor_screen_of_Implementation_page()
      {
    	  stackpage.clickimplementation();
    	  stackpage.clicktryhere();
      }
      
      @When ("The User writes Valid python code in Implementation page")
      public void The_user_writes_Valid_python_code__in_Implementation_page()
      {
    	  stackpage.validvalue();
      }
      
      @When("The User writes InValid python code in Implementation page")
      public void The_user_writes_InValid_python_code_in_Implementation_page()
      {
    	  stackpage.Invalidvalue();
      }
      
      @Given("The user is on the editor page of Implementation with Alert  error message")
      public void The_user_is_on_the_editor_page_of_Implementation_with_Alert_error_message()
      {
    	  stackpage.clickimplementation();
    	  stackpage.clicktryhere();
    	  stackpage.Invalidvalue();
    	  stackpage.runbutton();
      }
      
      @Given("The user is on the editor page withAlert  error message")
      public void The_user_is_on_the_editor_page_withAlert_error_message()
      {
		  stackpage.operationinstack();
		  stackpage.clicktryhere();
		  stackpage.Invalidvalue();
		  stackpage.runbutton();
      }
      
      @When ("The user clicks <Applications> button")
      public void The_user_clicks_Applications_button()
      {
    	  stackpage.clickApplication();
      }
      
      @When ("The user is in the Applications page")
      public void The_user_is_in_the_Applications_page()
      {
    	  stackpage.clickApplication();
    	  
      }
      
      @Given ("The user is on the tryEditor screen of Applications page")
      public void The_user_is_on_the_tryEditor_screen_of_Applications_page()
      {
    	  stackpage.clickApplication();
    	  stackpage.clicktryhere();
      }
      
      @When ("The User writes Valid python code in Applications page")
      public void The_User_writes_Valid_python_code_in_Applications_page()
      {
    	  stackpage.validvalue();
      }
      

      
      @When ("The User writes InValid python code in Applications page")
      public void The_User_writes_InValid_python_code_in_Applications_page()
      {
    	  stackpage.Invalidvalue();
      }
      
      @Given ("The user is on the editor page of Application with Alert  error message")
      public void The_user_is_on_the_editor_page_of_Application_with_Alert_error_message()
      {
    	  stackpage.clickApplication();
    	  stackpage.clicktryhere();
    	  stackpage.Invalidvalue();
    	  stackpage.runbutton();
      }
      
      @When ("The user clicks <Practice Questions> button")
      public void The_user_clicks_Practice_Questions_button()
      {
    	  stackpage.PracticeQuestions();
      }
}
