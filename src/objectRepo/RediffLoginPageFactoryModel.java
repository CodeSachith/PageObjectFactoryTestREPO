package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactoryModel {
	
	 
	//local driver
	WebDriver driver ;
	
	//constructor definition - to be used to create objects in the test classes
	public RediffLoginPageFactoryModel(WebDriver driver)
	{
		/*
		 * this.driver refers to the local driver. 
		 * driver value passed when creating the object is assigned to this local driver
		 * 
		 */
		
		this.driver = driver;
		
		//
		PageFactory.initElements(driver, this);
	}
	
	//define html objects in the page in page factory model
	
	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;
	
	@FindBy(name = "passwd")
	WebElement passWord;
	
	@FindBy(name = "proceed")
	WebElement btnGo;
	
	@FindBy(linkText = "Home")
	WebElement lnkHome;
	
	
	// define the method to use object in page factory model
	public WebElement EmailId() 
	{
		return username;
	}
	
	public WebElement PassWord() 
	{
		return passWord;
	}
	
	public WebElement BtnGo() {
		
		return btnGo;
	}
	
	public WebElement LnkHome() {
		
		return lnkHome;
	}
	


}
