package org.totalqa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static WebDriver driver;

	@BeforeMethod

	public void setup() {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");

	}

	@AfterMethod
	public void teardown() {
		driver.close();

	}

}
