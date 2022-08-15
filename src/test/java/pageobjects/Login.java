package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
public WebDriver driver;

public Login(WebDriver d) {
	
	driver=d;
	PageFactory.initElements(d,this);
}

@FindBy(xpath="//a[@class='ico-login']") WebElement selectlogin;
@FindBy(id="Email")WebElement enteremail;
@FindBy(id="Password")WebElement enterpassword;
@FindBy(xpath="//button[@class=\"button-1 login-button\"]") WebElement submitlogin;

public void selectlogin1() {
	selectlogin.click();
}

public void enteremail(String email) {
	enteremail.sendKeys(email);
}
public void enterpassword(String pwd) {
	enterpassword.sendKeys(pwd);
}
public void submitlogin() {
	submitlogin.click();
}

}
