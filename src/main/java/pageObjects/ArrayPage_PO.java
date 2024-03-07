package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.python.util.PythonInterpreter;

import com.qa.Utils.ElementUtil;
import com.qa.Utils.ExcelSheetHandler;

import io.cucumber.datatable.DataTable;

public class ArrayPage_PO {
private WebDriver driver;
	
	//1. private By locators
    private By practiceLinks = By.xpath("//div[@class = 'list-group']/a");
	//2. public page constructor
	private static By arrayInPythonLink = By.linkText("Arrays in Python");
	private static By arrayUsingListLink = By.linkText("Arrays Using List");
	private static By basicOperationInListsLink= By.linkText("Basic Operations in Lists");
	private static By applicationsOfArrayLink= By.linkText("Applications of Array");
	private static By practiceQuestionsLink= By.linkText("Practice Questions");
	private static By searchTheArrayLink= By.linkText("Search the array");
	private static By maxConsecutiveOnesLink= By.linkText("Max Consecutive Ones");
	private static By evenNoDigitsLink= By.linkText("Find Numbers with Even Number of Digits");
	private static By sqOfSortedArrayLink= By.linkText("Squares of a Sorted Array");
	private static By editor=By.xpath("//form[@id='answer_form']/div/div/div/*");
	private static By pythonEditor=By.xpath("//*[@id=\"answer_form\"]/div");
	private static By run = By.xpath("//*[@id=\"answer_form\"]/button");
	private static By submit = By.xpath("//*[@id=\"answer_form\"]/input[2]");
	private static By question = By.id("questionText");
	private static By output = By.id("output");
	private static By tryHere = By.partialLinkText("Try here");
	private static Map<String, By> pageNamemap; 
    static
    { 
    	pageNamemap = new HashMap<>(); 
    	pageNamemap.put("Arrays in Python", arrayInPythonLink); 
    	pageNamemap.put("Arrays Using List", arrayUsingListLink);
    	pageNamemap.put("Basic Operations in Lists", basicOperationInListsLink);
    	pageNamemap.put("Applications of Array", applicationsOfArrayLink);
    	pageNamemap.put("Practice Questions", practiceQuestionsLink);
    	pageNamemap.put("Search the array", searchTheArrayLink);
    	pageNamemap.put("Max Consecutive Ones", maxConsecutiveOnesLink);
    	pageNamemap.put("Find Numbers with Even Number of Digits", evenNoDigitsLink);
    	pageNamemap.put("Squares of a Sorted Array", sqOfSortedArrayLink);
    } 
	private static Map<String, By> elementMap; 
    static
    { 
    	elementMap = new HashMap<>(); 
    	elementMap.put("editor", editor); 
    	elementMap.put("run", run);
    	elementMap.put("submit", submit);
    	elementMap.put("question", question);
    	elementMap.put("tryHere", tryHere);
    	elementMap.put("pythonEditor", pythonEditor);
    	elementMap.put("editor", editor);
    } 
   ElementUtil eleUtil=new ElementUtil();
	
	public ArrayPage_PO(WebDriver driver)
	{
		this.driver = driver;
	}
	public void doPageClick(String pageName) throws InterruptedException
	{
		
		driver.findElement(pageNamemap.get(pageName)).click();
	}
	public String getCurrentURL()
	{
		String currentURL=driver.getCurrentUrl();
		System.out.println("curentURL:"+currentURL);
		return currentURL;
	}
	public void doElementClick(String element)
	{

		driver.findElement(elementMap.get(element)).click();
		
	}
	public void clearCode() {
		driver.findElement(elementMap.get("editor")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		driver.findElement(elementMap.get("editor")).sendKeys(Keys.BACK_SPACE);
	}

	public void doPutCode(String moduleName,String codeType,String qno)  throws IOException, InterruptedException, ParseException
	{
		clearCode();
		if(codeType.equals("valid")) {
		JSONArray codeLines=eleUtil.readCodeFromJSON(moduleName,qno);
		for(Object codeLine:codeLines) {
			JSONObject codeObj=(JSONObject)codeLine;
			String noOfSpaces=(String) codeObj.get("spaces");
			Integer spaceNum=Integer.parseInt(noOfSpaces);
			String code=(String)codeObj.get("code");			
			if(!code.contains("Hi")) { //contains def
			driver.findElement(elementMap.get("editor")).sendKeys(Keys.ENTER);
			}
			int i=0;
			System.out.println(spaceNum);
			while(i<spaceNum) {							
				driver.findElement(elementMap.get("editor")).sendKeys(Keys.BACK_SPACE);
				i++;
			}
			driver.findElement(elementMap.get("editor")).sendKeys(code);
			
			}
		}
		else {
			//TODO change "Hi" to invalid code
			driver.findElement(elementMap.get("editor")).sendKeys("Hi");
		}
	}
	
	
	public boolean isEditorDisplayed(String ele) throws InterruptedException
	{
		
		if(!driver.findElement(elementMap.get(ele)).isDisplayed()) {
			return false;
		}
		return true;
	}
	public List<String> areElementsDisplayed(DataTable elements) 
	{
		 List<String> elementList = elements.asList();
		 //List<String> elementsFound = elements.asList();
		 List<String> elementsNotFound = new ArrayList<String>();
		 for(String e : elementList) {
			 if(!driver.findElement(elementMap.get(e)).isDisplayed()) {
				 elementsNotFound.add(e);
			}
		}
		return elementsNotFound;
	}
	public List<String> doGetLinkHeaders()
	{
		List<WebElement> practicePageLinkList = driver.findElements(practiceLinks);
		List<String> myPracticeList = new ArrayList<String>();
		
		for(WebElement e : practicePageLinkList)
		{
			String text = e.getText();
			System.out.println("The Practice links: "+ text);
			myPracticeList.add(text);
		}
		return myPracticeList;
	}
	public int doGetCountNoOfLinks()
	{
		return driver.findElements(practiceLinks).size();
		
	}
	public boolean isOutputDisplayed() throws InterruptedException
	{
		if(!driver.findElement(output).isDisplayed()) {
			return false;
		}
		return true;
	}
	public boolean isAlertPresent()
	{
	try
	{
	driver.switchTo().alert();
	return true;
	} // try
	catch (NoAlertPresentException Ex)
	{
	return false;
	} // catch
	} // isAlertPresent()
	public String getAlertMessage() throws InterruptedException
	{
		if(isAlertPresent()) {
			Alert alert = driver.switchTo().alert();
			String alertText=new String();
			alertText = alert.getText();
			alert.dismiss();
			return alertText;
		}
		else {
			String msg="No Alerts!!";
			return msg;
		}
		
		
	}
	
	public boolean isOutputMatches(String element,String expectedOutput)
	{
		String outputGenerated=driver.findElement(editor).getText();
		if(!outputGenerated.equals(expectedOutput)) {
			return false;
		}
		return true;
	}
	
	
}
