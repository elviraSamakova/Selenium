package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("");
	
	driver.findElement(By.id("btnLogin")).click();
		
	
	boolean message =driver.findElement(By.id("spanMessage")).isDisplayed();
	if (message) {
		System.out.println("Password cannot be empty is displayed. Test case is Passed");
	
	}else {
		System.out.println("Message is not displayed. Test case is Failed");
		
	}
	}

}
