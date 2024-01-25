package genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	Data_Utility data=new Data_Utility();
	 public CommonUtility cu=new CommonUtility();
	public WebDriver driver;
	public static WebDriver listernsDriver;
	@Parameters("Browser")
	@BeforeClass(alwaysRun = true)
	public void launchTheBrowser(@Optional("Chrome") String BrowserName) throws EncryptedDocumentException, IOException {
		if(BrowserName.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if (BrowserName.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		 listernsDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data.getDataFromExcel("Sheet1", 0, 1));
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		System.out.println("Demo Web Shop is displayed");
	}
	@BeforeMethod(alwaysRun = true)
	public void register() throws EncryptedDocumentException, IOException {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(data.getDataFromExcel("Sheet1", 1, 1));
		driver.findElement(By.id("Password")).sendKeys(data.getDataFromExcel("Sheet1", 2, 1)); 	
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod(alwaysRun = true)
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	@AfterClass(alwaysRun = true)
	public void Close() {
		driver.close();
	}

}
