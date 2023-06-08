package POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	WebDriver driver;
	public Home_page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//body/div[@class='wrapper']/aside[@class='main-sidebar sidebar-dark-primary elevation-4 sidebar-focused']/div[@class='sidebar os-host os-theme-light os-host-resize-disabled os-host-scrollbar-horizontal-hidden os-host-scrollbar-vertical-hidden os-host-transition']/div[@class='os-padding']/div[@class='os-viewport os-viewport-native-scrollbars-invisible']/div[@class='os-content']/nav[@class='mt-2']/ul[@role='menu']/li[8]/a[1]")
	private WebElement system;
	@FindBy(xpath="//body/div[@class='wrapper']/aside[@class='main-sidebar sidebar-dark-primary elevation-4 sidebar-focused']/div[@class='sidebar os-host os-theme-light os-host-resize-disabled os-host-transition os-host-scrollbar-horizontal-hidden os-host-scrollbar-vertical-hidden']/div[@class='os-padding']/div[@class='os-viewport os-viewport-native-scrollbars-invisible']/div[@class='os-content']/nav[@class='mt-2']/ul[@role='menu']/li[8]/a[1]")
	private WebElement systeminfo;
	@FindBy(xpath="//div[@class='card-body']")private WebElement info;
//	
//	public WebElement getSystem() {
//        
//		return system;
//	}
//	public WebElement getSysteminfo() {
//	
//		return systeminfo;
//	}
//	public WebElement getInfo() {
//		return info;
//	}
	
	public void getSYstem() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-cube']"));
		//system.click();
	}
	public void getsystemINFO() throws InterruptedException
	{
		Thread.sleep(3000);
		systeminfo.click();
	}
	public void getINFO()
	{
		String text=info.getText();
		System.out.println(text);
	}
}
