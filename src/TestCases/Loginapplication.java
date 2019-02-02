package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepo.RediffLoginPageFactoryModel;

public class Loginapplication {
	
	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachith\\Downloads\\jars for selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//creating the RediffLoginPage object to use the html objects in the login page for the Login() test case
		
		/*
		 * driver is created in the test case class.
		 * this need to be passed to RediffLoginPage class to use as the driver.
		 * this can be done by passing the driver as a parameter when defining the RediffLoginPage object.
		 * to do that, when creating the RediffLoginPage class, constructor should be written such that it accepts WebDriver as an argument and assign it to its local driver
		 */
		
		RediffLoginPageFactoryModel page1 = new RediffLoginPageFactoryModel(driver);
		
		page1.EmailId().sendKeys("email@abc.com");
		
		page1.PassWord().sendKeys("password");
		
		page1.BtnGo().click();
		
		page1.LnkHome().click();
		
		
		
		
		driver.close();

	}

}
