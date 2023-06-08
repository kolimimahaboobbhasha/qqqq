package hook.packa;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.thoughtworks.qdox.parser.ParseException;

import Base.BaseClass;
import Utilities.Logutility;
import Utilities.Propertyutility;
import Utilities.WebDriverUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MinnHook {
	protected WebDriverUtility wlib=new WebDriverUtility();
	protected Propertyutility properties=new Propertyutility();
	Logutility log=new Logutility();
	WebDriver driver;
	
	
	@Before
	public void setBrowser(String Browser) throws IOException, ParseException
	{
		if(Browser.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
			
			}
		else if(Browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
	
	else if(Browser.equalsIgnoreCase("Internet Explorer"))
	{
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		}
	else if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			//log.info("successfully login");
			}
	else if(Browser.equalsIgnoreCase("IOS"))
	{
		WebDriverManager.safaridriver().setup();
		driver=new SafariDriver();
		}
	else {
		System.out.println("Invalid Browser");
	}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	   // driver.get(json.getDatafromJSON("URL"));
		driver.get(properties.getDataFroPropetyfile("URL"));
		//log.info("successfully login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Uname=driver.findElement(By.xpath("//input[@id='frmLogin_txtUserName']"));
		Uname.sendKeys(properties.getDataFroPropetyfile("USERNAME"));
		WebElement Pword=driver.findElement(By.xpath("//input[@id='frmLogin_txtUserName']"));
		Pword.sendKeys(properties.getDataFroPropetyfile("PASSWORD"));
		driver.findElement(By.xpath("//input[@id='frmLogin_btnLogin']")).click();
	}


		
	@After
	public void close(Scenario scenario) throws IOException
	{
		if(scenario.isFailed()) {
			String screenshot=BaseClass.webdriverUtility.takeScreenShot(BaseClass.driver, "basha");
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		BaseClass.driver.close();
	}
	

}
