package StepDefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sandhya {
	WebDriver driver;
	@Given("sandhya browser")
	public void sandhya_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}

	@And("sandhya url")
	public void sandhya_url() {
		driver.get("https://in.pinterest.com/login/");
		driver.manage().window().maximize();
	}

	@When("sandhya username as {string} and password as {string}")
	public void sandhya_username_as_and_password_as(String username, String password) {
		driver.findElement(By.cssSelector("#email")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
	}
	@And("sandhya login")
	public void sandhya_login() {
		driver.findElement(By.xpath("//div[text()=\"Log in\"]")).click();
	}
	@And("click on other image")
	public void click_on_other_image() throws InterruptedException {
	
		driver.findElement(By.xpath("//input[@data-test-id='search-box-input']")).click();
		
		WebElement search= driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("basha");
//		search.sendKeys(Keys.ENTER);
//		System.out.println("image download");
		System.out.println("Anusha");
		
	}
	@Then("download new image")
	public void download_new_image() {
			String tittle=driver.getTitle();
			System.out.println(tittle);

	}

@Given("like the image")
public void like_the_image() {
	System.out.println("like the image");
}
}
