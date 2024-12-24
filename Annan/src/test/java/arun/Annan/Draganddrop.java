package arun.Annan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement scr = driver.findElement(By.id("form:drag_content"));

		WebElement target = driver.findElement(By.id("form:drop_content"));
		Actions as=new Actions(driver);
		Thread.sleep(5000);
		as.dragAndDrop(scr, target).perform();
		
		




	}

}
