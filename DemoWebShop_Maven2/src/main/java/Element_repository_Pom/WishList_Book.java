package Element_repository_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList_Book {
	
	
	@FindBy(xpath="//a[text()='Fiction EX']")
	private WebElement FictionEx_text;
	
	

	@FindBy(name="removefromcart")
	private WebElement checkBox_wishlist;
	
	
	@FindBy(xpath="//input[@name='updatecart']")
	private WebElement updatecart_wishlist;
	
	public WishList_Book(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckBox_wishlist() {
		return checkBox_wishlist;
	}

	public WebElement getUpdatecart_wishlist() {
		return updatecart_wishlist;
	}
	public WebElement getFictionEx_text() {
		return FictionEx_text;
	}

}

