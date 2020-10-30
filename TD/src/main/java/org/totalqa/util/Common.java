package org.totalqa.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Common extends Base {

	public WebElement find(By By) {
		return driver.findElement(By);

	}

	public List<WebElement> finds(By By) {
		return driver.findElements(By);

	}

}
