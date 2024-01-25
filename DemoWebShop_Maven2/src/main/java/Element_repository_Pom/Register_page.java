package Element_repository_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page {
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	
	
	@FindBy(name="FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(name="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id="Email")
	 private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField; 
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	public Register_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

}
