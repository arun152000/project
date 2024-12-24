package arun.Annan;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


@Test(groups="arun")

public class Madurai {
	@Test()
	

	public void Task1(){
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("DemoSalesManager");
		driver.findElement(By.cssSelector("#password")).sendKeys("crmsfa");

		driver.findElement(By.cssSelector(".decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
}