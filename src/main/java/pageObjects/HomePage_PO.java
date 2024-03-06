package pageObjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_PO {

	private WebDriver driver;
	
	//1.private by locators
	
	private By getStartedBtn = By.xpath("//button[@class='btn']");
	private By dropDownMenu = By.xpath("//div/a[@class='dropdown-item']");
	private By getStartedmoduleBtns = By.linkText("Get Started");
	private By notLoggedIn = By.xpath("//div[@role='alert']");
	private static By regLink = By.partialLinkText("Register");
	private static By signinLink = By.linkText("Sign in");
	private By dropdownItemclick = By.xpath("//div/a[@class='nav-link dropdown-toggle']");
	private By dropDownItem = By.xpath("//a[@class='dropdown-item']");
	private By arrayGetStartedButton = By.xpath("//div[2]/div[2]/div/div/a");
	

	//2. public page constructor
	
	public HomePage_PO(WebDriver driver) {
		this.driver = driver;
	}
	private static Map<String, By> linkMap; 
    static
    { 
    	linkMap = new HashMap<>(); 
    	linkMap.put("register", regLink); 
    	linkMap.put("signin", signinLink);
    } 
	//3. public page actions
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String getHomePageURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void doGetStartClick()
	{
		driver.findElement(getStartedBtn).click();
		
	}
	
	public int countDropDownMenuItems()
	{
		List<WebElement> listDropDown = driver.findElements(dropDownMenu);
		System.out.println("There are " + listDropDown.size() + " items in the drop down");
		return listDropDown.size();
		
	}
	
	public String doClickGetStartedwithoutlogginin()
	{
		String attrName = driver.findElements(getStartedmoduleBtns).get(2).getAttribute("href");
		driver.findElements(getStartedmoduleBtns).get(2).click();
		System.out.println("The name of the href for the get started buuton is: " + attrName );
		System.out.println(driver.findElement(notLoggedIn).getText());
		return  driver.findElement(notLoggedIn).getText();
	}
	
	public String doClickmenuitemwithoutlogginin()
	{
		driver.findElement(dropdownItemclick).click();
		String attrName = driver.findElements(dropDownItem).get(2).getText();
		driver.findElements(dropDownItem).get(2).click();
		System.out.println("The name of the text for the get started button is: " + attrName );
		System.out.println(driver.findElement(notLoggedIn).getText());
		return  driver.findElement(notLoggedIn).getText();
	}
	
	public void doClickArrayGetStarted() throws InterruptedException
	{
		//Thread.sleep(10000);
		driver.findElement(arrayGetStartedButton).click();
		//String attrName = driver.findElements(dropDownItem).get(2).getText();
		//driver.findElements(dropDownItem).get(2).click();
		//System.out.println("The name of the text for the get started buuton is: " + attrName );
		//System.out.println(driver.findElement(notLoggedIn).getText());
		//return  driver.findElement(notLoggedIn).getText();
	}
	
	public boolean checkRegisterLinkIdDispalyed()
	{
		return driver.findElement(regLink).isDisplayed();	
	}
	
	public boolean checkSignInLinkIdDispalyed()
	{
		return driver.findElement(signinLink).isDisplayed();	
	}
	
	public SignInPage_PO doClickSignIn()
	{
		if(checkSignInLinkIdDispalyed())
		{
			driver.findElement(signinLink).click();
		}
		return new SignInPage_PO(driver);
	}
	
	public Object clickGetstartedfromPortal(String element)
	{
		driver.findElement(getStartedBtn).click();
		driver.findElement(linkMap.get(element)).click();
		if(element.equals("register")) {
			return new RegistrationPage_PO(driver);
		}
		return new SignInPage_PO(driver);
	}
	
}
