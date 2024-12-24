package arun.Annan;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Takescreenshot {
    @Test(groups="socket")
	public void ak() {
		// TODO Auto-generated method stub
		WebDriver obj=new ChromeDriver();
		obj.get("http://leaftaps.com/opentaps/control/main");
		obj.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot) obj;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement tss = obj.findElement(By.cssSelector(".decorativeSubmit"));
		File lo=tss.getScreenshotAs(OutputType.FILE);
		File lov=new File("./snaps/img1.png");
		try {
			FileHandler.copy(lo, lov);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
