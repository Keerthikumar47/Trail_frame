package Element_repository_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_cart_Computer_Order {
	
	@FindBy(xpath="//div[@class='center-1']/div/div[2]/div/form/table//td[1]//input")
	private WebElement Remove_checkbox;
	
	@FindBy(id="termsofservice")
	private WebElement TC_cHECKBOX;
	
	@FindBy(id="checkout")
	private WebElement Checkout_Button;
	
	public Shopping_cart_Computer_Order(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getRemove_chechbox() {
		return Remove_checkbox;
	}

	public WebElement getTC_cHECKBOX() {
		return TC_cHECKBOX;
	}

	public WebElement getCheckout_Button() {
		return Checkout_Button;
	}
	
	

}
