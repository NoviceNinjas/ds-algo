package com.qa.Utils;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException; 

import org.json.simple.JSONArray; 
import org.json.simple.JSONObject;

import java.io.InputStreamReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException; 
public class ElementUtil {
public static WebDriver driver;
	
	//1. Design pattern - page object model or page factory
	//2. preconditions check
	//3. wait statements
	//4. Exception handling
	//5. Reporting
	
	//prop_pageName_ElementName_Type
	//prop_login_userName_txt
/**
 * 
 * @purpose : This is a method which will accept WebElement and perform click action
 * @category Unit TestCase
 * @exception Exception
 * @DateCretaed :
 * @dateModified : 
 * @param element
 * @return boolean
 */
	public static boolean webClick(WebElement element) {
		
		try {
						
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.visibilityOf(element));
			
			if(ele.isDisplayed()) {
				if(ele.isEnabled()) {
				
				try {
					
				//ele.click();
				
				Actions action = new Actions(driver);
				action.moveToElement(ele).perform();;
				action.click(ele).perform();
//				reporting line will go here
				
				return true;
				}
				catch(Exception e) {
					//JavascriptExecutor(driver) = 
				}
					
				}
				else {
					throw new Exception("Element is not enabled");
				}
			}
			else {
				throw new Exception("Element is not displayed");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
		
	}
	public static void TextIndentation(WebDriver driver, WebElement pythonElement, int row, int space,boolean flag) {
	Actions	 action = new Actions(driver);
	       // Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
		for(int i=1;i<=row;i++) {
		      action.sendKeys(Keys.ARROW_UP).keyUp(Keys.SHIFT).perform();
		       for(int j=1;j<=space;j++) {
	            if(i==1 && flag) action.sendKeys(Keys.BACK_SPACE).perform();
	            else action.sendKeys(Keys.DELETE).perform();
			   }
		}
	}
	void handleJSONObject(JSONObject jsonObject) {

		for (Object key : jsonObject.keySet()) {
			Object value = jsonObject.get(key);
			System.out.println(key + ": " + value);
			}
	}
	
	public JSONArray readCodeFromJSON(String moduleName,String qNo) throws FileNotFoundException, IOException, ParseException {
		   JSONParser parser = new JSONParser();
		   JSONObject moduleObj =  (JSONObject) parser.parse(new InputStreamReader(new FileInputStream("C:\\Users\\14255\\OneDrive\\Desktop\\School\\ds algo\\NoviceNinjas\\test_input\\pythonCode.json"))); 
           JSONObject questionsObject = (JSONObject) moduleObj.get(moduleName);
           JSONArray codeLines = (JSONArray)questionsObject.get(qNo);
        return codeLines;
	}

	
	
}
