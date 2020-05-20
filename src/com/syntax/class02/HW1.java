package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) {
		String url="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("u_0_m")).sendKeys("Elvira");
		driver.findElement(By.id("u_0_o")).sendKeys("Samakova");
		driver.findElement(By.id("u_0_r")).sendKeys("1234567890");
		driver.findElement(By.id("u_0_13")).click();
		
	}

}
