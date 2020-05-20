package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://instagram.com");

		String title = driver.getTitle();
		System.out.println("Main Page Title is::" + title);

		String parentWind = driver.getWindowHandle();
		System.out.println(parentWind);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@alt='Available on the App Store']")).click();

		driver.findElement(By.xpath("//img[@alt='Available on Google Play']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[target='_blank']")).click();

		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles.size()); // 2

		Iterator<String> it = allWindowHandles.iterator();

		while (it.hasNext()) {
			String handle = it.next();// Grab the next window handle
			if (!handle.equals(parentWind)) {// switch to next window only if not same as parent w
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(1000);
			}
		}

		driver.quit();

	}

}
