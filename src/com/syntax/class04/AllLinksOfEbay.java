package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOfEbay {
	public static String url="https://ebay.com";
	
	public static void main (String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		List<WebElement> allLinksEbay=driver.findElements(By.tagName("a"));
		System.out.println(allLinksEbay.size());
		
		int count=0;
		for (WebElement link:allLinksEbay) {
			
			String text=link.getText();
			if (!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
		}
System.out.println("Total number of link with text is:: "+count);
		
		driver.quit();
	}
	}