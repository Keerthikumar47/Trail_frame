package Element_repository_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Simple_Computer_page {
	
	@FindBy(xpath="//input[@name='product_attribute_75_5_31']")
	private WebElement Processor_chechbox;
	
	
	@FindBy(id="add-to-cart-button-75")
	private WebElement addToCart_button;
	
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement Shoppingcart_Link;
	
	public Simple_Computer_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getProcessor_chechbox() {
		return Processor_chechbox;
	}

	public WebElement getAddToCart_button() {
		return addToCart_button;
	}

	public WebElement getShoppingcart_Link() {
		return Shoppingcart_Link;
	}

}
