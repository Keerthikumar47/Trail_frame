package Element_repository_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_demo {
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registrationLink;

	@FindBy(xpath="//div[@class='header-menu']/ul/li[1]/a[1]")
	private WebElement Book;
	
	@FindBy(xpath="//div[@class='header-menu']/ul[1]/li[2]/a")
	private WebElement Computers;
	
	@FindBy(xpath="///div[@class='header-menu']/ul[1]/li[5]/a")
	private WebElement DigitalDowload;
	
	public WebElement getComputers() {
		return Computers;
	}

	public WebElement getDigitalDowload() {
		return DigitalDowload;
	}

	public WebElement getBook() {
		return Book;
	}

	public Home_page_demo(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getRegistrationLink() {
		return registrationLink;
	}

}
