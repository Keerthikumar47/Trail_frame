package testScripts;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

public class Demo_2_shop_add_to_cart extends BaseTest {
@Test(groups = "System")
	public void addtocart() throws InterruptedException, EncryptedDocumentException, IOException {
//	launchTheBrowser();
//	register();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
	//System.out.println("Demo Web Shop page is displayed");
	Reporter.log("Demo Web Shop page is displayed.",true);
//	if(driver.getTitle().equals("Demo Web Shop")) {
//		System.out.println("Demo Web Shop page is displayed");
//	}
//	else {
//		System.out.println("Demo Web Shop page is not displayed");
//	}		
		
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Digital downloads");
		System.out.println("Demo Web Shop. Digital downloads page is displayed");
//		if(driver.getTitle().equals("Demo Web Shop. Digital downloads")) {
//			System.out.println("Demo Web Shop. Digital downloads page is displayed");
//		}
//		else {
//			System.out.println("Demo Web Shop. Digital downloads page isnot displayed");
//		}
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"center-2\"]//div/div/div/div[3]/div[2]/input"));
		Thread.sleep(2000);
		for (WebElement webElement : all) {
			webElement.click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
		System.out.println("Demo Web Shop. Shopping Cart page is displayed");
//		if(driver.getTitle().equals("Demo Web Shop. Shopping Cart")) {
//			System.out.println("Demo Web Shop. Shopping Cart page is displayed");
//		}
//		else {
//			System.out.println("Demo Web Shop. Shopping Cart page isnot displayed");
//		}
			 driver.findElement(By.xpath("//div[@class='center-1']/div/div[2]/div/form/table//td//input[1]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//div[@class='center-1']/div/div[2]/div/form/table//td//input)[3]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//div[@class='center-1']/div/div[2]/div/form/table//td//input)[5]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.name("updatecart")).click();
			 System.out.println("Add to cart Testcase is passed");
//			 logout();
//			 Close();
		
			
}}
	
		

	


