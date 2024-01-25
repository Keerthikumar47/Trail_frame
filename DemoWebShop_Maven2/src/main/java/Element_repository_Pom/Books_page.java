package Element_repository_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books_page {
	@FindBy(xpath="//a[text()='Fiction EX']")
	private WebElement FictionEx;
	
	public Books_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getFictionEx() {
		return FictionEx;
	}

}
