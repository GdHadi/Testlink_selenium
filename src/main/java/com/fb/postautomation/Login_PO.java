package com.fb.postautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;

public class Login_PO {
	WebDriver driver;
		
	//elements
	By input_mail = By.xpath("//*[@id=\\'usernameOrEmail\\']");
	By next_btn = By.xpath("//*[@id=\"primary\"]/div/main/div[2]/div[1]/div/form/div[1]/div[2]/button");
	By input_pass = By.xpath("//*[@id=\'password\']");
	By login_btn = By.xpath("//*[@id=\'primary\']/div/main/div[2]/div[1]/div/form/div[1]/div[2]/button");
	//By homepage = By.id("");
	
	public void Login(WebDriver driver) {
		this.driver=driver;
	}
	//actions
	public void input_mail() {
		driver.findElement(input_mail).sendKeys("gdhadi");
	}
	public void next_btn() {
		driver.findElement(next_btn).click();
	}
	public void input_pass() {
		driver.findElement(input_pass).sendKeys("admin54321");
	}
    public void login_btn() {
	driver.findElement(login_btn).click();
	}
		
	//assertions
	//public void success_login () {
	//	Assert.assertTrue(driver.findElement(homepage).isDisplayed());

	//}
}
