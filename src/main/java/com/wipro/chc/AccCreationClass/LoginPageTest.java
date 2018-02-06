package com.wipro.chc.AccCreationClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wipro.chc.Assignment.InitalSettingTest;
import com.wipro.chc.PageClass.LoginPage;
import com.wipro.chc.PageClass.SamsungGalPage;

public class LoginPageTest {
	LoginPage loginPage;
	
	WebDriver driver;
	@BeforeTest
	public void inialization()
	{
		WebDriver driver=null;
	//	driver= InitalSettingTest.driver;
		InitalSettingTest IntTest =PageFactory.initElements(driver, InitalSettingTest.class);
		IntTest.initilize();
		IntTest.Login();
		Assert.assertEquals("Your Store",IntTest.Title());
	}
	@Test
	public void account() throws InterruptedException{
		
		//LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		loginPage = new LoginPage(driver);
		loginPage.CreateAnAccount();
		loginPage.PersonalDetails();
		loginPage.Youraddress();
	    Assert.assertEquals("Register Account",loginPage.getPagetitle());

} 
	@Test(priority=1)
   public void SamsungGalaxy() throws InterruptedException
   {
	   SamsungGalPage SamPage =PageFactory.initElements(driver, SamsungGalPage.class);
	   loginPage.Userlogin();
	   SamPage.gotoHomePage();
	   
	   SamPage.ClickSamsungGalaxy();
	   SamPage.Review();
	   
	   SamPage.AddToWishList();
	   
	  SamPage.Add2Cart();
	   
}
}

