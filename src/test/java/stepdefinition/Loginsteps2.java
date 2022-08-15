package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.Login2;

public class Loginsteps2 {
	public WebDriver driver;
	public Login2 l;
	
	@Given("Open chrome browser")
	public void open_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		l=new Login2(driver);
	   
	    
	}
	@When("Navigate to app url {string}")
	public void navigate_to_app_url(String appurl) {
	    driver.get(appurl);
	    
	}
	@Then("Enter credential username {string} password {string}")
	public void enter_credential_username_password(String name, String pwd) {
	 l.username(name);
	 l.password(pwd);
	    
	}
	@Then("Select login option")
	public void select_login_option() {
	    l.clicklogin();
	    
	}
	
	@Then("Navigate to Myinfo and click")
	public void navigate_to_myinfo_and_click() {
	    l.Clickmyinfo();
	}
	@Then("Click edit option and")
	public void click_edit_option_and() {
	    l.selecteditoption();
	}



	@Then("Close browser")
	public void close_browser() {
	    driver.quit();
	    
	}
}
