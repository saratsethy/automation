package com.wipro.chc.Order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wipro.chc.Assignment.InitalSettingTest;

public class Orderhistory {
	
	WebDriver driver;
	public Orderhistory(WebDriver driver){
		
		 this.driver= InitalSettingTest.driver;
	}
		
		public void loginToOpenCart(){
			
			driver.findElement(By.linkText("login")).click();
			driver.findElement(By.name("email")).sendKeys("sarsethy1@gmail.com");
			driver.findElement(By.name("password"));
			
			
			
			
			
		}

}
