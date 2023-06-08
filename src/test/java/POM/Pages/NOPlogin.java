package POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NOPlogin {
 WebDriver driver;

	@FindBy(xpath="//input[@id='Email']")
	private WebElement Uname;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement Pword;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login;
	@FindBy(xpath="//a[normalize-space()='Logout']")
	private WebElement Logout;

	
	public NOPlogin(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getusername(String username) {
		Uname.clear();
		Uname.sendKeys(username);	
	}
	public void getPassword(String password) 
	{
		Pword.clear();
		Pword.sendKeys(password);
	}
	public void noplogin()
	{
		Login.click();
	}
	public void noplogout()
	{
		Logout.click();
	}
	

	
}
