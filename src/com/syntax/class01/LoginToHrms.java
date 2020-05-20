package com.syntax.class01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToHrms {

	public static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String filePath=System.getProperty("user.dir")+"/configs/anyName.properties";
		//String filePath="/Users/elvirasamakova/eclipse-workspace/Selenium/configs/anyName.properties";
		
		FileInputStream fileInput= new FileInputStream(filePath);
		Properties prop= new Properties();
		prop.load(fileInput);
		
		String browser= prop.getProperty("browser");
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
			 driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.getProperty("webdriver.gecko.driver", "drivers/geckodriver");
			 driver=new ChromeDriver();
			break;

		}
		
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		driver.quit();
	}
}