package Element_repository_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computers_page {
	
	@FindBy(xpath="(//a[@href='/desktops'])[3]")
	private WebElement Destops_link;
	
	@FindBy(xpath="(//h2[@class='product-title'])[6]/a")
	private WebElement Simple_Computer;
	
	public Computers_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getDestops_link() {
		return Destops_link;
	}

	public WebElement getSimple_Computer() {
		return Simple_Computer;
	}
	

}
