package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;




public class TestBase {

	private static final TakesScreenshot TakesScreenshot = null;
	protected static WebDriver driver;
	public Properties prop;
	public Logger log=Logger.getLogger(TestBase.class.getName());
	         
	
	

	
	@BeforeMethod
	public void launchChrome() throws IOException

	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		DOMConfigurator.configure("log4j.xml");
		log.debug("Chrome Launch");
		log.error("test log");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		prop=new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\util\\data.properties");
		prop.load(fis);
		log.debug("Config file loaded!!");
		String URL= prop.getProperty("URL");
		driver.get(URL);

	}
	
	/*
	 * public void getScreenshotPath(String testCaseName,WebDriver driver) throws
	 * IOException {
	 * 
	 * TakesScreenshot ts= (TakesScreenshot); File source=
	 * ts.getScreenshotAs(OutputType.FILE); String
	 * destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".
	 * png"; FileUtils.copyFile(source,new File(destinationFile));
	 * 
	 * 
	 * }
	 */	
	@AfterMethod
	public void closeChrome()

	{
		driver.close();
		
	}

}
