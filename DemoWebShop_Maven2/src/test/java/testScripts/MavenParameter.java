package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenParameter {
	
	@Test
	public void testCase() {
		String url=System.getProperty("Url");
		String email=System.getProperty("Email");
		String password=System.getProperty("Password");
		System.out.println(email);
		System.out.println(password);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

}
