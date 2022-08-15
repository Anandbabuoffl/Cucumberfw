package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import pageobjects.Login;

public class Loginsteps {
	public WebDriver driver;
	public Login l;

	@Given("open chrome browser")
	public void open_chrome_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   l=new Login(driver);
	    
	}

	@When("launch app url and select login option")
	public void launch_app_url_and_select_login_option() {
	   driver.get("https://demo.nopcommerce.com/");
	   l.selectlogin1();
	    
	}

	@Then("Enter email {string} and password {string}")
	public void enter_email_and_password(String email, String password) {
	   l.enteremail(email);
	   l.enterpassword(password);
	    
	}

	@Then("click the login")
	public void click_the_login() {
	   
	    l.submitlogin();
	}

	
	@Then("Verify the app wheather app logged in or not")
	public void verify_the_app_wheather_app_logged_in_or_not() {
	String pagetitle=driver.getTitle();
    System.out.println(pagetitle);
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	    
	}

}
