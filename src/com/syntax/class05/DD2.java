package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DD2 extends BaseClass {

	public static void main(String[] args) {

		setUp();
 
		WebElement continents = driver.findElement(By.id("continents"));
		Select select = new Select(continents);
		
		boolean isMultiple = select.isMultiple();
		System.out.println(isMultiple);
		
		List<WebElement> options = select.getOptions();// return list of all options in the DD

		for (WebElement option : options) {
			String text = option.getText();
			System.out.println(text);

			if (text.equals("Africa")) {
				option.click();
			}
		}

		
		tearDown();
	}

}
