package hook.packa;
/**
 * 
 * @author Nitheesha
 *
 */

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.BaseClass;
import Utilities.Propertyutility;
import Utilities.WebDriverUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

//public class Hook extends BaseClass{
//	
//	public static final String USERNAME = "nitheshdemo1";
//	public static final String AUTOMATE_KEY = "g4dQq823QMsLNUFrbzX3";
//	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
//	BaseClass base;
//	public Hook(BaseClass base) {
//		this.base=base;
//	}
//
//	@Before
//	public void setUp() throws Throwable {
//		BaseClass.propertyFileUtility=new Propertyutility();
//		BaseClass.propertyFileUtility.getDataFroPropetyfile(AUTOMATE_KEY);
//		BaseClass.webdriverUtility=new WebDriverUtility();
//		String browser=BaseClass.propertyFileUtility.getDataFroPropetyfile(AUTOMATE_KEY);
//		String remote=BaseClass.propertyFileUtility.getDataFroPropetyfile(browser);
//		//String browser=System.getProperty("BROWSER");
//		if(remote.equals("none")) {
//		if(browser.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			BaseClass.driver=new ChromeDriver();
//		}else if(browser.equals("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			BaseClass.driver=new FirefoxDriver();
//		}
//		}else if(remote.equals("ios")){
//			DesiredCapabilities cap=new DesiredCapabilities();
//			cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
//			cap.setCapability("browser_version", "49");
//			cap.setCapability("os", "Windows");
//			cap.setCapability("os_version", "XP");
//			cap.setCapability("build", "build 1.0");
//			cap.setCapability("name", "My First test run in windows xp");
//			
//			BaseClass.driver=new RemoteWebDriver(new URL(URL), cap);
//		}
//		
//		BaseClass.driver.manage().window().maximize();
//	//	BaseClass.driver.manage().timeouts().implicitlyWait(BaseClass.propertyFileUtility.getDataFroPropetyfile("")), TimeUnit.SECONDS);
//		BaseClass.driver.get(BaseClass.propertyFileUtility.getDataFroPropetyfile("URL"));
//	}
//	
//	@After
//	public void tearDown(Scenario scenario) {
//		if(scenario.isFailed()) {
//			byte[] screenshot=base.webdriverUtility.takeScreenShot(base.driver);
//			scenario.attach(screenshot, "image/png", scenario.getName());
//		}
//		base.driver.close();
//	}

