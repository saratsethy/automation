package com.wipro.chc.PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wipro.chc.Assignment.InitalSettingTest;

public class SamsungGalPage {
	
	WebDriver driver;
	
	By home	= By.xpath("//*[@id='header']/div[5]/a[1]");
	By SumsangGalaxy = By.xpath("//a[@href='index.php?route=product/product&path=57&product_id=49']");
	By ClickReview		= By.linkText("Write a review");
	By Review			= By.name("name");
	By YourReview			= By.xpath(" //textarea[@name='text']");
	By Rating				= By.xpath(" //input[@type='radio'][@value='5']");
	By successMessage		= By.xpath("//*[@id='tab-review']/div[2]");
	By Add2wishList			= By.linkText("Add to Wish List");
	By WishsuccessMsg		= By.xpath("//*[@id='notification']/div");
	By WishsuccessMsgClose= By.xpath("//*[@id='notification']/div/img");
	By WishListTotal		= By.id("wishlist-total");
	By PoundSterling		= By.xpath("//a[@title='Pound Sterling']");
	By DollarSterling		= By.xpath("//a[@title='US Dollar']");
	By EuroSterling			= By.xpath("//a[@title='Euro']");
	By Unitprice			= By.xpath("//*[@class='wishlist-info']/table/tbody[1]/tr/td[5]");
//	By Add2cart				= By.xpath("//*[@class='wishlist-info']/table/tbody[1]/tr/td[6]/img");
	By Add2cart				= By.xpath("//*[contains(text(),'Add to Wish List')]");
	By RemoveWishList		= By.xpath("//img[@src='catalog/view/theme/default/image/remove.png']");
	By Add2CartSuccess		= By.xpath("//div[@class='success']");
	By close			= By.xpath("//img[@src='catalog/view/theme/default/image/close.png']");
	By ContinueButton		= By.linkText("Continue");
	By LogOut				= By.linkText("Logout");
	By Logoutmessage			= By.xpath("//*[@id='content']/p[1]"); 
	
	
	public SamsungGalPage(WebDriver driver){
		 this.driver= InitalSettingTest.driver;
	}

	public void gotoHomePage(){
		driver.findElement(home).click();
	}

	public void ClickSamsungGalaxy(){
		
		driver.findElement(SumsangGalaxy).click();
	}
	
	public void Review() {
		
		driver.findElement(ClickReview).click();
		driver.findElement(Review).sendKeys("Good");
		driver.findElement(YourReview).sendKeys("ababbabababaaaaaaaaaaaaaaaaaaaaaaaaa");
		driver.findElement(Rating).click();
		driver.findElement(ContinueButton).click();
		
		System.out.println(driver.findElement(successMessage).getText());
		}
	
	public void AddToWishList() throws InterruptedException{
		
		driver.findElement(Add2wishList).click();
		Thread.sleep(2000);
		String Success_Msg = driver.findElement(WishsuccessMsg).getText();
		System.out.println(Success_Msg);
		Thread.sleep(2000);
		driver.findElement(WishsuccessMsgClose).click();
	}
	
	
public void VerifyWishList(){
		
		driver.findElement(WishListTotal).click();
		String WishListCount = driver.findElement(WishListTotal).getText();
		int WishListCountInt = Integer.parseInt(WishListCount.replaceAll("[^0-9]", ""));
		System.out.println(WishListCountInt);
		driver.findElement(PoundSterling).click();
		String PriceList = driver.findElement(Unitprice).getText();
		System.out.println(PriceList);	
	}
	
	public void Add2Cart(){
		System.out.println("Add to  cart");
		driver.findElement(Add2cart).click();
		String Success_Msg = driver.findElement(WishsuccessMsg).getText();
		System.out.println(Success_Msg);
		driver.findElement(By.xpath("//*[@id='wishlist-total']")).click();
		driver.findElement(RemoveWishList).click();
			
		driver.findElement(ContinueButton).click();
	
		driver.findElement(LogOut).click();
		System.out.println(driver.findElement(Logoutmessage).getText());
	
	}
	
}
