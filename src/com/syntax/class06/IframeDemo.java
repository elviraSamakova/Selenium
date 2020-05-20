package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * TC 2: Syntax Frame verification
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Others” link
Click on “Iframe” link
Click on the “Home” link inside the first frame
Verify “Syntax logo” is displayed in second frame
Quit browser
		 */
		
		
		WebDriver driver=BaseClass.setUp();
		
		driver.findElement(By.partialLinkText("Others")).click();
		driver.findElement(By.linkText("Iframe")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();//switch back to main window/page/default content
		Thread.sleep(2000);
		
		driver.switchTo().frame("FrameTwo");
		Thread.sleep(2000);
		boolean syntaxLogoDispl=driver.findElement(By.className("custom-logo")).isDisplayed();
		if (syntaxLogoDispl) {
			System.out.println("Logo is displayed. Test case Passed.");
		}else {
			System.out.println("Logo is not displayed. Test case Failed.");
		}
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		
		//By WebElement
				WebElement secondFrame=driver.findElement(By.linkText("Enroll Today"));
				driver.switchTo().frame(secondFrame);
				secondFrame.click();
				Thread.sleep(2000);
				driver.switchTo().defaultContent();//switch back to main window/page/default content
				
		
		BaseClass.tearDown();
		
	}

}
