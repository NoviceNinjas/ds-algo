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
	private By queuePageGetStarted = By.xpath("//a[@href='queue']");
	private By dataStructPageStarted = By.xpath("//a[@href='data-structures-introduction']");
	private static By arrayPageGetStarted = By.xpath("//a[@href='array']");
	private static By graphPageGetStarted = By.xpath("//a[@href='graph']");
	private static By treePageGetStarted = By.xpath("//a[@href='tree']");
	private static By linkedListPageGetStarted = By.xpath("//a[@href='linked-list']");
	private static By stackPageGetStarted = By.xpath("//a[@href='stack']");
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
	public TreePage_PO doLoginTreePage(String u, String p)
	{
		System.out.println("login with uname: "+ u+" and passwd: "+p);
		driver.findElement(usrName).sendKeys(u);
		driver.findElement(passwd).sendKeys(p);
		driver.findElement(lgnBtn).click();
		
		driver.findElement(treePageGetStarted).click();
		return new TreePage_PO(driver);
	}
	public LinkedList_PO doLoginLinkedListPage(String u, String p)
	{
		System.out.println("login with uname: "+ u+" and passwd: "+p);
		driver.findElement(usrName).sendKeys(u);
		driver.findElement(passwd).sendKeys(p);
		driver.findElement(lgnBtn).click();
		
		driver.findElement(linkedListPageGetStarted).click();
		return new LinkedList_PO(driver);
	}
	public StackPage_PO doLoginStackPage(String u, String p)
	{
		System.out.println("login with uname: "+ u+" and passwd: "+p);
		driver.findElement(usrName).sendKeys(u);
		driver.findElement(passwd).sendKeys(p);
		driver.findElement(lgnBtn).click();
		
		driver.findElement(stackPageGetStarted).click();
		return new StackPage_PO(driver);
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
	
	public DataStructPage_PO doLoginDataStructPage(String u, String p)
	{
		System.out.println("login with uname: "+ u+" and passwd: "+p);
		driver.findElement(usrName).sendKeys(u);
		driver.findElement(passwd).sendKeys(p);
		driver.findElement(lgnBtn).click();
		driver.findElement(dataStructPageStarted).click();
		return new DataStructPage_PO(driver);
	}
	
	public String doCaptureValidationText()
	{
		return driver.findElement(usrName).getAttribute("validationMessage");
		
	}
	
	public void doAcceptAlertBox()
	{
		driver.switchTo().alert().accept();
	}
	
	
	public String clickLoginButtonwithblank()
	{
		driver.findElement(lgnBtn).click();
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
		return messageStr;
		
		
	}
}