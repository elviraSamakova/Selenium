package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		WebElement monthDD=driver.findElement(By.id("month"));
		Select obj=new Select(monthDD);
		obj.selectByVisibleText("Jun");
		
	Thread.sleep(3000);	
	tearDown();	
	}
}
