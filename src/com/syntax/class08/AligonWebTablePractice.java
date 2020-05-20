package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AligonWebTablePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='su-table su-table-alternate']/table/tbody/tr/td"));
		
		
		
		driver.quit();

	}

}
