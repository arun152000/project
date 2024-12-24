package arun.Annan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Kanan{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		
		//driver.findElement(By.id("username"));
		
		String ActualPageTitle = driver.getTitle();
		
		String Actualurl = driver.getCurrentUrl();
		
		System.out.println(Actualurl);
		System.out.println(ActualPageTitle);
		
		String ExpectedPageTitle = "HubSpot Login and Sign in";

		if (ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle))
		{
			driver.findElement(By.cssSelector("input[id='username'][type='email'][data-test-id='email-input-field']")).sendKeys("Kannathasan");

			driver.close();
			
		} else {
			System.out.println("Test - Page title is failed");
		}
	}
}
