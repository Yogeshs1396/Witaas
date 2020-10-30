package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class TestBase {

	protected static WebDriver driver;
	public Properties prop;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest extentTest;

	@BeforeClass
	public void beforeClass()
	
	{
		
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");		
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);

	}

	
	@BeforeMethod
	public void launchChrome() throws IOException

	{

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.get("http://demo.automationtesting.in/Register.html");
		prop=new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\util\\data.properties");
		prop.load(fis);
		String URL= prop.getProperty("URL");
		driver.get(URL);

	}
	
		
	/*
	 * public String getScreenshotPath(String testCaseName,WebDriver driver) throws
	 * IOException
	 * 
	 * { TakesScreenshot tk= (TakesScreenshot) driver; File source =
	 * tk.getScreenshotAs(OutputType.FILE); String destinationFile =
	 * System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	 * FileUtils.copyFile(source, new File(destinationFile)); return
	 * destinationFile; }
	 */
	 
	@AfterMethod
	public void closeChrome()

	{
		driver.close();
		extent.flush();
	}

}
