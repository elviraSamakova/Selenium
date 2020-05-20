package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");

		driver.findElement(By.id("btnLogin")).click();

		boolean LogoIsDisplayed = driver.findElement(By.xpath("//div[@id='branding']//a//img")).isDisplayed();
		if (LogoIsDisplayed) {
			System.out.println("Logo is displayed, Tets case is Passed");
		} else {
			System.out.println("Logo is not displayed, Tets case is Failed");
		
		}

	}

}
