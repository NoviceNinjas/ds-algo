package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataStructPage_PO {

	private WebDriver driver;
	
	private By dataStructTopic = By.partialLinkText("Time Complexity");
	private By runButton = By.xpath("//button[contains(text(),'Run')]");
	private By tryHere = By.xpath("//a[contains(text(),'Try here')]");
	private By tryEditorInput = By.xpath("//div/div/textarea");
	//private By tryEditorOutput = By.xpath("//pre[@id='output']");
	private By practiceQuestionsList = By.xpath("//div/a[@class='list-group-item']");
	
	private By practiceQuesLink = By.partialLinkText("Practice Questions");
	
	public DataStructPage_PO(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void doClickTimeComplexityLink()
	{
		driver.findElement(dataStructTopic).click();
	}
	
	public String doGetPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void doClickButton()
	{
		driver.findElement(tryHere).click();
	}
	
	public void doClickLink()
	{
		driver.findElement(practiceQuesLink).click();
	}
	
	public int doGetCountOfPracticeQuestions()
	{
		List<WebElement> practiceQuesList = driver.findElements(practiceQuestionsList);
		
		return practiceQuesList.size();
		
		
	}
	
	public void doClickTryHereBttn()
	{
		driver.findElement(tryHere).click();
	}
	
	public void doSendInput(String str)
	{
		driver.findElement(tryEditorInput).sendKeys(str);
	}
	
	public void doClickRunBttn()
	{
		driver.findElement(runButton).click();
	}
	
	public String doGetCurrentPageUrl()
	{
		return driver.getCurrentUrl();
	}
}