package arun.Annan;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rc = driver.findElement(By.xpath("//span[contains(@class,'context-menu')]"));
		
		Actions builder= new Actions(driver);
		
		//builder.contextClick(driver.findElement(By.xpath("//span[contains(@class,'context-menu')]"))).perform();

		builder.contextClick(rc).perform();


	}

}
