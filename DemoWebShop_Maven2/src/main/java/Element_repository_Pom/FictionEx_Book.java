package Element_repository_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionEx_Book {
	
	@FindBy(xpath="//input[@value='Add to wishlist']")
	private WebElement addToWishlist;
	
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlist;
	
	public FictionEx_Book(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToWishlist() {
		return addToWishlist;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

}
