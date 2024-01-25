package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility {
	
	public int getRandomNumber() {
		Random r=new Random();
		return r.nextInt(1000);
	}
	
	public void toTakeScreeShot( WebDriver driver,String name) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		     File src = ts.getScreenshotAs(OutputType.FILE);
		     File trg=new File(FrameWorkConstants.ScreenShot_path+name+".png");
		     try {
				FileHandler.copy(src, trg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void acceptAlertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();;
	}
	
	public void dismissAlertPopup(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void SelectDropDownByIntIndex(WebElement dropdrown,int indexNum) {
		Select s=new Select(dropdrown);
		s.selectByIndex(indexNum);
	}
	
	public void SelectDropDownByVisibleText(WebElement dropdrown,String text) {
		Select s=new Select(dropdrown);
		s.selectByVisibleText(text);
	}
	
	public void SelectDropDownByValue(WebElement dropdrown,String value) {
		Select s=new Select(dropdrown);
		s.selectByValue(value);
	}
	
	public List<WebElement> SelectDropDownByAllOption(WebElement element) {
		Select s=new Select(element);
		return s.getAllSelectedOptions();
	}

}
