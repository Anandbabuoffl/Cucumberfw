package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {
	
	public WebDriver driver;
	
	public Login2(WebDriver d) {
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	@FindBy(id="txtUsername") WebElement username;
	@FindBy(id="txtPassword") WebElement password;
	@FindBy(id="btnLogin") WebElement clicklogin;
	@FindBy(id="menu_pim_viewMyDetails")WebElement Clickmyinfo;
	@FindBy(xpath="//*[@id=\"btnSave\"]")WebElement selecteditoption;
	
	
	public void username(String name) {
		username.sendKeys(name);
	}

	public void password(String pwd) {
		password.sendKeys(pwd);
	}
	public void clicklogin() {
		clicklogin.click();
	}
	public void Clickmyinfo() {
		Clickmyinfo.click();
	}
	public void selecteditoption() {
		selecteditoption.click();
	}

}
