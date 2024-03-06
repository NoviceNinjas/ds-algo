package stepdefinitions;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedList_PO;
import pageObjects.SignInPage_PO;


public class LinkedListSteps 
{
	private SignInPage_PO sigInPage = new SignInPage_PO(DriverFactory.getDriver());
	
	private LinkedList_PO linkedlistpage;
	
	public WebDriver driver;
	
	public String rbtn;
	
	@Given("The user has already logged in the home page using LinkedList")
	public void the_user_has_already_logged_in_the_home_page_using_LinkedList(DataTable credTable) {
		
		List<Map<String, String>> credntialList = credTable.asMaps();
		String uName = credntialList.get(0).get("username");
		String pwd = credntialList.get(0).get("password");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		linkedlistpage = sigInPage.doLoginLinkedListPage(uName, pwd);
		
	}
	
	@Given("The user is on the LinkedList Page after logged in")
	public void the_user_is_on_the_LinkedList_page_after_logged_in() {
	    System.out.println("The user is in the Home Page after logging in with correct crdentials");
	}
	
   @Given("The user clicks Introduction button")
	public void The_user_clicks_Introduction_button()
	 {
		  linkedlistpage.LL_introduction();
	 }
   
   @Given("The user clicks creating-linked-list button")
   public void The_user_clicks_Creating_Linked_LIst_button()
   {
	   linkedlistpage.LL_creatingLL();
   }
   
   @Given("The user clicks <Types of Linked List> button")
   public void The_user_clicks_types_of_Linked_list_button()
   {
	   linkedlistpage.LL_typeofLL();
   }
   
   @Given("The user clicks <Implement Linked List in Python> button")
   public void The_user_clicks_Implement_Linked_List_in_Python_button()
   {
	   linkedlistpage.LL_implementLLinPython();
   }
   
   @Given("The user clicks <Traversal> button")
   public void The_user_clicks_Traversal_button()
   {
	   linkedlistpage.LL_Traversal();
   }
   
   @Given("The user clicks <Insertion> button")
   public void The_user_clicks_Insertion_button()
   {
	   linkedlistpage.LL_Insertion();
   }
   
   @Given("The user clicks <Deletion> button")
   public void The_user_clicks_Deletion_button()
   {
	   linkedlistpage.LL_Deletion();
   }
   
   @When ("The user clicks <Practice Questions> button for LL")
   public void The_user_clicks_Practice_Questions_button_For_LL()
   {
	   linkedlistpage.PracticeQuestions();
   }
   
   @Given("The user clicks on Try Here button")

   public void The_user_clicks_Try_Here_button()
   {
	   linkedlistpage.LL_clicktryhere();
	 
   }
   
   @Given("The user is on the tryEditor page of Linked List page")
   public void The_user_is_on_the_tryEditor_page_of_Linked_List_page()
   {
	   //linkedlistpage.LL_introduction();
	   linkedlistpage.LL_clicktryhere();
	   
   }
   
	@When("The User writes Valid python code for Linked List")
	   
	  public void The_User_writes_Valid_python_code_for_Introduction_page() {
		  
		 
		  linkedlistpage.LL_validvalue();
	  }
	
	  @When("click run button in Linked List")
	  
	  public void click_run_button_in_Linked_List()
	  {
		  linkedlistpage.LL_runbutton();
	  }
	  
      @Then ("User is able to see the output in console in Linked List")
      public void User_is_able_to_see_the_output_in_console_in_console_in_Linked_List()
      {
    	  linkedlistpage.LL_verifyoutput();
    	 
      }
      
      @Then ("User is able to see the error msg in pop up window for Linked List")
      public void User_is_able_to_see_the_error_msg_in_pop_up_window_for_Linked_List()
      {
    	 // stackpage.verifyoutput();
    	  System.out.println ("AlertBox Message is:"+linkedlistpage.doCaptureAlertText());
      
      }
      
	  @Given ("The User writes InValid python code for Linked List page")
	   
	  public void The_User_writes_InValid_python_code_for_Linked_List_Page() {
		  
		 
		  linkedlistpage.LL_Invalidvalue();
	  }
	  
      @Given("The user is on the editor page withAlert  error message for Linked List")
      public void The_user_is_on_the_editor_page_withAlert_error_message_For_Linked_List()
      {
    	  //linkedlistpage.LL_introduction();
   	      //linkedlistpage.LL_clicktryhere();
   	     // linkedlistpage.LL_Invalidvalue();
    	  linkedlistpage.LL_runbutton();
      }
      
      @Given ("The user click the ok button in the alert window for Linked List")
      public void The_user_click_the_ok_button_in_the_alert_window_for_Linked_List()
      {
    	  System.out.println ("AlertBox Message is:"+linkedlistpage.doCaptureAlertText());
    	  linkedlistpage.doAcceptAlertBox();
    	  //linkedlistpage.doGetOutput();
    	  System.out.println ("AlertBox Message is:"+linkedlistpage.doGetOutput());
      }
      
   @Then ("The user is on the page having Editor and Run button")
   
   public void The_user_is_on_the_same_page_having_Editor_and_Run_button() 
   {
 	  
 	  
 	  boolean elementpresent= linkedlistpage.existsElement("//button[contains(text(),'Run')]");
 	  
 	  if(elementpresent==true)
 	  {
 	 	 System.out.println("Run button is present"); 
 	 	System.out.println("The user is on the same page having Run button"); 
 	  }
 	  else 
 	 	 System.out.println("Run button is NOT present"); 

 	} 
   
}