package arun.Annan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropby {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		WebElement obj = driver.findElement(By.id("form:conpnl_header"));
		Actions as=new Actions(driver);
		Thread.sleep(4000);
		as.dragAndDropBy(obj, 200, 0).perform();
		Thread.sleep(4000);
		driver.close();

		

	}

}
