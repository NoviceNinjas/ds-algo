package pageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import com.qa.Utils.ElementUtil;

public class TreePage_PO {
	private WebDriver driver;
	private static Map<String, By> pageNamemap; 
	private static By treeLink = By.linkText("tree");
	private static By practiceQuestionsLink= By.linkText("Practice Questions");
	private static By oftLink = By.linkText("Overview of Trees"); 
	private static By terminologiesLink = By.linkText("Terminologies"); 
	private static By totLink = By.linkText("Types of Trees"); 
	private static By ttLink = By.linkText("Tree Traversals"); 
	private static By tiLink = By.linkText("Traversals-Illustration"); 
	private static By btLink = By.linkText("Binary Trees"); 
	private static By tbtLink = By.linkText("Types of Binary Trees"); 
	private static By ipLink = By.linkText("Implementation in Python"); 
	private static By btttLink = By.linkText("Binary Tree Traversals"); 
	private static By ibtLink = By.linkText("Implementation of Binary Trees"); 
	private static By abtLink = By.linkText("Applications of Binary trees"); 
	private static By bstLink = By.linkText("Binary Search Trees"); 
	private static By ibstLink = By.linkText("Implementation Of BST");
	private static By editor=By.xpath("//form[@id='answer_form']/div/div/div/*");
	private static By pythonEditor=By.xpath("//*[@id=\"answer_form\"]/div");
	private static By run = By.xpath("//*[@id=\"answer_form\"]/button");
	private static By submit = By.xpath("//*[@id=\"answer_form\"]/input[2]");
	private static By question = By.id("questionText");
	private static By output = By.id("output");
	private static By tryHere = By.partialLinkText("Try here");
	private static By codePath=By.xpath("//*[@class=\"CodeMirror-linenumber CodeMirror-gutter-elt\"][1]");
    static
    { 
    	pageNamemap = new HashMap<>(); 
    	pageNamemap.put("tree", treeLink);
    	pageNamemap.put("Overview of Trees", oftLink );
    	pageNamemap.put("Terminologies", terminologiesLink  );
    	pageNamemap.put("Types of Trees", totLink );
    	pageNamemap.put("Tree Traversals", ttLink );
    	pageNamemap.put("Traversals-Illustration", tiLink  );
    	pageNamemap.put("Binary Trees", btLink );
    	pageNamemap.put("Types of Binary Trees", tbtLink );
    	pageNamemap.put("Implementation in Python", ipLink );
    	pageNamemap.put("Binary Tree Traversals", btttLink );
    	pageNamemap.put("Implementation of Binary Trees", ibtLink );
    	pageNamemap.put("Applications of Binary trees", abtLink );
    	pageNamemap.put("Binary Search Trees", bstLink);
    	pageNamemap.put("Implementation Of BST", ibstLink );

    	pageNamemap.put("Practice Questions", practiceQuestionsLink);
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
    	//elementMap.put("input", );
    } 
    
    ElementUtil eleUtil=new ElementUtil(); 
	public TreePage_PO(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public String getCurrentURL() {
		// TODO Auto-generated method stub
		String currentURL=driver.getCurrentUrl();
		System.out.println("curentURL:"+currentURL);
		return currentURL;
	}
	public void doPageClick(String pageName) throws InterruptedException
	{
		
		driver.findElement(pageNamemap.get(pageName)).click();
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
			System.out.println(noOfSpaces+"=="+code);
			
			if(!code.contains("Hi")) { //contains def
			driver.findElement(elementMap.get("editor")).sendKeys(Keys.ENTER);
			//driver.findElement(elementMap.get("editor")).sendKeys(Keys.);
			}
			int i=0;
			System.out.println(spaceNum);
			while(i<spaceNum) {
				System.out.println(i);
				
				//driver.findElement(elementMap.get("editor")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SHIFT,"l"));
			
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
	
	public boolean isOutputDisplayed() throws InterruptedException
	{
		//Thread.sleep(10000);
		System.out.println(driver.findElement(output).isDisplayed());
		//Thread.sleep(10000);
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
		// Click the Cancel button on the alert window
		}
		else {
			String msg="No Alerts!!";
			return msg;
		}
		
		
	}
	public boolean doAlertOk() {
		if(isAlertPresent()) {
		driver.switchTo().alert().accept();
		return true;
		}
		return false;
	}
	public boolean isEditorDisplayed(String ele) throws InterruptedException
	{
		
		if(!driver.findElement(elementMap.get(ele)).isDisplayed()) {
			return false;
		}
		return true;
	}
	
	public boolean isCodePresent() {
		try {
		    driver.findElement(codePath);
		    return true;
		} catch (NoSuchElementException e) {
		    // Element does not exist
			return false;
		}
	}
	
}
