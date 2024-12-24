package arun.Annan;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Akko {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		

		driver.manage().window().maximize();
		String Actual=driver.getTitle();
		System.out.println(Actual);
		String Expected= "Test Login | Practice Test Automation";
		if(Expected.equalsIgnoreCase(Actual)) {
			driver.findElement(By.cssSelector("input[name=username][type=text")).sendKeys("incorrectUser");
			driver.findElement(By.cssSelector("#password")).sendKeys("Password123");
			driver.findElement(By.cssSelector(".btn")).click();
			Thread.sleep(5000);
			driver.close();
		}else {
			System.out.println("failed");
		}
	}
}

