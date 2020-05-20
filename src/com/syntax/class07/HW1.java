package com.syntax.class07;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.CommonMethods;

public class HW1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		/**
		 * TC 1: Verify element is clickable Open chrome browser Go to
		 * “https://the-internet.herokuapp.com/” 
		 * Click on “Click on the “Dynamic Controls” 
		 * link Select checkbox and 
		 * click Remove Click on Add button and
		 * verify “It's back!” text is displayed Close the browser
		 */
		setUp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		WebElement addButton=driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
		
		WebDriverWait wait=new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(addButton));
		addButton.click();
		
		WebElement add=driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
		WebDriverWait waitBack=new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(addButton));
		add.click();
		
		WebElement message= driver.findElement(By.id("message"));
		boolean messageIsDisplayed=message.isDisplayed();
		if(messageIsDisplayed) {
			System.out.println("Text:: '"+message.getText()+"' is displayed. Test case is Passed");
		}else {
			System.out.println("Test case is Failed. Text is not displayed.");
		}
	
		tearDown();
	}

}
