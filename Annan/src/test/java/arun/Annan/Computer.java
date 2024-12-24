package arun.Annan;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Computer {
	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			String ActualURL = driver.getCurrentUrl();
			System.out.println(ActualURL);
			String Actual=driver.getTitle();
			System.out.println(Actual);
			WebElement SaucePwd = driver.findElement(By.id("password"));
			WebElement SauceEmail = driver.findElement(with(By.tagName("input")).above(SaucePwd));
			SauceEmail.sendKeys("standard_user");
			WebElement SauceID = driver.findElement(By.name("user-name"));
			WebElement SaucePwdid = driver.findElement(with(By.tagName("input")).below(SauceID));
			SaucePwdid.sendKeys("secret_sauce");
			driver.findElement(By.cssSelector("#login-button")).click();
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
			driver.findElement(By.cssSelector(".shopping_cart_badge")).click();
			driver.findElement(By.name("checkout")).click();
			driver.findElement(By.cssSelector(".input_error.form_input")).sendKeys("Vallinayagam");
			driver.findElement(By.name("lastName")).sendKeys("S");
			driver.findElement(By.name("postalCode")).sendKeys("625004");
			driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
			String Task =driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")).getText();
			System.out.println(Task);
			driver.findElement(By.name("finish")).click();
			String Ak=driver.findElement(By.cssSelector(".complete-header")).getText();
			System.out.println(Ak);
			driver.quit();
	}

}
