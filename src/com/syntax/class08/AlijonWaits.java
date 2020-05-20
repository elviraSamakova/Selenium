package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlijonWaits {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		driver.manage().window().maximize();
		
		WebElement startDownloadButton=driver.findElement(By.cssSelector("button[id='downloadButton']"));
		
		startDownloadButton.click();
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Complete!']")));
		
		
		WebElement compleatStatus=driver.findElement(By.xpath("//div[text()='Complete!']"));
		
		String compleatStatusText=compleatStatus.getText();
		
		System.out.println(compleatStatusText);
		
		WebElement closeButton=driver.findElement(By.xpath("//button[text()='Close']"));
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();
		
	}

}
