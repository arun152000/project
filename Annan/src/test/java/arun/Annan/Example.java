package arun.Annan;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement obj=driver.findElement(By.id("multiselect1"));
		Select ak=new Select(obj);
		if(ak.isMultiple()) {
			ak.selectByIndex(0);
			ak.selectByValue("audix");
			ak.selectByVisibleText("Swift");
			List<WebElement> arun=ak.getAllSelectedOptions();
			for(WebElement akk:arun)
				System.out.println(akk.getText());
			ak.deselectByIndex(0);
			List<WebElement>akkk=ak.getAllSelectedOptions();
			for(WebElement objj:akkk)
				System.out.println(objj.getText());
		}
		
		
		
	
	}
		

}
