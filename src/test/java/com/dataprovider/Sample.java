package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {

	@DataProvider(name = "example")
	public Object[][] datas() {

		return new Object[][] {

				{ "benny", "benny123" }, { "abu", "abu123" }, { "bob", "bob123" } };

	}

	@Test(dataProvider = "example")
	public void test1(String x, String y) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACHU\\workspace\\Class\\PralogTestng\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys(x);
		
		WebElement ps = driver.findElement(By.id("pass"));
		ps.sendKeys(y);
	}

}
