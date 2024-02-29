package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage_PO {

	private WebDriver driver;
	
	private By usrName = By.name("username");
	private By passwd = By.name("password");
	private By lgnBtn = By.xpath("//input[@value='Login']");
	private By signInMsg = By.xpath("//div[@role='alert']");
	private By signInModules = By.xpath("//h5[@class='card-title']");
	private By signOutLink = By.linkText("Sign out");

    // Declaring the static map 
   // private static Map<String, By> pageGetStartedmap; 
  
    // Instantiating the static map 
    private static By queuePageGetStarted = By.xpath("//a[@href='queue']");
	private static By arrayPageGetStarted = By.xpath("//a[@href='array']");
	private static By graphPageGetStarted = By.xpath("//a[@href='graph']");

	/*static
    { 
    	pageGetStartedmap = new HashMap<>(); 
    	pageGetStartedmap.put("queue", queuePageGetStarted); 
    	pageGetStartedmap.put("array", arrayPageGetStarted);
    } */
	
	
	
	public SignInPage_PO(WebDriver driver)
	{
		this.driver = driver;
	}
	
//	public String doSignIn(String uName, String pwd)
//	{
//		driver.findElement(usrName).sendKeys(uName);
//		driver.findElement(passwd).sendKeys(pwd);
//		driver.findElement(lgnBtn).click();
//		return driver.findElement(signInMsg).getText();
//	}
	
	public void enterUname(String uName)
	{
		driver.findElement(usrName).sendKeys(uName);
	}
	
	public void enterPasswd(String pwd)
	{
		driver.findElement(passwd).sendKeys(pwd);
	}
	
	public String clickLoginButton()
	{
		driver.findElement(lgnBtn).click();
		return driver.findElement(signInMsg).getText();
	}
	
	/*
	 * This method is used by Queue page to login in the DS-algo portal
	 */
	public QueuePage_PO doLoginQueuePage(String u, String p)
	{
		System.out.println("login with uname: "+ u+" and passwd: "+p);
		driver.findElement(usrName).sendKeys(u);
		driver.findElement(passwd).sendKeys(p);
		driver.findElement(lgnBtn).click();
		driver.findElement(queuePageGetStarted).click();
		return new QueuePage_PO(driver);
	}

	public ArrayPage_PO doLoginArrayPage(String u, String p)
	{
		System.out.println("login with uname: "+ u+" and passwd: "+p);
		driver.findElement(usrName).sendKeys(u);
		driver.findElement(passwd).sendKeys(p);
		driver.findElement(lgnBtn).click();
		
		driver.findElement(arrayPageGetStarted).click();
		return new ArrayPage_PO(driver);
	}

	public GraphPage_PO doLoginGraphPage(String u, String p)
	{
		System.out.println("login with uname: "+ u+" and passwd: "+p);
		driver.findElement(usrName).sendKeys(u);
		driver.findElement(passwd).sendKeys(p);
		driver.findElement(lgnBtn).click();
		
		driver.findElement(graphPageGetStarted).click();
		return new GraphPage_PO(driver);
	}
	
	public String getHomePageURL()
	{
		return driver.getCurrentUrl();
	}
	
	public List<String> getSignInModules()
	{
		List<WebElement> signInModuleWebEleList = driver.findElements(signInModules);
		
		List<String> sigInModuleList = new ArrayList<String>();
	
		for(WebElement e: signInModuleWebEleList)
		{
			String text = e.getText();
			
			sigInModuleList.add(text);
		}
		
		
		return sigInModuleList;
	}
	
	public boolean checkSignOutLinkIdDispalyed()
	{
		return driver.findElement(signOutLink).isDisplayed();	
	}
}
