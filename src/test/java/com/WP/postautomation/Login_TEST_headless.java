package com.WP.postautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_TEST_headless {

@BeforeMethod
	public void initiate_driver () {
	System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
	}

@Test
	public void login() throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("headless");
	options.addArguments("window-size=1200x600");
		
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://qatesting123.wordpress.com/wp-admin");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//actions
	driver.findElement(By.id("usernameOrEmail")).sendKeys("gdhadi");
	driver.findElement(By.className("login__form-action")).click();
	driver.findElement(By.id("password")).sendKeys("admin54321");
	driver.findElement(By.className("login__form-action")).click();
	//assert
	Assert.assertEquals("Log Masuk — WordPress.com", driver.getTitle());
	//driver quit
	driver.quit();
	 }
    }
 