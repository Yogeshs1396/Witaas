package org.totalqa.util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static WebDriver driver;
	

	@BeforeMethod

	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://partnerstore.oracle.com/apex/ps_ext_links.registeraccess");

	}

	@AfterMethod
	public void teardown() {
		 driver.close();

	}

}
