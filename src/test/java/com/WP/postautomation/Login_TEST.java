package com.WP.postautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_TEST {
	 private ChromeDriver driver;
	

@BeforeMethod
	public void initiate_driver () {
	System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
@Test
	public void login() throws InterruptedException {		
	driver = new ChromeDriver();
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
 