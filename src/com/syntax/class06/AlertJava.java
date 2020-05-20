package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class AlertJava extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		
		//		TC 1: JavaScript alert text verification
//		Open chrome browser
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		Click on “Alerts & Modals” links
//		Click on “Javascript Alerts” links
//		Click on button in “Java Script Alert Box” section
//		Verify alert box with text “I am an alert box!” is present
//		Click on button in “Java Script Confirm Box” section
//		Verify alert box with text “Press a button!” is present
//		Click on button in “Java Script Alert Box” section
//		Enter text in the alert box
//		Quit browser
		
		 setUp();
	        driver.manage().window().maximize();
	        driver.findElement(By.linkText("Alerts & Modals")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//a[@href='javascript-alert-box-demo.html']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	        Thread.sleep(1000);
	        
	        Alert alert = driver.switchTo().alert();
	        String text = alert.getText();
	        System.out.println(text);
	        alert.accept();
	        
	     // Handling confirmation Alert
	        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
	        Alert alert2= driver.switchTo().alert();
	        Thread.sleep(1000);
	        String text2=alert2.getText();
	        System.out.println(text2);
	        alert2.dismiss();
	        
	        
	     // Handling Prompt alerts/confirmation alerts by providing some confirmation
			// message.
	        
	        String name="Elvira";
	        driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
	        Alert alert3= driver.switchTo().alert();
	        Thread.sleep(1000);
	        String text3=alert3.getText();
	        alert3.sendKeys(name);
	        Thread.sleep(2000);
	        alert.accept();
	        
	        String text4 =driver.findElement(By.id("prompt-demo")).getText();
	        System.out.println("Text added to alert box:: "+text4);
	        
	        if (text4.contains(name)) {
				System.out.println("Text "+name+" was successfully added");
			}else{
				System.err.println("Text "+name+" was not entered");
			}
	        
	        
	        //1-findEle//2Alert obj  //3 getText SOP //4 acceptOrDismisse
	        
	        
	       
	        tearDown();
	        
		}

}
