package com.util;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class CommonUtilities extends TestBase {
	
	public WebElement findElement(By by)
	
	{
		return driver.findElement(by);
		
	
	}

	public List<WebElement> findElements(By by) {
		
		return driver.findElements(by);
	}
	
	
	
}
