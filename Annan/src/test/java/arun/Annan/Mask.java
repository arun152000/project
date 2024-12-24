package arun.Annan;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement obj=driver.findElement(By.cssSelector("#multiselect1"));
		Select ak=new Select(obj);
		List<WebElement> options=ak.getOptions();
		for(WebElement option : options)
			System.out.println(option.getText());
		if (ak.isMultiple()) {
			ak.selectByIndex(0);
			Thread.sleep(4000);
			ak.selectByValue("audix");
			Thread.sleep(4000);
			ak.selectByVisibleText("Swift");
			Thread.sleep(4000);
			List<WebElement> selectedOptions = ak.getAllSelectedOptions();

			for (WebElement selectedOption : selectedOptions)
				System.out.println(selectedOption.getText());
			ak.deselectByVisibleText("Volvo");
			Thread.sleep(2000);
			List<WebElement> selectedOptionsAfterDeselect = ak.getAllSelectedOptions();

			for (WebElement selectedOptionAfterDeselect : selectedOptionsAfterDeselect)
				System.out.println(selectedOptionAfterDeselect.getText());
			Thread.sleep(4000);
			ak.deselectAll();
			driver.close();
		}
		else {
			System.out.println("not multi select drop down");
		}
	}
}
		

		
