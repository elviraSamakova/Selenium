package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOfAmazone {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
   List<WebElement>	allLinks=driver.findElements(By.tagName("a"));
   System.out.println(allLinks.size());

   int count=0;
   for (WebElement link:allLinks) {
	   String text=link.getText();
	   if (!text.isEmpty()) {
		   System.out.println(text);
		   count++;
	   }
	   
   }
   System.out.println("Total number of links with text:  "+count);
   driver.quit();
	}

}
