 package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;

public class LinkedList_PO 
{
	
	public WebDriver driver;
	
	//1. private By locators
	public By runButton = By.xpath("//button[contains(text(),'Run')]");
	private By tryHere = By.xpath("//a[contains(text(),'Try here')]");
	private By tryEditorInput = By.xpath("//div/div/textarea");
	private By tryEditorOutput = By.xpath("//pre[@id='output']");
	//private By PracticeQuestions = By.xpath("//a[text()='Practice Questions']");
	private By introduction= By.xpath("//a[text()='Introduction']");
	private By creatingLL= By.xpath("//a[text()='Creating Linked LIst']");
	private By typeofLL= By.xpath("//a[text()='Types of Linked List']");
	private By implementLLinPython= By.xpath("//a[text()='Implement Linked List in Python']");
	private By Traversal= By.xpath("//a[text()='Traversal']");
	private By Insertion= By.xpath("//a[text()='Insertion']");
	private By Deletion= By.xpath("//a[text()='Deletion']");
	private By practice= By.xpath("//a[text()='Practice Questions']");
	//2. public page constructor
	
	public LinkedList_PO(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public boolean existsElement(String id) {
	    try {
		       driver.findElement(By.xpath(id));
		  } catch (NoSuchElementException e) {
		      return false;
		  }
		   return true;
	}
	

	public void LL_introduction() {
		
		driver.findElement(introduction).click();
	}
	
	public void LL_creatingLL() {
		
		driver.findElement(creatingLL).click();
	}
	
	public void LL_implementLLinPython(){
		driver.findElement(implementLLinPython).click();
	}
	
	public void LL_Traversal(){
		driver.findElement(Traversal).click();
	}

	public void LL_Insertion(){
		driver.findElement(Insertion).click();
	}
	
	public void LL_Deletion(){
		driver.findElement(Deletion).click();
	}
	
	public void LL_typeofLL(){
		driver.findElement(typeofLL).click();
	}
	
	
	public void LL_clicktryhere() {
 	   driver.findElement(tryHere).click();;
 	  	
	}

	public void LL_validvalue() {
		driver.findElement(tryEditorInput).sendKeys("print 4");
		
	}

	public void LL_runbutton() {
		driver.findElement(runButton).click();
		
	}
	
	public void LL_Invalidvalue() {
		driver.findElement(tryEditorInput).sendKeys("prin 4");
		
	}
	

	public void LL_verifyoutput() {
		String txtout =driver.findElement(By.xpath("//*[@id='output']")).getText();
		if (txtout!=null)
		{

	    	  System.out.println("User is able to see the output: " +txtout); 
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

	public void PracticeQuestions() {
		driver.findElement(practice).click();;
		
	}

	
}