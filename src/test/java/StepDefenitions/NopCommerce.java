package StepDefenitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

import POM.Pages.NOPlogin;
import Utilities.ListenersUtility;
import Utilities.Logutility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(ListenersUtility.class)
public class NopCommerce {
	WebDriver driver;
	public static WebDriver sdriver;
	NOPlogin app;
	//Home_page page;
	Logutility log;
//	@Before
//	public void beforehook()
//	{
//		System.out.println("Before Hook class");
//	}
//	@After
//	public void close() throws InterruptedException
//	{
//		driver.quit();
//		Thread.sleep(2000);
//		driver.close();
//	}
	
@Given("Nopcom url as {string}")
public void nopcom_url_as(String URL) {
	
 WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
 log=new Logutility();
 log.infomessage("Browser succefully launched");
  driver.manage().window().maximize();
  driver.get(URL);
  log.infomessage("Url succefully launched");
	
}

@Given("url page is launched")
public void url_page_is_launched() throws InterruptedException {
	String tittle=driver.getTitle();
	System.out.println(tittle);
	Thread.sleep(3000);
}

@When("Enter username as {string} and password as {string}")
public void enter_username_as_and_password_as(String username, String password)  {
//	WebElement uname=driver.findElement(By.xpath("//input[@id='Email']"));
//	uname.clear();
//	uname.sendKeys(username);
//	WebElement pword=driver.findElement(By.xpath("//input[@id='Password']"));
//	pword.clear();
//	pword.sendKeys(password);
	app=new NOPlogin(driver);
	app.getusername(username);
	app.getPassword(password);
	
    
}

@When("click on login button")
public void click_on_login_button() throws Exception {
    app=new NOPlogin(driver);
    app.noplogin();
//    page=new Home_page(driver);
//    page.getSYstem();
//    page.getsystemINFO();
//    page.getINFO();
	
	
	
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@When("nopC homepage is opened")
public void nop_c_homepage_is_opened() {
	//driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();	
	app=new NOPlogin(driver);
	app.noplogout();
}
@When("click on customers")
public void click_on_customers() {
	driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p/text()[1]")).click();
}
@Then("logout")
public void logout() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
