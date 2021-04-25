package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
	@Parameters("browserName")
	@Test
	private void test1(String browser) {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACHU\\workspace\\Class\\PralogTestng\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\ACHU\\workspace\\Class\\PralogTestng\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

	}
}
