package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	public static WebDriver driver;
	String mydate= "13";
	String mymonth="March";
	
	
	@Before
	public void setup()
			 {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");


	}
	
	@Given("Select a ticket with valid details")
	public void select_a_ticket_with_valid_details() {
	    
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("Goa");
	}

	@When("Select Date")
	public void select_date() {
		
		while(!driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/div/span[1]")).getText().contains(mymonth))
		{		
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-first .ui-datepicker-calendar .ui-state-default"));
		int count=dates.size();
		System.out.println(count);
		for(int i=0;i<count;)
			{
			String text = dates.get(i).getText();
			System.out.println("Dates checked are ..."+text);
			if(text.equalsIgnoreCase(mydate))
			{
				dates.get(i).click();
				break;
			}
				else
					i++;
		}
	    
	}

	@When("Search Matching Flights")
	public void search_matching_flights() {
		
		driver.findElement(By.xpath("//span/input[@value='Search']")).click();
	    
	}

	@Then("Select Cheapest price")
	public void select_cheapest_price() {
		String Result= driver.findElement(By.xpath("//td[@class='fareCol1 col-active SelectedFareTD']")).getText();
		System.out.println(Result);
	}
	@After
	public void teardown()
	
	{
		driver.quit();
	}

}
