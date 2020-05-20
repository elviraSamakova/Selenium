package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class TC1  {
/**
 * Open chrome browser
1. Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
2.Login to the application
3.Verify customer “Susan McLaren” is present in the table
4.Click on customer details
5.Update customers last name and credit card info
6.Verify updated customers name and credit card number is displayed in table
7.Close browser
 * @throws InterruptedException 
 * 
 */
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		
	
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	
	List<WebElement> cells=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	
	for (int i=1; i<cells.size(); i++) {
		String oneElement=cells.get(i-1).getText();
		
		if(oneElement.contains("Susan McLaren")) {
			driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();
			driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[5]/td[13]")).click();
			break;
		}
	}
	
	WebElement update=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
	update.clear();
	update.sendKeys("Susan Smith");
	driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
	
	
	
    Thread.sleep(3000);
	driver.quit();
	}
	
	}


