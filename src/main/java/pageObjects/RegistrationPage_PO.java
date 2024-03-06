package pageObjects;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage_PO {
	private WebDriver driver;

	//private By usrName = By.name("username");
	private static By passwd = By.id("id_password1");
	private static By pwdConfirm = By.id("id_password2");
	private static By warnMsg = By.xpath("//div[3]");
	private static By signInMsg = By.xpath("//div[@role='alert']");

	private static By uName = By.id("id_username");
	//private By unameMessage = By.xpath("//div[@role='alert']");
	
	
	private static By registerButton = By.xpath("//div[2]/div/div[2]/form/input[5]");
	private static Map<String, By> elementMap; 
    static
    { 
    	elementMap = new HashMap<>(); 
    	elementMap.put("register", registerButton);
    	elementMap.put("uName", uName);
    	elementMap.put("password", passwd);
    	elementMap.put("pwdConfirm", pwdConfirm);
    	elementMap.put("warning", warnMsg);
    	elementMap.put("signIn", signInMsg);
    } 

	

	public void doElementClick(String element)
	{
		driver.findElement(elementMap.get(element)).click();
		//return driver.findElement(signInMsg).getText();
	}
	
	public RegistrationPage_PO(WebDriver driver)
	{
		this.driver = driver;
	}

	public String getMessage(String element)
	{
		
		WebElement ele = driver.findElement(elementMap.get(element));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;", ele);
		System.out.println(validationMessage);
		return validationMessage;
		//driver.findElement(lgnBtn).click();
		//return driver.findElement(signInMsg).getText();
	}
	public void fillElement(String element,String details) throws FileNotFoundException, IOException, ParseException
	{
		if(details.equals("random")) 
			driver.findElement(elementMap.get(element)).sendKeys(randomString());
		else
			driver.findElement(elementMap.get(element)).sendKeys(details);
	}
	public String getAlert(String element)
	{
		String message= driver.findElement(elementMap.get(element)).getText();
		return message;
		//driver.findElement(lgnBtn).click();
		//return driver.findElement(signInMsg).getText();
	}
	//html/body/div[3]

	public static String randomString() throws FileNotFoundException, IOException, ParseException {
		   // create a string of all characters
	    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

	    // create random string builder
	    StringBuilder sb = new StringBuilder();

	    // create an object of Random class
	    Random random = new Random();

	    // specify length of random string
	    int length = 7;

	    for(int i = 0; i < length; i++) {

	      // generate random index number
	      int index = random.nextInt(alphabet.length());

	      // get character specified by index
	      // from the string
	      char randomChar = alphabet.charAt(index);

	      // append the character to string builder
	      sb.append(randomChar);
	    }

	    String randomString = sb.toString();
	    System.out.println("Random String is: " + randomString);
	    return randomString;
	  }
	
	
}
