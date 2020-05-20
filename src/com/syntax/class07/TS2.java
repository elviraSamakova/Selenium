package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.CommonMethods;

public class TS2 extends CommonMethods{

	public static void main(String[] args) {
		/**
		 * TC 2: Verify element is enabled
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Controls” link
Click on enable button
Enter “Hello” and verify text is entered successfully
Close the browser 
		 */

		setUp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//
		driver.findElement(By.linkText("Dynamic Controls")).click();
		WebElement enableBut=driver.findElement(By.cssSelector("button[onclick='swapInput()']"));
		WebDriverWait wait=new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(enableBut));
		enableBut.click();
		
		WebElement inputText=driver.findElement(By.xpath("//input[@type='text']"));
		inputText.click();
		inputText.getAttribute("Test");
		
		
		
	}

}
