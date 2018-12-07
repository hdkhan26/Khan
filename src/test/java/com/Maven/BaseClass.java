package com.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BaseClass
	{
	    

	    public void setup()
	    {
	        
	       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\junai\\Downloads\\Syntax\\JarFiles\\selenium-server-standalone-3.14.0\\Driver\\chromedriver.exe");
	    	WebDriver  driver = new HtmlUnitDriver();
	    	
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	    }
	    
	}
	
	

