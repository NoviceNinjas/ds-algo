package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QueuePage_PO {
	
	private WebDriver driver;
	
	//1. private By locators
	
	private By queueLinks = By.xpath("//div[not(@class = 'navbar-nav')]/ul/a");
	private By runButton = By.xpath("//button[contains(text(),'Run')]");
	private By tryHere = By.xpath("//a[contains(text(),'Try here')]");
	private By tryEditorInput = By.xpath("//div/div/textarea");
	private By tryEditorOutput = By.xpath("//pre[@id='output']");
	
	
	
	//2. public page constructor
	
	public QueuePage_PO(WebDriver driver)
	{
		this.driver = driver;
	}
	

	//3. public page actions
	
	
	public int doGetCountNoOfLinks()
	{
		return driver.findElements(queueLinks).size();
		
	}
	
	public List<String> doGetLinkHeaders()
	{
		List<WebElement> queuePageLinkList = driver.findElements(queueLinks);
		List<String> myQueueList = new ArrayList<String>();
		
		for(WebElement e : queuePageLinkList)
		{
			String text = e.getText();
			System.out.println("The Queue links: "+ text);
			myQueueList.add(text);
		}
		return myQueueList;
	}
	
	
	public String doGetLinkByStringNameAndClick(String str)
	{
//		String myText = driver.findElement(By.partialLinkText(str)).getText();
//		System.out.println("The href located is: " + myText);
		driver.findElement(By.partialLinkText(str)).click();
		String myTitle = driver.getCurrentUrl();
		//System.out.println("The url inside PO is: " + myTitle);
		return myTitle;
	}
	
	public void doClickOnPageByString(String str1)
	{
		
		driver.findElement(By.linkText(str1)).click();
		driver.findElement(tryHere).click();
		
		
	}
	

	public String doGetUrlOfCurrentPage()
	{
		System.out.println("The url of the page inside po is: " + driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}
	
	public boolean isButtonDisplayed()
	{
		return driver.findElement(runButton).isDisplayed();
	}
	
	public void DoSendKeys(String str)
	{
		driver.findElement(tryEditorInput).sendKeys(str);
	}
	
	public void doButtonClick()
	{
		driver.findElement(runButton).click();
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
}