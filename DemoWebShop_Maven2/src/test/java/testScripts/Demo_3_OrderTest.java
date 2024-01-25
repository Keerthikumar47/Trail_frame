package testScripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Element_repository_Pom.Computers_page;
import Element_repository_Pom.Home_page_demo;
import Element_repository_Pom.Shopping_cart_Computer_Order;
import Element_repository_Pom.Simple_Computer_page;
import genericLibrary.BaseTest;

public class Demo_3_OrderTest extends BaseTest {
@Test(groups = "System")
	public void Order() throws InterruptedException, EncryptedDocumentException, IOException {

	Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
	Reporter.log("Demo Web Shop page is diaplayed",true);

	Home_page_demo hp=new Home_page_demo(driver);
	Computers_page cp=new Computers_page(driver);
	Simple_Computer_page sp=new Simple_Computer_page(driver);
	Shopping_cart_Computer_Order shopperPage=new Shopping_cart_Computer_Order(driver);
		
	    hp.getComputers().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers");
		Reporter.log("Demo Web Shop. Computers",true);

	      cp.getDestops_link().click();
	     Thread.sleep(2000);
	       Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops");
		 Reporter.log("Demo Web Shop. Desktops",true);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(4000);
		cp.getSimple_Computer().click();


		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Simple Computer");
		Reporter.log("Demo Web Shop. Simple Computer",true);


		sp.getProcessor_chechbox().click();

		Thread.sleep(2000);
		sp.getAddToCart_button().click();
		
		Thread.sleep(3000);
		sp.getShoppingcart_Link().click();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
		Reporter.log("Demo Web Shop. Shopping Cart",true);
		
		shopperPage.getRemove_chechbox().click();
	
		Thread.sleep(2000);
		shopperPage.getTC_cHECKBOX().click();
		
		Thread.sleep(2000);
		shopperPage.getCheckout_Button().click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Checkout");
		Reporter.log("Demo Web Shop. Checkout",true);
		
		
		
	}

}
