package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class TaskAmazon extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		WebElement search=driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(search);
		List<WebElement> options = select.getOptions();
		
		for (WebElement option : options) {
			String text = option.getText();
			
		
			select.selectByVisibleText("Books");
			
			WebElement searchTextbox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
			searchTextbox.sendKeys("Harry potter");
			WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit'][@class='nav-input']"));
			searchButton.click();
			
			
			List <WebElement> bookSeriesCheckboxes=driver.findElements(By.className("a-spacing-micro"));
			for(WebElement bookSeriesCheckbox:bookSeriesCheckboxes) {
				String checkboxText=bookSeriesCheckbox.getText();
				if(!bookSeriesCheckbox.isSelected() && checkboxText.equals("Unofficial Cookbook")) {
					Thread.sleep(2000);
					bookSeriesCheckbox.click();
					break;
				}
			}
			
			
		}

		
	}

}
