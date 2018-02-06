package com.wipro.chc.PageClass;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wipro.chc.Assignment.InitalSettingTest;

public class LoginPage {
	WebDriver driver =null ;
	
	By CreateAnAccount  = By.xpath("//*[@id='welcome']/a[2]");
	//String CreateAnAccount  = "//*[@id='welcome']/a[2]";
	By Firstname = By.name("firstname");
	By Lastname  = By.name("lastname");
	By Email = By.name("email");
	By Telephone = By.name("telephone");
	By Fax = By.name("fax");
	By Company = By.name("company");
	By CompanyID = By.name("company_id");
	By Address1  = By.name("address_1");
	By City				= By.name("city");
	By Post_code		= By.name("postcode");
	By Country			= By.name("country_id");
	By Religon_state	= By.name("zone_id");
	By Password			= By.name("password");
	By Conf_Password	= By.name("confirm");
	By Privacy_policy	= By.xpath("//input[@type='checkbox'][@name='agree']");
	By Continue			= By.xpath("//input[@type='submit'][@value='Continue']");
	By loginbuttom		=By.xpath("//input[@type='submit']");
	By loginlink		=By.xpath("//a[contains(text(),'login')]");

	public LoginPage( WebDriver driver) {
		// this.driver = driver;
		 this.driver= InitalSettingTest.driver;
	}
	
	public void CreateAnAccount() throws InterruptedException
	{
		
	 driver.findElement(CreateAnAccount).click();
		//driver.findElement(By.xpath("//*[@id='welcome']/a[2]")).click();
	// System.out.println("data for:"+CreateAnAccount);
	}
	
	public void PersonalDetails()
	{
		driver.findElement(Firstname).sendKeys("Sarat");
		driver.findElement(Lastname).sendKeys("sethy");
		driver.findElement(Email).sendKeys("sarsethy2@gmail.com");
		driver.findElement(Telephone).sendKeys("8008691993");
		driver.findElement(Fax).sendKeys("8888888");
	}
	
	public void Youraddress()
	{
		driver.findElement(Company).sendKeys("wipro");
		driver.findElement(CompanyID).sendKeys("12345");
		driver.findElement(Address1).sendKeys("Madhapur");
		driver.findElement(City).sendKeys("Hyderabad");
		driver.findElement(Post_code).sendKeys("500081");
		this.Contry();
		this.State();
		driver.findElement(Password).sendKeys("abcd");
		driver.findElement(Conf_Password).sendKeys("abcd");
		driver.findElement(Privacy_policy).click();
		driver.findElement(Continue).click();
	}
  public void Contry()
  {
	  WebElement Country_DropDown = driver.findElement(Country);
		Select select = new Select(Country_DropDown);
		select.selectByVisibleText("India");
		  
}
  public void State()
  {
	  WebElement Region_DropDown = driver.findElement(Religon_state);
		Select select = new Select(Region_DropDown);
		select.selectByVisibleText("Andhra Pradesh");
  }
  public String getPagetitle(){
		
		return driver.getTitle();
		
		}
  
  public void Userlogin()
	{
	  driver.findElement(loginlink).click();	
	  driver.findElement(Email).sendKeys("sarsethy2@gmail.com");
		driver.findElement(Password).sendKeys("abcd");
		driver.findElement(loginbuttom).click();
	}
}
