package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

	public static void main(String[] args) throws InterruptedException {
		String Zurl="https://www.zillow.com";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to(Zurl);
		driver.manage().window().fullscreen();
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		
		if (Zurl.contains("Zillow")) {
			System.out.println("URL contains Zillow");
			
		}else {
			System.out.println("URL doesn't contains Zillow");
		}
		
		
		
	}

}
