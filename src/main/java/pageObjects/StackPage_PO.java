 package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;

public class StackPage_PO {

		public WebDriver driver;
		
		//1. private By locators
		private By tryhere = By.xpath("//a[@href=’/tryEditor’]");
		private By txtout1= By.xpath("//*[@id='output']");
		private By runButton = By.xpath("//button[contains(text(),'Run')]");
		private By tryHere = By.xpath("//a[contains(text(),'Try here')]");
		private By tryEditorInput = By.xpath("//div/div/textarea");
		private By tryEditorOutput = By.xpath("//pre[@id='output']");
		private By implmntnbutton = By.xpath("//a[text()='Implementation']");
		private By stackLinks = By.xpath("//a[text()='Operations in Stack']");
		private By applications = By.xpath("//a[text()='Applications']");
		private By PracticeQuestions = By.xpath("//a[text()='Practice Questions']");
		private By operationinstackbtn = By.xpath("/html/body/div[2]/ul[1]/a");
		
		//2. public page constructor
		
		public StackPage_PO(WebDriver driver)
		{
			this.driver = driver;
		}
		
		//3. public page actions
		
		public int doGetCountNoOfLinks()
		{
			return driver.findElements(stackLinks).size();
			
		}
		
		public List<String> doGetLinkHeaders()
		{
			List<WebElement> stackPageLinkList = driver.findElements(stackLinks);
			List<String> myStackList = new ArrayList<String>();
			
			for(WebElement e : stackPageLinkList)
			{
				String text = e.getText();
				System.out.println("The Stack links: "+ text);
				myStackList.add(text);
			}
			return myStackList;
		}
		
		public void operationinstack()
		{
			driver.findElement(operationinstackbtn).click();
			printURL();
		
		}
		
		public void printURL()
		{
			String url=driver.getCurrentUrl();
			System.out.println("The actual URL of the page is: " +url);
		}
	
       public void clicktryhere() 
       {
    	  
    	   WebElement tryhere=driver.findElement(tryHere);
    	   tryhere.click();
    		
       }
       public void validvalue() 
       { 
    	
    	   driver.findElement(tryEditorInput).sendKeys("print 4");
       
       }
       

       public void Invalidvalue() 
   	{
   		
    	   driver.findElement(tryEditorInput).sendKeys("prin 4");	
   		
   	}
       
	public void runbutton() {
		driver.findElement(runButton).click();
		
		
	}

	public void verifyoutput() {
		String txtout =driver.findElement(By.xpath("//*[@id='output']")).getText();
		if (txtout!=null)
		{

	    	  System.out.println("User is able to see the output: " +txtout);
	    	 // System.out.println(txtout);  
		}
		else

	    	  System.out.println("User is not able to see the output");		
	}

	
	public String doCaptureAlertText()
	{
		return driver.switchTo().alert().getText();
	}
	
	public void doAcceptAlertBox()
	{
		driver.switchTo().alert().accept();
	}
	
	public String doGetOutput()
	{
		return driver.findElement(tryEditorOutput).getText();
	}

	public boolean existsElement(String id) {
	    try {
		       driver.findElement(By.xpath(id));
		  } catch (NoSuchElementException e) {
		      return false;
		  }
		   return true;
	}

	public void clickimplementation() {
		driver.findElement(implmntnbutton).click();
		
	}

	public void clickApplication() {
		driver.findElement(applications).click();
		
	}

	public void PracticeQuestions() 
	{
		driver.findElement(implmntnbutton).click();
		driver.findElement(PracticeQuestions).click();
		
	}
	
}
