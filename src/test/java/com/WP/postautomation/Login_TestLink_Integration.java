package com.WP.postautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testlink.api.java.client.TestLinkAPIResults;

public class Login_TestLink_Integration {
	@BeforeMethod
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
	}
	@Test (priority =1)
	public void accessApplicationURL() throws Exception {
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1200x600");
			
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://qatesting123.wordpress.com/wp-admin");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			//actions
			driver.findElement(By.id("usernameOrEmail13")).sendKeys("gdhadi");
			driver.findElement(By.className("login__form-action")).click();
			driver.findElement(By.id("password")).sendKeys("admin54321");
			driver.findElement(By.className("login__form-action")).click();
			//assert
			Assert.assertEquals("Log Masuk — WordPress.com", driver.getTitle());
			//driver quit
			driver.quit();
			
     	   TestLinkUtils.reportResult("SEL-INT-1", null, TestLinkAPIResults.TEST_PASSED);
      } catch (AssertionError e) {
     	 TestLinkUtils.reportResult("SEL-INT-1", e.getMessage(), TestLinkAPIResults.TEST_FAILED);
     	 //Below line will fail Selenium test case as well, comment it if you don't want it to fail
     	 throw new Exception(e);
      } catch (Exception e) {
      	 TestLinkUtils.reportResult("SEL-INT-1", e.getMessage(), TestLinkAPIResults.TEST_FAILED);
      	       	
       }
	}

}
 