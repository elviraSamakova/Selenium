package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
	
	public static  String url="http://newtours.demoaut.com/";

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
	 	
		driver.get(url);
		driver.findElement(By.xpath("//a[starts-with(text(),'REG')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Elvira");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234456789");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("elvira.samakova@mail.ru");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 Kindred st");
		
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("apt 2");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Philadelphia");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("PA");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("19111");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("elvira.samakova");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678urokiS");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("12345678urokiS");
		
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
		
		
		
	}

}
