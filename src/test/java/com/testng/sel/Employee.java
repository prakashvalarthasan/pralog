package com.testng.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Employee {

	@Parameters({"userName","password"})
	@Test
	private void test(String s1 , String s2) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACHU\\workspace\\Class\\PralogTestng\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.id("email"));
	ele.sendKeys(s1);
	
	WebElement ps = driver.findElement(By.id("pass"));
	ps.sendKeys(s2);
		
	}

}
