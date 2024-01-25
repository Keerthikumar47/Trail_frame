package Element_repository_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginIn {
	
	@FindBy(id="Email")
	private WebElement email_TextField;
	
	
	@FindBy(id="Password")
	private WebElement password_TextField;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement Login_Button;
	
	
	public LoginIn(WebDriver driver){
		PageFactory.initElements(driver, this);
	}


	public WebElement getEmail_TextField() {
		return email_TextField;
	}


	public WebElement getPassword_TextField() {
		return password_TextField;
	}


	public WebElement getLogin_Button() {
		return Login_Button;
	}

}
