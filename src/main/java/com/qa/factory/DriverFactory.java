package com.qa.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public Properties prop;
	
	/**
	 * This method is used to initialize the thread local driver based on the given browser
	 * @param browserName
	 * @return
	 */
	
	
	public WebDriver init_driver(String browserName)
	{
		//String browserName= prop.getProperty("browser").trim();
		System.out.println("Browser name is: "+ browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();;
			tlDriver.set(new FirefoxDriver());
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		}
		
		else
		{
			System.out.println("Please pass the right browser name "+ browserName);
		}
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/*
	 * This method is used to get the driver with thread local
	 */
	public static  synchronized WebDriver getDriver()
	{
		return tlDriver.get();
	}
	
	/**
	 * This method is used to initialize the properties
	 * @return : This returns prop
	 */
	
	public Properties init_prop()
	{
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);
			
		} 
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (IOException e) {
				e.printStackTrace();
		}
		
		return prop;
	}
	
	
	
}
