package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDowns extends BaseClass {

	public static void main(String[] args) {
		
setUp();

WebElement dropDown=driver.findElement(By.cssSelector("select#month"));
Select obj= new Select(dropDown);

//obj.selectByIndex(1);
//obj.deselectByValue("3");
//obj.deselectByVisibleText("August");
boolean yesOrNo=obj.isMultiple();
List <WebElement> values=obj.getOptions();
int totalValues= values.size();
System.out.println(totalValues);
System.out.println(yesOrNo);
driver.quit();
	}

}
