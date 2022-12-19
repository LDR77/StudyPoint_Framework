package com.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;

	public static void custom_Sendkeys(WebElement element,String value) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, "Value succefully send == "+value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			//System.out.println(e.getMessage());
		}
	}

	
	public static void custom_Click(WebElement element) {
		try {
		element.click();
		test.log(Status.PASS, "Successfully clicked");
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			//System.out.println(e.getMessage());
		}
	}
	
	public static void Handle_Dropdown(WebElement element, String text) { 
		try {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void ScrollIntoElement(WebDriver driver, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].ScrollIntoView();", element);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static Alert AlertHandle(WebDriver driver) {
			return driver.switchTo().alert();
	}
	
	
	public static void MoveToElement_Click(WebDriver driver, WebElement element) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void RightClickOnElement(WebDriver driver, WebElement element) {
		try {
			Actions act = new Actions(driver);
			act.contextClick(element).build().perform();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String get_Txt(WebElement element) {
		return element.getText();
	}
	
	public static void copyText_Keyboard(WebDriver driver) {
		try {
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
