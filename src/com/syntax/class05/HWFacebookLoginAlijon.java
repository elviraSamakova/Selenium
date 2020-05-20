package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class HWFacebookLoginAlijon extends BaseClass {
	public static  WebElement element ;
	
	public static void main(String[] args) {
		setUp();

		driver.findElement(By.id("u_0_m")).sendKeys("Ella");
		driver.findElement(By.id("u_0_o")).sendKeys("Smith");
		driver.findElement(By.id("u_0_r")).sendKeys("stefany.smith@yahoo.com");
		driver.findElement(By.id("u_0_u")).sendKeys("stefany.smith@yahoo.com");
		driver.findElement(By.id("u_0_w")).sendKeys("qwertyytrewq");

		element = driver.findElement(By.id("month"));
		Select selectMonth = new Select(element);
		List<WebElement> months = selectMonth.getOptions();

		for (WebElement month : months) {
			String text = month.getText();
			
			selectMonth.selectByIndex(6);
		}
		
		element = driver.findElement(By.id("day"));
		Select selectDay = new Select(element);
		List<WebElement> days = selectDay.getOptions();

		for (WebElement day : days) {
			String text = day.getText();
			
			selectDay.selectByIndex(10);
		}
		
		element = driver.findElement(By.id("year"));
		Select selectYear = new Select(element);
		List<WebElement> years = selectYear.getOptions();

		for (WebElement year : years) {
			String text = year.getText();
			
			selectYear.selectByVisibleText("1999");
		}
		
		 driver.findElement(By.id("u_0_6")).click();
		
		driver.findElement(By.id("u_0_13")).click();

		
	}

}
