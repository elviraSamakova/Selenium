package com.syntax.class08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
