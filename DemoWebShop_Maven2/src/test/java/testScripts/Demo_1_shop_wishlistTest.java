package testScripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Element_repository_Pom.Books_page;
import Element_repository_Pom.FictionEx_Book;
import Element_repository_Pom.Home_page_demo;
import Element_repository_Pom.WishList_Book;
import genericLibrary.BaseTest;
import genericLibrary.Data_Utility;

@Listeners(genericLibrary.ListernsImplementation.class)
public class Demo_1_shop_wishlistTest  extends BaseTest {
@Test(groups = "System")

	public void wishlist()throws InterruptedException, EncryptedDocumentException, IOException {

	Books_page bp=new Books_page(driver);
	Home_page_demo hm=new Home_page_demo(driver);
	FictionEx_Book fb=new FictionEx_Book(driver);
	WishList_Book wb=new WishList_Book(driver);
	
	hm.getBook().click();

	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books");
	Reporter.log("Demo Web Shop page is displayed",true);
		
		WebElement book = bp.getFictionEx();
		
		String product = book.getText();
		System.out.println(product);
		book.click();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Fiction EX");
		
		Reporter.log("Demo Web Shop. Fiction EX page is displayed",true);
		Thread.sleep(2000);
		fb.getAddToWishlist().click();
		
		Thread.sleep(2000);
		fb.getWishlist().click();
		
		Thread.sleep(2000);	
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist");
		Reporter.log("Demo Web Shop. Wishlist page is displayed",true);
		
     	WebElement all = wb.getFictionEx_text();
	
		
		Assert.assertEquals(all.getText(),"Fiction EX");
	Reporter.log("Adding book to wishlist test case is passed",true);
	
	wb.getCheckBox_wishlist().click();
		wb.getUpdatecart_wishlist().click();
			
		

	}

}
