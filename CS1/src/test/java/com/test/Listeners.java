package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.util.TestBase;

public class Listeners extends TestBase implements ITestListener {

	ExtentReports extent= ExtentManager.getReportObject();
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		
		test= extent.createTest(result.getMethod().getMethodName());
		
	
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "PASSED");
		
	
	}

	/*
	 * public void onTestFailure(ITestResult result) { // TODO Auto-generated method
	 * stub test.fail(result.getThrowable()); WebDriver driver=null; String
	 * testMethodName=result.getMethod().getMethodName(); try {
	 * driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField(
	 * "driver").get(result.getInstance()); } catch (IllegalArgumentException e1) {
	 * // TODO Auto-generated catch block e1.printStackTrace(); } catch
	 * (IllegalAccessException e1) { // TODO Auto-generated catch block
	 * e1.printStackTrace(); } catch (NoSuchFieldException e1) { // TODO
	 * Auto-generated catch block e1.printStackTrace(); } catch (SecurityException
	 * e1) { // TODO Auto-generated catch block e1.printStackTrace(); } try {
	 * getScreenshotPath(testMethodName,driver); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * }
	 */
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		extent.flush();
	
	}
	
	

}
