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
}
