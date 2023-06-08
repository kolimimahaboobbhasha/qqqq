//package StepDefenitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Step1 {
//	WebDriver driver;
//	@Given("Launch browser")
//	public void launch_browser() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//	}
//
//	@Then("launch url")
//	public void launch_url() {
//		driver.get("http:www.instagram.com");
//	}
//
//	@Then("enter username and password")
//	public void enter_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("click on login")
//	public void click_on_login() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//}
