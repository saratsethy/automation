package com.wipro.chc.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class InitalSettingTest {

	public static WebDriver driver ;

	
	public void initilize(){  //

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA372707\\Documents\\CHC\\Selenium Jars\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
	}
	
	public void Login()
	{
		driver.get("http://10.207.182.108:81/opencart/");
	}

  
  public String  Title()
	{
	  return driver.getTitle();
		
		
	}

}




