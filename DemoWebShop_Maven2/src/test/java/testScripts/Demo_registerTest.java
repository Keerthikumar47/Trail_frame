package testScripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Element_repository_Pom.Home_page_demo;
import Element_repository_Pom.Register_page;
import genericLibrary.BaseTest;
import genericLibrary.CommonUtility;
import genericLibrary.Data_Utility;



public class Demo_registerTest {
 
	 
	@Test(dataProvider = "Register")
	public void registration(String firstname,String lastname,String email,String password,String confirmPassword) throws EncryptedDocumentException, IOException, InterruptedException {
		CommonUtility common=new CommonUtility();
		String modify = common.getRandomNumber()+email;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Data_Utility data=new Data_Utility();
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Demo Web Shop");
		System.out.println("Demo webshop home page is dispayed");
		
		Register_page rp=new Register_page(driver);
		Home_page_demo hp=new Home_page_demo(driver);
		
		hp.getRegistrationLink().click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register");
		Reporter.log("Demo Web Shop. Register",true);
		
		rp.getMaleRadioButton().click();
		rp.getFirstNameTextField().sendKeys(firstname);
		rp.getLastNameTextField().sendKeys(lastname);
		rp.getEmailTextField().sendKeys(modify);
		rp.getPasswordTextField().sendKeys(password);
		rp.getConfirmPasswordTextField().sendKeys(confirmPassword);
		Thread.sleep(1000);
		rp.getRegisterButton().click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register");
		Reporter.log("Demo Web Shop. Register",true);
		
		

	}
	@DataProvider(name="Register")
	public Object[][] datasupply() throws EncryptedDocumentException, IOException{
		return Data_Utility.getAllDataFromExcel("Sheet1");
	}
	
////	// this is use to use different data for the same script using data provider
//	

}










