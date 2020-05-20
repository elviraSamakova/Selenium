package com.syntax.class02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static WebElement element;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
//		driver.findElement(By.id("email")).sendKeys("syntaxtest@yahoo.com");
//		driver.findElement(By.id("pass")).sendKeys("syntax123");
//		driver.findElement(By.id("u_0_b")).click();
//		driver.findElement(By.xpath("//a[@title='Go to Facebook Home']"));
		
//		WebElement element=driver.findElement(By.id("u_0_6"));
//		element.click();
//		System.out.println(element.isSelected());
//		System.out.println(element.isEnabled());
//		System.out.println(element.isDisplayed());
		
//		System.out.println("=========logo=============");
//		 element=driver.findElement(By.xpath("//i[@class='fb_logo img sp_6M5yDv-EUGW sx_5d302e']"));
//	  System.out.println(element.isDisplayed());
//	  
	  List<WebElement> radioBtn = driver.findElements(By.name("sex")); 
	  
	  Boolean is_selected = radioBtn.get(0).isSelected();
	  
	  for(WebElement radio: radioBtn) {
		  String value=radio.getAttribute("value");
		  if(radio.isEnabled() && value.equals("Female")) {
			  radio.click(); 
			  break;
		  }
	  }
	  
	  
	  
	  
//	  if (is_selected == true) { 
//		  list.get(1).click();
//	  }else {
//		  list.get(0).click();
//	  }
//	  
	}

}
