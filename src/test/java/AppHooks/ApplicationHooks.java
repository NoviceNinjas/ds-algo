package AppHooks;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.qa.Utils.ConfigReader;
import com.qa.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	
	private WebDriver driver;
	
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty()
	{
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}
	
	@Before(order = 1)
	public void launchBrowsery()
	{
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}
	
	
	@After(order = 0)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order = 1)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			String screenShotName = scenario.getName().replaceAll(" ", "_");
			
			byte [] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES) ;
			System.out.println("The path for the screen shot is: " + sourcePath);
			scenario.attach(sourcePath, "image/png", screenShotName);
					
			
		}
	}
	
}
