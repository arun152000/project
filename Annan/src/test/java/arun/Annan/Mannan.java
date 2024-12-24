package arun.Annan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mannan {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://practicetestautomation.com/practice-test-login/");

		String ExpectedTitle = "Test Login | Practice Test Automation";

		String ActualTitle = driver.getTitle();

		if(ExpectedTitle.equalsIgnoreCase(ActualTitle))
		{
			driver.findElement(By.cssSelector("input[name=username][type=text")).sendKeys("student");
			driver.findElement(By.cssSelector("#password")).sendKeys("Password123");
			driver.findElement(By.cssSelector(".btn")).click();
			Thread.sleep(5000);

		} else {

			System.out.println("Page title validation is failed");
		}

		String ExpectedURL = "https://practicetestautomation.com/logged-in-successfully/";

		String ActualURL = driver.getCurrentUrl();

		if(ExpectedURL.equalsIgnoreCase(ActualURL))
		{
			Thread.sleep(3000);
			driver.findElement(By.linkText("Log out")).click();
			driver.close();

			
		} else 
		{
			System.out.println("The Page URL is not match so test cases is failed");
		}


	}

}
